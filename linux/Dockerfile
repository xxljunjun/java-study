
FROM primetoninc/jdk:1.8
 
VOLUME /ROOT
 
ADD xxl-spring-boot-0.0.1-SNAPSHOT.jar demo.jar
 
RUN bash -c 'touch /demo.jar'
 
EXPOSE 8080
 
ENTRYPOINT ["java", "-jar", "demo.jar"]