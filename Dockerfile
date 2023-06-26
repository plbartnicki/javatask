FROM openjdk:8u111-jre-alpine

COPY target/*.jar /app/

ENTRYPOINT ["java", "-jar"]

CMD ["/app/gs-rest-service-0.1.0.jar"]
