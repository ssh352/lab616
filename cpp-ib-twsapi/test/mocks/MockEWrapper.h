// 2010 - lab616 MockEWrapper

#include "api/Shared/Contract.h"
#include "api/Shared/Execution.h"
#include "api/Shared/Order.h"
#include "api/Shared/OrderState.h"
#include "api/Shared/EWrapper.h"
#include <gmock/gmock.h>

/**
 * Generated from third_party/cpp/gmock/scripts/generator/gmock_gen.py
 */
class MockEWrapper : public EWrapper {
public:
  MOCK_METHOD4(tickPrice,
               void(TickerId tickerId, TickType field,
                    double price, int canAutoExecute));
  
  MOCK_METHOD3(tickSize,
               void(TickerId tickerId, TickType field, int size));

  MOCK_METHOD6(tickOptionComputation,
               void(TickerId tickerId, TickType tickType, double impliedVol,
                    double delta, double modelPrice, double pvDividend));

  MOCK_METHOD3(tickGeneric,
               void(TickerId tickerId, TickType tickType, double value));

  MOCK_METHOD3(tickString,
               void(TickerId tickerId, TickType tickType,
                    const IBString& value));

  MOCK_METHOD9(tickEFP,
               void(TickerId tickerId, TickType tickType, double basisPoints,
                    const IBString& formattedBasisPoints,
                    double totalDividends, int holdDays,
                    const IBString& futureExpiry, double dividendImpact,
                    double dividendsToExpiry));
  
  MOCK_METHOD10(orderStatus,
                void(OrderId orderId, const IBString &status, int filled,
                     int remaining, double avgFillPrice, int permId,
                     int parentId, double lastFillPrice, int clientId,
                     const IBString& whyHeld));
  
  MOCK_METHOD4(openOrder,
               void(OrderId orderId, const Contract &contract,
                    const Order &order, const OrderState orderState));
  
  MOCK_METHOD0(openOrderEnd,
               void());

  MOCK_METHOD2(winError,
               void(const IBString &str, int lastError));

  MOCK_METHOD0(connectionClosed,
               void());

  MOCK_METHOD4(updateAccountValue,
               void(const IBString& key, const IBString& val,
                    const IBString& currency, const IBString& accountName));
  
  MOCK_METHOD8(updatePortfolio,
               void(const Contract& contract, int position,
                    double marketPrice, double marketValue, double averageCost,
                    double unrealizedPNL, double realizedPNL,
                    const IBString& accountName));
  
  MOCK_METHOD1(updateAccountTime,
               void(const IBString& timeStamp));

  MOCK_METHOD1(accountDownloadEnd,
               void(const IBString& accountName));

  MOCK_METHOD1(nextValidId,
               void(OrderId orderId));

  MOCK_METHOD2(contractDetails,
               void(int reqId, const ContractDetails& contractDetails));

  MOCK_METHOD2(bondContractDetails,
               void(int reqId, const ContractDetails& contractDetails));

  MOCK_METHOD1(contractDetailsEnd,
               void(int reqId));

  MOCK_METHOD3(execDetails,
               void(int reqId, const Contract& contract,
                    const Execution& execution));
  
  MOCK_METHOD1(execDetailsEnd,
               void(int reqId));

  MOCK_METHOD3(error,
               void(const int id, const int errorCode,
                    const IBString errorString));
  
  MOCK_METHOD6(updateMktDepth,
               void(TickerId id, int position, int operation, int side,
                    double price, int size));
  
  MOCK_METHOD7(updateMktDepthL2,
               void(TickerId id, int position, IBString marketMaker,
                    int operation, int side, double price, int size));
  
  MOCK_METHOD4(updateNewsBulletin,
               void(int msgId, int msgType, const IBString& newsMessage,
                    const IBString& originExch));
  
  MOCK_METHOD1(managedAccounts,
               void(const IBString& accountsList));

  MOCK_METHOD2(receiveFA,
               void(faDataType pFaDataType, const IBString& cxml));

  MOCK_METHOD10(historicalData,
                void(TickerId reqId, const IBString& date, double open,
                     double high, double low, double close, int volume,
                     int barCount, double WAP, int hasGaps));
  
  MOCK_METHOD1(scannerParameters,
               void(const IBString &xml));

  MOCK_METHOD7(scannerData,
               void(int reqId, int rank,
                    const ContractDetails &contractDetails,
                    const IBString &distance, const IBString &benchmark,
                    const IBString &projection, const IBString &legsStr));
  
  MOCK_METHOD1(scannerDataEnd,
               void(int reqId));

  MOCK_METHOD9(realtimeBar,
               void(TickerId reqId, long time, double open, double high,
                    double low, double close, long volume, double wap,
                    int count));
  
  MOCK_METHOD1(currentTime,
               void(long time));

  MOCK_METHOD2(fundamentalData,
               void(TickerId reqId, const IBString& data));

  MOCK_METHOD2(deltaNeutralValidation,
               void(int reqId, const UnderComp& underComp));

  MOCK_METHOD1(tickSnapshotEnd,
               void(int reqId));
};
