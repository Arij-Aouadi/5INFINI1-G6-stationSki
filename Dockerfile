FROM openjdk:8
EXPOSE 8087
ADD target/gestion-stationski-1.1.0.jar skitest.jar
ENTRYPOINT ["java", "-jar", "/skitest.jar"]
