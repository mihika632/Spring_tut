# Demo Spring Boot Application

A Spring Boot web application created with Spring Initializr.

## Project Information

- **Group ID**: com.example
- **Artifact ID**: demo
- **Version**: 0.0.1-SNAPSHOT
- **Java Version**: 17
- **Packaging**: JAR
- **Spring Boot Version**: 3.4.1

## Dependencies

- Spring Web - Build web applications including RESTful APIs using Spring MVC

## Project Structure

```
demo/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/demo/
│   │   │       └── DemoApplication.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       └── java/
│           └── com/example/demo/
│               └── DemoApplicationTests.java
├── .gitignore
└── pom.xml
```

## Building the Project

To build the project, run:

```bash
mvn clean install
```

## Running the Application

To run the application, use:

```bash
mvn spring-boot:run
```

The application will start on `http://localhost:8080`

## Testing

To run tests:

```bash
mvn test
```

## Next Steps

- Add REST controllers in the `com.example.demo` package
- Configure application properties in `application.properties`
- Add additional dependencies as needed in `pom.xml`
