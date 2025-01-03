FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/RegistrationM2-0.0.1-SNAPSHOT.jar /app

EXPOSE 8082

CMD ["java", "-jar", "RegistrationM2-0.0.1-SNAPSHOT.jar", "--spring.profiles.active=docker"]
