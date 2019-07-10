#!/usr/bin/env bash

# Import new root SSL certificates.
update-ca-certificates


# If optional options are not set, use empty string
JAVA_OPTS=${JAVA_OPTS:-""}

# Try to always preserve at least GC logging
MANDATORY_JAVA_OPTS=${MANDATORY_JAVA_OPTS:-"-XX:+PrintGC"}

echo "Final java options are \"${MANDATORY_JAVA_OPTS} ${JAVA_OPTS}\""

# Don't insert line breaks, otherwise exec fails
exec java ${MANDATORY_JAVA_OPTS} ${JAVA_OPTS} -jar /opt/data-ledger-loader/data-loader.jar