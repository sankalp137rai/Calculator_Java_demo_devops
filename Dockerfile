FROM openjdk:17
COPY ./target/demo_calcalutor_spe-0.0.1-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-jar", "demo_calcalutor_spe-0.0.1-SNAPSHOT.jar"]
