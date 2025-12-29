# product-management-rest-api
Spring REST API practice project with database integration. Implements CRUD operations using POST, PUT, PATCH, and DELETE mappings. Built using Java, Spring Boot, Spring Data JPA, MySQL, and Maven to understand RESTful services and backend development concepts.
# Product Management REST API (CRUD)

This is a Spring Boot practice project that demonstrates building RESTful APIs with database integration using a clean layered architecture.
🛠️ Technologies Used

Java 21

Spring Boot

Spring REST

Spring Data JPA

Hibernate

MySQL

Maven

Postman (API Testing)

📂 Project Structure com.example.RestApiwithDatabase │ ├── entity → JPA Entity classes ├── Repository → Spring Data JPA Repositories ├── service → Service interfaces ├── service.impl → Business logic implementation ├── rest → REST Controllers ├── Exception → Custom exception handling

This structure follows industry-standard layered architecture:

Controller → Service → Repository → Database 🔗 Sample REST Endpoints Method Endpoint Description POST /products Add new product GET /products Get all products GET /products/{id} Get product by ID

🧪 API Testing

All APIs are tested using Postman with JSON request/response.

Sample Request Body :
{
        "id": 4,
        "name": "IPhone-16",
        "Catagory": "Smartphone",
        "price": 250000.0,
        "Brand": "Apple",
        "avaliblity": true,
        "qty": 4500
    }
⚙️ How to Run the Project

Clone the repository

git clone https://github.com/your-username//product-management-rest-api.git

Import into IDE (STS / IntelliJ / Eclipse)

Configure database in application.properties

Run as Spring Boot Application

Test APIs using Postman
