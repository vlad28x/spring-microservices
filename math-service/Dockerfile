FROM openjdk:17-alpine
EXPOSE 8080
WORKDIR /app
COPY build/libs/math-service-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]