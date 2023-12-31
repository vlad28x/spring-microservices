FROM openjdk:17-alpine
EXPOSE 8082
WORKDIR /app
COPY build/libs/examinator-service-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]