FROM openjdk:17-alpine
RUN apk add --update curl && \
    rm -rf /var/cache/apk/*
WORKDIR /app
EXPOSE 8888
COPY build/libs/config-server-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]