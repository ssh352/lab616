// SimpleClient.cpp -- IB TWS client.
#include "SimpleClient.h"

#include <arpa/inet.h>
#include <errno.h>
#include <sys/select.h>

#include <trading/trades.pb.h>

#include "EPosixClientSocket.h"
#include "Contract.h"
#include "Order.h"

// helpers
inline bool SocketsInit() { return true; };
inline bool SocketsDestroy() { return true; };
inline int SocketClose(int sockfd) { return close(sockfd); };

const int PING_DEADLINE = 2; // seconds
const int SLEEP_BETWEEN_PINGS = 30; // seconds

///////////////////////////////////////////////////////////
// member funcs
SimpleClient::SimpleClient()
    : m_pClient(new EPosixClientSocket(this))
    , m_state(ST_CONNECT)
    , m_sleepDeadline(0)
    , m_orderId(0)
{
}

SimpleClient::~SimpleClient()
{
}

bool SimpleClient::connect(const char *host, unsigned int port, int clientId)
{
  // trying to connect
  printf("Connecting to %s:%d clientId:%d\n",
         !(host && *host) ? "127.0.0.1" : host,
         port,
         clientId);
  
  bool bRes = m_pClient->eConnect(host, port, clientId);
  
  if (bRes) {
    printf("Connected to %s:%d clientId:%d\n", !(host && *host) ? "127.0.0.1" : host, port, clientId);
  }
  else
    printf("Cannot connect to %s:%d clientId:%d\n", !(host && *host) ? "127.0.0.1" : host, port, clientId);

  return bRes;
}

void SimpleClient::disconnect() const
{
  m_pClient->eDisconnect();

  printf ("Disconnected\n");
}

bool SimpleClient::isConnected() const
{
  return m_pClient->isConnected();
}

void SimpleClient::processMessages()
{
  fd_set readSet, writeSet, errorSet;

  struct timeval tval;
  tval.tv_usec = 0;
  tval.tv_sec = 0;

  time_t now = time(NULL);

  switch (m_state) {
    case ST_PLACEORDER:
      placeOrder();
      break;
    case ST_PLACEORDER_ACK:
      break;
    case ST_CANCELORDER:
      cancelOrder();
      break;
    case ST_CANCELORDER_ACK:
      break;
    case ST_PING:
      reqCurrentTime();
      break;
    case ST_PING_ACK:
      if(m_sleepDeadline < now) {
        disconnect();
        return;
      }
      break;
    case ST_IDLE:
      if(m_sleepDeadline < now) {
        m_state = ST_PING;
        return;
      }
      break;
  }

  if(m_sleepDeadline > 0) {
    // initialize timeout with m_sleepDeadline - now
    tval.tv_sec = m_sleepDeadline - now;
  }

  if(m_pClient->fd() >= 0 ) {

    FD_ZERO(&readSet);
    errorSet = writeSet = readSet;

    FD_SET(m_pClient->fd(), &readSet);

    if(!m_pClient->isOutBufferEmpty())
      FD_SET(m_pClient->fd(), &writeSet);

    FD_CLR(m_pClient->fd(), &errorSet);

    int ret = select(m_pClient->fd() + 1, &readSet, &writeSet, &errorSet, &tval);

    if(ret == 0) { // timeout
      return;
    }

    if(ret < 0) {	// error
      disconnect();
      return;
    }

    if(m_pClient->fd() < 0)
      return;

    if(FD_ISSET(m_pClient->fd(), &errorSet)) {
      // error on socket
      m_pClient->onError();
    }

    if(m_pClient->fd() < 0)
      return;

    if(FD_ISSET(m_pClient->fd(), &writeSet)) {
      // socket is ready for writing
      m_pClient->onSend();
    }

    if(m_pClient->fd() < 0)
      return;

    if(FD_ISSET(m_pClient->fd(), &readSet)) {
      // socket is ready for reading
      m_pClient->onReceive();
    }
  }
}

//////////////////////////////////////////////////////////////////
// methods
void SimpleClient::reqCurrentTime()
{
  printf("Requesting Current Time\n");

  // set ping deadline to "now + n seconds"
  m_sleepDeadline = time(NULL) + PING_DEADLINE;

  m_state = ST_PING_ACK;

  m_pClient->reqCurrentTime();
}

void SimpleClient::placeOrder()
{
  Contract contract;
  Order order;

  contract.symbol = "MSFT";
  contract.secType = "STK";
  contract.exchange = "SMART";
  contract.currency = "USD";

  order.action = "BUY";
  order.totalQuantity = 1000;
  order.orderType = "LMT";
  order.lmtPrice = 0.01;

  printf("Placing Order %ld: %s %ld %s at %f\n", m_orderId, order.action.c_str(), order.totalQuantity, contract.symbol.c_str(), order.lmtPrice);

  m_state = ST_PLACEORDER_ACK;

  m_pClient->placeOrder(m_orderId, contract, order);
}

void SimpleClient::cancelOrder()
{
  printf("Cancelling Order %ld\n", m_orderId);

  m_state = ST_CANCELORDER_ACK;

  m_pClient->cancelOrder(m_orderId);
}

///////////////////////////////////////////////////////////////////
// events
void SimpleClient::orderStatus(OrderId orderId, const IBString &status, int filled,
                         int remaining, double avgFillPrice, int permId, int parentId,
                         double lastFillPrice, int clientId, const IBString& whyHeld)

{
  if(orderId == m_orderId) {
    if(m_state == ST_PLACEORDER_ACK && (status == "PreSubmitted" || status == "Submitted"))
      m_state = ST_CANCELORDER;

    if(m_state == ST_CANCELORDER_ACK && status == "Cancelled")
      m_state = ST_PING;

    printf("Order: id=%ld, status=%s\n", orderId, status.c_str());
  }
}

void SimpleClient::nextValidId(OrderId orderId)
{
  m_orderId = orderId;

  m_state = ST_PLACEORDER;
}

void SimpleClient::currentTime(long time)
{
  if (m_state == ST_PING_ACK) {
    time_t t = (time_t)time;
    struct tm * timeinfo = localtime (&t);
    printf("The current date/time is: %s", asctime(timeinfo));

    time_t now = ::time(NULL);
    m_sleepDeadline = now + SLEEP_BETWEEN_PINGS;

    m_state = ST_IDLE;
  }
}

void SimpleClient::error(const int id, const int errorCode, const IBString errorString)
{
  //	printf("Error id=%d, errorCode=%d, msg=%s\n", id, errorCode, errorString.c_str());

  if(id == -1 && errorCode == 1100) // if "Connectivity between IB and TWS has been lost"
    disconnect();
}

void SimpleClient::tickPrice(TickerId tickerId, TickType field, double price, int canAutoExecute) {}
void SimpleClient::tickSize(TickerId tickerId, TickType field, int size) {}
void SimpleClient::tickOptionComputation(TickerId tickerId, TickType tickType, double impliedVol, double delta,
                                   double modelPrice, double pvDividend) {}

void SimpleClient::tickGeneric(TickerId tickerId, TickType tickType, double value) {}
void SimpleClient::tickString(TickerId tickerId, TickType tickType, const IBString& value) {}
void SimpleClient::tickEFP(TickerId tickerId, TickType tickType, double basisPoints, const IBString& formattedBasisPoints,
                     double totalDividends, int holdDays, const IBString& futureExpiry, double dividendImpact, double dividendsToExpiry) {}
void SimpleClient::openOrder(OrderId orderId, const Contract&, const Order&, const OrderState& ostate) {}
void SimpleClient::openOrderEnd() {}
void SimpleClient::winError(const IBString &str, int lastError) {}
void SimpleClient::connectionClosed() {}
void SimpleClient::updateAccountValue(const IBString& key, const IBString& val,
                                const IBString& currency, const IBString& accountName) {}
void SimpleClient::updatePortfolio(const Contract& contract, int position,
                             double marketPrice, double marketValue, double averageCost,
                             double unrealizedPNL, double realizedPNL, const IBString& accountName){}
void SimpleClient::updateAccountTime(const IBString& timeStamp) {}
void SimpleClient::accountDownloadEnd(const IBString& accountName) {}
void SimpleClient::contractDetails(int reqId, const ContractDetails& contractDetails) {}
void SimpleClient::bondContractDetails(int reqId, const ContractDetails& contractDetails) {}
void SimpleClient::contractDetailsEnd(int reqId) {}
void SimpleClient::execDetails(int reqId, const Contract& contract, const Execution& execution) {}
void SimpleClient::execDetailsEnd(int reqId) {}

void SimpleClient::updateMktDepth(TickerId id, int position, int operation, int side,
                            double price, int size) {}
void SimpleClient::updateMktDepthL2(TickerId id, int position, IBString marketMaker, int operation,
                              int side, double price, int size) {}
void SimpleClient::updateNewsBulletin(int msgId, int msgType, const IBString& newsMessage, const IBString& originExch) {}
void SimpleClient::managedAccounts(const IBString& accountsList) {}
void SimpleClient::receiveFA(faDataType pFaDataType, const IBString& cxml) {}
void SimpleClient::historicalData(TickerId reqId, const IBString& date, double open, double high,
                            double low, double close, int volume, int barCount, double WAP, int hasGaps) {}
void SimpleClient::scannerParameters(const IBString &xml) {}
void SimpleClient::scannerData(int reqId, int rank, const ContractDetails &contractDetails,
                         const IBString &distance, const IBString &benchmark, const IBString &projection,
                         const IBString &legsStr) {}
void SimpleClient::scannerDataEnd(int reqId) {}
void SimpleClient::realtimeBar(TickerId reqId, long time, double open, double high, double low, double close,
                         long volume, double wap, int count) {}
void SimpleClient::fundamentalData(TickerId reqId, const IBString& data) {}
void SimpleClient::deltaNeutralValidation(int reqId, const UnderComp& underComp) {}
void SimpleClient::tickSnapshotEnd(int reqId) {}

