FROM openjdk:8
EXPOSE 8080
ADD target/cicd-jenkins.jar cicd-jenkins.jar
ENTRYPOINT ["java","-jar","/cicd-jenkins"]
