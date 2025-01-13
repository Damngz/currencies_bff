FROM eclipse-temurin:22-jdk AS buildstage 
 
RUN apt-get update && apt-get install -y maven

WORKDIR /app

COPY pom.xml .
COPY src /app/src


RUN mvn clean package

FROM eclipse-temurin:22-jdk 

COPY --from=buildstage /app/target/currencies_bff-0.0.1-SNAPSHOT.jar /app/currencies_bff.jar

EXPOSE 8080

ENTRYPOINT [ "java", "-jar","/app/currencies_bff.jar" ]
