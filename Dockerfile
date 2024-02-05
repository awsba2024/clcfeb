FROM openjdk:8-jdk-alpine
COPY target/getflightlist-0.0.1-SNAPSHOT.jar .
EXPOSE 8020
CMD ["java","-jar","getflightlist-0.0.1-SNAPSHOT.jar"]
