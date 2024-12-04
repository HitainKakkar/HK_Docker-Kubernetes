FROM openjdk:17
COPY target/SpringDockerApp-0.0.1-SNAPSHOT.jar /app/
WORKDIR /app
ENTRYPOINT ["java", "-jar", "SpringDockerApp-0.0.1-SNAPSHOT.jar"
#SpringDockerApp-0.0.1-SNAPSHOT.jar