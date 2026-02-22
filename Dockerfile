# Use specific image version or digest
FROM eclipse-temurin:21-jdk

# Create a non-root user
RUN useradd -m appuser
USER appuser

WORKDIR /app

LABEL maintainer="javaguides.net"

ADD target/CalculatorProject-0.0.1-SNAPSHOT.jar calculator.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "calculator.jar"]
