FROM openjdk:8-jdk-alpine
#ENV DEPLOY_DIR ${CATALINA_HOME}/webapps
WORKDIR /
COPY target/DAC-print-clientes-1.0-SNAPSHOT.jar DAC-print-clientes-1.0-SNAPSHOT.jar
EMTRYPOINT java -jar DAC-print-clientes-1.0-SNAPSHOT.jar
