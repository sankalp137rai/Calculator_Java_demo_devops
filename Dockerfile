FROM openjdk:8
COPY ./target/Java_Calculator-1.0-SNAPSHOT.jar ./
WORKDIR ./	
CMD ["java", "-cp", "Java_Calculator-1.0-SNAPSHOT.jar", "Main"]
