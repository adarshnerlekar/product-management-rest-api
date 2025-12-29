# product-management-rest-api
Spring REST API practice project with database integration. Implements CRUD operations using POST, PUT, PATCH, and DELETE mappings. Built using Java, Spring Boot, Spring Data JPA, MySQL, and Maven to understand RESTful services and backend development concepts.
# Product Management REST API (CRUD)

This is a Spring Boot practice project that demonstrates building RESTful APIs with database integration using a clean layered architecture.

## Technologies Used
- Java
- Spring Boot
- Spring REST
- Spring Data JPA
- MySQL
- Maven
- Postman

## Architecture
- Controller (REST API Layer)
- Service (Business Logic Layer)
- Repository (Data Access Layer)

## Features
- Create product using POST mapping
- Update full product using PUT mapping
- Update partial product using PATCH mapping
- Delete product using DELETE mapping
- Database integration using Spring Data JPA
- Centralized exception handling using custom exceptions

## API Endpoints
- POST    /api/products
- PUT     /api/products/{id}
- PATCH   /api/products/{id}
- DELETE  /api/products/{id}

## Exception Handling
- Custom exceptions for resource not found
- Proper HTTP status codes returned
- Centralized exception handling using @ExceptionHandler / @ControllerAdvice

## Purpose
This project is developed for practicing Spring REST API concepts, CRUD operations, layered architecture, and exception handling. It helps strengthen backend development skills using Spring Boot and JPA.

## Author
Adarsh Santosh Nerlekar  
Java Full Stack Developer
