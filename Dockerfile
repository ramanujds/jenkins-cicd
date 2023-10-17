FROM adoptopenjdk/openjdk11
WORKDIR /
ADD target/emp-app.jar app.jar
CMD java -jar app.jar
