FROM openjdk:21
ADD build/libs/spring-boot-aws-demo-0.0.1-SNAPSHOT.jar spring-boot-aws-demo-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","demo-0.0.1-SNAPSHOT.jar"]