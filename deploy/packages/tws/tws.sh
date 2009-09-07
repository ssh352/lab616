#!/bin/bash

# Global defaults:
BIN_NAME=`basename $0 | awk -F. '{print $1}'`
PROFILE=$1
PACKAGE_DIR=`dirname $0`
BINARY_DIR=${PACKAGE_DIR}/bin
WORKING_DIR=${PACKAGE_DIR}/local
LOGFILE=${PACKAGE_DIR}/${BIN_NAME}.${PROFILE}.log
PID=${PACKAGE_DIR}/${BIN_NAME}.${PROFILE}.pid
TZ="US/Eastern"

echo "DIR = $PACKAGE_DIR"
case `uname` in
Linux)
	export JAVA_HOME=/opt/jdk1.6
	# Start vncserver
	vncserver :1
	export DISPLAY=localhost:1
;;
Darwin)
	export JAVA_HOME=/System/Library/Frameworks/JavaVM.framework/Versions/1.5/Home
;;
*)
	echo "JAVA_HOME must be set."
	exit -1
;;
esac

export PATH=${JAVA_HOME}/bin:$PATH

echo `which java`
echo `java -version`

JAR=${BINARY_DIR}/`basename $0 | awk -F. '{print $1}'`.jar
JVM_ARGS="-Djava.library.path=${BINARY_DIR} -server -Xmx1024M -Duser.timezone=${TZ}"

JAVA_COMMAND="nohup java ${JVM_ARGS} -jar ${JAR}"

###########################################################
# Package-specific parameters:
profile=`cat ${PACKAGE_DIR}/profiles/${PROFILE}`
string_prompt=`echo ${profile} | awk -F":" '{ print $1 }'`
password_prompt=`echo ${profile} | awk -F":" '{ print $2 }'`
folder_prompt=${WORKING_DIR}

${JAVA_COMMAND} --login=${string_prompt} --password=${password_prompt} --tws_dir=${folder_prompt} &>${LOGFILE} &

# Send the pid to a file (last process captured in $!)
echo $! > ${PID}
