# 1단계: Gradle로 빌드 (테스트는 제외)
FROM gradle:8.6.0-jdk17 AS build
COPY --chown=gradle:gradle . /home/gradle/project
WORKDIR /home/gradle/project
RUN ./gradlew build -x test

# 2단계: 실행 환경 (JAR 복사해서 실행)
FROM openjdk:17-oracle
WORKDIR /app
COPY --from=build /home/gradle/project/build/libs/travel-0.0.1-SNAPSHOT.jar /app/app.jar
EXPOSE 8081
CMD ["java", "-jar", "/app/app.jar"]