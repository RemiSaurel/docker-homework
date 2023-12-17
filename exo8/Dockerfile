# FIRST VERSION WITH BUILD
#FROM maven:3.9.5-eclipse-temurin-21 AS builder
#
#WORKDIR /app
#
#COPY pom.xml .
#COPY src ./src
#
#RUN mvn clean install
#
#FROM maven:3.9.5-eclipse-temurin-21 AS runner
#
#WORKDIR /app
#
#COPY --from=builder /app/target/*.jar ./app.jar
#
#ENTRYPOINT ["java", "-jar", "app.jar"]

FROM maven:3.9.5-eclipse-temurin-21 AS builder

WORKDIR /app

COPY target/devops-1.0.jar ./app.jar

CMD ["java", "-jar", "app.jar"]