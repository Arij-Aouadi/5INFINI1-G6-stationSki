FROM openjdk:11
EXPOSE 8087
ADD target/stationSki-1.1.0.jar skitest.jar
ENTRYPOINT ["java", "-jar", "/skitest.jar"]
