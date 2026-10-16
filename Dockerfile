FROM eclipse-temurin:21-jre
COPY ./build/libs /usr/src/myapp
WORKDIR /usr/src/myapp
CMD ["java", "-jar", "app-0.0.1-SNAPSHOT.jar", "-Dspring.profiles.active=docker"]