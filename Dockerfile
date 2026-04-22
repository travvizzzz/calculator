<<<<<<< HEAD
# Use specific image version or digest
FROM eclipse-temurin:21-jdk

# Create a non-root user
RUN useradd -m appuser
USER appuser

=======
FROM eclipse-temurin:21-jdk

>>>>>>> 1ad0304 (update file)
WORKDIR /app

LABEL maintainer="javaguides.net"

<<<<<<< HEAD
ADD target/CalculatorProject-0.0.1-SNAPSHOT.jar calculator.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "calculator.jar"]
=======
COPY target/CalculatorProject-0.0.1-SNAPSHOT.jar calculator.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "calculator.jar"]
>>>>>>> 1ad0304 (update file)
