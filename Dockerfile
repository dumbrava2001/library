FROM openjdk:17

COPY target/library-1.jar library-1.jar

ENTRYPOINT ["java","-jar","/library-1.jar"]

