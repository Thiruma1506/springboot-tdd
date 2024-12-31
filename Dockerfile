FROM openjdk:18-jdk-slim
EXPOSE 9090
ADD target/devops-integration.jar devops-integration.jar
ENTRYPOINT ["java","-jar","/devops-integration.jar"]