# Use the official OpenJDK image
FROM openjdk:21-jdk-slim

# Add a volume pointing to /tmp
VOLUME /tmp

# Copy the application's JAR file
COPY build/libs/*.jar Library.jar

# Expose the port the application runs on
EXPOSE 8080

# Run the JAR file
ENTRYPOINT ["java","-jar","/Library.jar"]