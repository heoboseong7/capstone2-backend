FROM openjdk:11
COPY ./build/libs/capstone2-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]