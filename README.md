# SoftServe Java Test

> Code repository for SoftServe Java Test

## Deploy and execution

### Prerequisites

You will need the following things properly installed on your computer.

* [Java 17](https://www.java.com/en/)
* [Git](http://git-scm.com/)
* [Gradle](https://gradle.org)
* [Docker](https://www.docker.com/)

### Manual Build

```bash
#Generate .jar
./gradlew clean build
#Generate docker image
docker build -t softserve/java-test .
```

### Manual Execution

```bash
#Gradle Execution
./gradlew bootRun
#Docker Execution
docker run -p 8080:8080 softserve/java-test
```

### Run tests

```bash
./gradlew clean test
```

### Consume
```bash
#Local environment 
curl --location 'http://localhost:8080/duplicates' \
--header 'Content-Type: application/json' \
--data '{
    "input" : "AAABBBBCCCCDDDDEEE"
}'

For more details see resources/static/contract.yml
```