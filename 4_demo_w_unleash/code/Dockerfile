FROM openjdk:15
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} toogle-app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/toogle-app.jar"]
