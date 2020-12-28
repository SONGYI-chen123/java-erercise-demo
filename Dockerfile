FROM amuguelove/openjdk:8-jre-alpine-apm-agent

COPY build/libs/*.jar /opt/app.jar

ENTRYPOINT ["java", "-jar", "/opt/app.jar"]