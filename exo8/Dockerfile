FROM maven:3.9.5-eclipse-temurin-21 AS builder

WORKDIR /app

COPY target/devops-1.0.jar ./app.jar

CMD ["java", "-jar", "app.jar"]