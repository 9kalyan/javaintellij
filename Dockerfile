FROM openjdk:22-ea-jdk
WORKDIR /
ADD build/libs/kalyan.jar dockerapp.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","dockerapp.jar"]