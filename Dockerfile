FROM openjdk:17-slim as build
MAINTAINER com.shezi.uyanda
COPY target/cards-0.0.1-SNAPSHOT.jar cards-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/cards-0.0.1-SNAPSHOT.jar"]