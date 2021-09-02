FROM openjdk:8

RUN apt-get update && apt-get install -y maven
COPY . /app
EXPOSE 8080

RUN  cd /app && mvn package

#run the spring boot application
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom", "-Dblabla", "-jar","/app/target/sb-matrix-api-0.0.1-SNAPSHOT.jar"]

