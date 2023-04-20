FROM openjdk:20
LABEL maintainer="faizan"

COPY target/my_first_app-1.0-SNAPSHOT-jar-with-dependencies.jar /app.jar


#WORKDIR /

ENTRYPOINT ["java", "-jar", "/app.jar"]

