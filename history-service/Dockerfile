FROM openjdk:17-alpine
EXPOSE 8081
WORKDIR /app
COPY build/libs/history-service-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]