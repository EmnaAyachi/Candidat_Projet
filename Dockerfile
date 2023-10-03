FROM openjdk:8
EXPOSE 8089
ADD target/dockerdemo.jar dockerdemo.jar
ENTRYPOINT ["java","-jar","dockerdemo.jar"]