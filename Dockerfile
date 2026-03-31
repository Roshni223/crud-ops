# Use lightweight Java image
FROM openjdk:17-jdk-slim

# App directory
WORKDIR /app

# Copy jar
COPY target/crud-ops-0.0.1-SNAPSHOT.jar app.jar

# Expose port
EXPOSE 8081

# Run app
ENTRYPOINT ["java","-jar","/app/app.jar"]