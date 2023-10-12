# Use the official JDK 17 image as a base image
FROM openjdk:17-jdk-slim

# Copy the built jar file into the image
COPY build/libs/backend-*.jar app.jar

# Command to run the application
CMD ["java", "-jar", "/app.jar"]