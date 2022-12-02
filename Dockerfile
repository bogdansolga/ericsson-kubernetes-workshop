FROM maven:3.8-openjdk-17-slim AS maven
COPY src src
COPY pom.xml /
WORKDIR .
RUN mvn clean package

FROM openjdk:17-alpine
WORKDIR .
COPY --from=maven target/java.app-0.0.1-SNAPSHOT.jar .
ENTRYPOINT ["java", "-jar", "java.app-0.0.1-SNAPSHOT.jar"]
