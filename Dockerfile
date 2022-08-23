FROM openjdk
WORKDIR /
ADD redis-0.0.1-SNAPSHOT.jar redis-0.0.1-SNAPSHOT.jar
EXPOSE 8080
CMD ["java", "-jar", "redis-0.0.1-SNAPSHOT.jar"]