FROM openjdk:16-jdk-alpine

RUN apk update && apk add maven
COPY . /app
EXPOSE 8080

RUN  cd /app && mvn package

#run the spring boot application
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom", "-Dblabla", "-jar","/app/target/sb-matrix-api-0.0.1-SNAPSHOT.jar"]

