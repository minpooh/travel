FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY build/libs/travel-0.0.1-SNAPSHOT.jar app.jar

ENV SPRING_PROFILES_ACTIVE=prod

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
