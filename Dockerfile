# Start with a base image containing Java runtime
FROM openjdk:8

# Make port 8080 available to the world outside this container
EXPOSE 8080

ADD target/sbd-jenkins-01.jar sbd-jenkins-01.jar

# Run the jar file 
ENTRYPOINT ["java","-jar","/sbd-jenkins-01.jar"]