# Purpose

A simple Spring application for AWS Beanstalk testing.

# Requirements

- Java 8
- Maven 3

# Build the application

	$ mvn -e clean package

# Usage

## Standalone execution

	$ java -jar target/spring-starter.war

(or)

	$ ./target/spring-starter.war

## Tomcat deployment

Place `target/spring-starter.war` into Tomcat's `webapp` directory.

