# ─── STAGE 1: Build the JAR ─────────────────────────────────────
FROM maven:3.9-eclipse-temurin-17 AS builder
WORKDIR /home/maven/project
COPY . .
RUN mvn clean package -DskipTests --quiet

# ─── STAGE 2: Run the JAR ──────────────────────────────────────
FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY --from=builder /home/maven/project/target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"] 