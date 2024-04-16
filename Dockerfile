FROM openjdk:17-jdk-alpine
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} application.jar
#RUN java -Djarmode=layertools -jar application.jar extract

ADD https://github.com/open-telemetry/opentelemetry-java-instrumentation/releases/download/v2.2.0/opentelemetry-javaagent.jar /etc/opentelemetry-agent.jar
#COPY --from=builder dependencies/ .//etc/opentelemetry-agent.jar
                                     ##FROM artifactory.raiffeisen.ru/jvm-community-release-docker/temurin/temurin21-jre:21.0.2_13-almalinux-upd1
#COPY --from=builder snapshot-dependencies/ ./
#COPY --from=builder spring-boot-loader/ ./
#COPY --from=builder application/ ./
#ENTRYPOINT ["java","org.springframework.boot.loader.launch.JarLauncher"]
ENTRYPOINT ["java","-jar","application.jar"]
EXPOSE 8080