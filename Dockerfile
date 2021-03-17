FROM openjdk:8
COPY ./Mini_Project/target/Mini_Project-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java","-cp","Mini_Project-1.0-SNAPSHOT-jar-with-dependencies.jar","Calc"]
