# Stage 1: Build the app
FROM maven:3.8.5-openjdk-17 AS builder

WORKDIR /app

COPY . .

RUN ./mvnw clean package -DskipTests

# Stage 2: Run the app
FROM openjdk:17-jdk-slim

WORKDIR /app

COPY --from=builder /app/target/Ekart-1-0.0.1-SNAPSHOT.jar app.jar

CMD ["java", "-jar", "app.jar"]
