FROM java:8-jdk-alpine
WORKDIR /app
EXPOSE 8080
ARG DEPENDENCY=target
COPY ${DEPENDENCY}/demoApplication-0.0.1-SNAPSHOT.war /app
ENTRYPOINT ["java","-jar","demoApplication-0.0.1-SNAPSHOT.war"]


