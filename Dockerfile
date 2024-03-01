FROM openjdk:17
EXPOSE 8080
ADD target/project_mini_calculator.jar project_mini_calculator.jar
CMD ["java","-jar","/project_mini_calculator.jar"]
# ENTRYPOINT ["java","-jar","/project_mini_calculator.jar"]
