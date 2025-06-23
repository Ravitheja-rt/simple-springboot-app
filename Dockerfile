# Step 1: Use Maven to build the JAR
FROM maven:3.9.6-eclipse-temurin-17 AS builder
WORKDIR /build
COPY . .
RUN mvn clean package -DskipTests

# Step 2: Use JDK image to run the built JAR
FROM openjdk:17-jdk
WORKDIR /app
COPY --from=builder /build/target/simpleSpringbootApp-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
