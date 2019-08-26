FROM openjdk:8
MAINTAINER 12APP-FACTOR
ADD target/*.jar /msa-eadmin.jar
RUN bash -c 'touch /msa-eadmin.jar'
CMD ["java","-Dspring.profiles.active=docker","-jar","/msa-eadmin.jar"]
EXPOSE 8083