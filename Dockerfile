
FROM maven:3.8.4-openjdk-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean install

FROM openjdk:17-jdk AS runtime
WORKDIR /app
COPY --from=build /app/target/your-spring-boot-app.jar /app/app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]


# FROM ubuntu:latest AS build
# RUN apt-get update
# RUN apt-get install openjdk-17-jdk -y
# RUN apt-get install maven -y
# COPY . .
# RUN mvn -X package
# COPY target/*.jar /app.jar
# ENTRYPOINT ["java", "-jar", "/app.jar"]

# FROM ubuntu:latest AS build
# RUN apt-get update
# RUN apt-get install openjdk-17-jdk -y
# COPY . .
# RUN mvn clean install
# FROM openjdk:17-jdk-slim
# EXPOSE 8080
# COPY --from=build /app/target/your-spring-boot-app.jar /app/app.jar
# RUN ./gradlew bootJar --no-daemon