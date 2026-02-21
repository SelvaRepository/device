# Use a base image with Java 21
FROM maven:3.9.8-eclipse-temurin-21 AS build

ADD ../target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]