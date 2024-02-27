FROM openjdk:8
EXPOSE 8087
COPY target/gestion-stationSki-1.1.0.jar skitest.jar
ENTRYPOINT ["java", "-jar", "/skitest.jar"]
