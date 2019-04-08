FROM openjdk:8-jre-alpine
WORKDIR /opt
COPY target/*.jar .
COPY start.sh .
ENTRYPOINT /bin/sh start.sh
