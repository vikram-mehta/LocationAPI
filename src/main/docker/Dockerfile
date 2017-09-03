FROM openjdk


EXPOSE 8080

#install Spring Boot artifact
VOLUME /tmp
ADD /maven/swagger-spring-1.0.0.jar swagger-spring-1.0.0.jar
RUN sh -c 'touch /swagger-spring-1.0.0.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/swagger-spring-1.0.0.jar"]
