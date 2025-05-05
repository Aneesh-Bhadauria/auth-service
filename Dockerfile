FROM amazoncorretto:17
COPY target/authservice-0.0.1-SNAPSHOT.jar authservice-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/authservice-0.0.1-SNAPSHOT.jar"]
