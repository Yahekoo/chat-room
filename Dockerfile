#FROM openjdk:17
FROM eclipse-temurin:21-jdk-jammy

LABEL maintainer="hassan zafin <hassan.zafin@gmail.com>" \
      version="1.0" \
      description="Spring Boot Microservice for Product Management"


EXPOSE 8090

WORKDIR /app

COPY target/*.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]