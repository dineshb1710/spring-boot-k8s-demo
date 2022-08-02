FROM openjdk:11
EXPOSE 8080
ADD target/spring-boot-k8s-demo-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "spring-boot-k8s-demo-0.0.1-SNAPSHOT.jar"]