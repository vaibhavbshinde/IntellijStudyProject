FROM xaxiseng/base-java8

#### folder for for logs; application;
RUN mkdir -p /var/log/ma-docker/ /opt/data-ledger-loader/

ADD target/data-loader-*.jar /opt/data-ledger-loader/

RUN rm -rf /opt/data-ledger-loader/data-loader-*-sources.jar /opt/data-ledger-loader/data-loader-*-javadoc.jar \
    && mv /opt/data-ledger-loader/data-loader*.jar /opt/data-ledger-loader/data-loader.jar

#### Starter
ADD docker/start.sh /opt/start.sh
RUN chmod +x /opt/start.sh

#### Exposed ports.
EXPOSE 9090

#### Run from /opt
CMD /opt/start.sh