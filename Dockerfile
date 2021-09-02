# FROM openjdk:8-jdk-alpine
# LABEL maintainer="author@javatodev.com"
# WORKDIR /app

# VOLUME /app/volumes

# RUN mvnw spring-boot:build-image

# ADD build/libs/sb-matrix-api-0.0.1-SNAPSHOT.jar app.jar
# EXPOSE 8080
# ENTRYPOINT ["java", "-jar","/app.jar"]
FROM openjdk:8

RUN apt-get update && apt-get install -y maven
COPY . /app
RUN  cd /app && mvn package

#run the spring boot application
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom", "-Dblabla", "-jar","/app/target/sb-matrix-api-0.0.1-SNAPSHOT.jar"]

