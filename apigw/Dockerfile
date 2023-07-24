FROM openjdk:17-ea-11-jdk-slim
VOLUME /tmp
COPY target/apigw-1.0.jar APIGW.jar
ENTRYPOINT ["java", "-jar", "APIGW.jar"]
