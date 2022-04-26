FROM openjdk:8
EXPOSE 8080
ADD target/cicd-jenkins-1.0-SNAPSHOT.jar cicd-jenkins-1.0-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/cicd-jenkins-1.0-SNAPSHOT.jar"]
