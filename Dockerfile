FROM eclipse-temurin:21-jdk

WORKDIR /app

LABEL maintainer="javaguides.net"

# Create a non-root user (security best practice)
RUN useradd -m appuser
USER appuser

# Copy built jar
COPY target/CalculatorProject-0.0.1-SNAPSHOT.jar calculator.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "calculator.jar"]