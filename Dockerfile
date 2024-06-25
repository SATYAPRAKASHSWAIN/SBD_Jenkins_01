# Start with a base image containing Java runtime
FROM java:21

# Make port 8080 available to the world outside this container
EXPOSE 8080

ADD target/SBD_Jenkins_01.jar SBD_Jenkins_01.jar

# Run the jar file 
ENTRYPOINT ["java","-jar","SBD_Jenkins_01.jar"]