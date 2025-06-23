FROM openjdk:17-jdk

# Set working directory
WORKDIR /app

# Copy JAR file into the container
COPY target/simpleSpringbootApp-1.0-SNAPSHOT.jar app.jar

# Run the Spring Boot application
ENTRYPOINT ["java", "-jar", "app.jar"]
