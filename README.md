# Enterprise-Library-Management-API
A production-grade RESTful API built with Spring Boot 3.5 and Java 17. using Three-Layer Architecture (Controller-Service-DAO) to ensure separation of concerns and scalability.

# Architectural Design
The application follows the "Separation of Concerns (SoC)" principle:

1. Controller Layer (REST): 
    - Handles HTTP Requests (GET, POST, DELETE).
    - Stateless and "dumb" — purely delegates to the Service layer.
2. Service Layer (@Service): 
    - Contains the business logic.
    - Manages **Transaction Boundaries** (`@Transactional`) to ensure data integrity.
    - Acts as a bridge between the API and the Database.
3. DAO Layer (DAO): 
    - Using the JPA `EntityManager` for more control over SQL commands.
    - Manually managing persistence contexts rather than relying solely on abstract interfaces.

##  Tech Stack
* **Core:** Java 17, Spring Boot 3.5.7
* **Data:** Hibernate ORM, MySQL, Spring Data JPA
* **API Documentation:** OpenAPI / Swagger UI (SpringDoc 2.8.14)
* **Build Tool:** Maven

## 🚀 How to Run
1.  Clone the repository.
2.  Configure your MySQL database in `src/main/resources/application.properties`.
3.  Run the application:
    ```bash
    ./mvnw spring-boot:run
    ```
4.  Access the **Swagger UI** Documentation:
    * URL: `http://localhost:8080/swagger-ui/index.html`

## Project Structure
```text
src/main/java/com/library/management
├── rest/       # API Controllers (The Entry Point)
├── service/    # Business Logic & Transaction Management
├── dao/        # Data Access Objects (EntityManager Implementation)
└── entity/     # JPA Entities (Database Tables)
```

Endpoints with OpenAPI:
<img width="1920" height="902" alt="image" src="https://github.com/user-attachments/assets/b9d19bb4-77de-4e8b-843c-afe60f72e84c" />

Example database in MySQL:
<img width="452" height="542" alt="image" src="https://github.com/user-attachments/assets/fe5c60fb-4f3a-4a59-a8d2-7e6392de2665" />
