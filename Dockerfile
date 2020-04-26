FROM tomcat:9.0.24
VOLUME /tmp
COPY target/spring-boot-hello-user.war /usr/local/tomcat/webapps/spring-boot-hello-user.war
EXPOSE 5000
ENTRYPOINT [ "sh", "-c", "java -Dspring.profiles.active=docker -Djava.security.egd=file:/dev/./urandom -jar /usr/local/tomcat/webapps/spring-boot-hello-user.war" ]