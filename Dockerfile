# Use OpenJDK base image
FROM openjdk:17-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the jar file (make sure the name matches your jar)
COPY target/Ekart-1-0.0.1-SNAPSHOT.jar app.jar

# Set the command to run the app
CMD ["java", "-jar", "app.jar"]
