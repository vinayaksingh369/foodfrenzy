# FoodFrenzy Project Full Client Documentation

## Overview

**FoodFrenzy** is a full-stack web application for managing customers, inventory, and orders in a food business. It provides secure authentication, role-based access, and seamless integration with a MySQL database. Built with Spring Boot and Thymeleaf, it offers a user-friendly interface for both administrators and staff.

---

## Table of Contents

- [Features](#features)
- [Technology Stack](#technology-stack)
- [Project Structure](#project-structure)
- [Setup and Installation](#setup-and-installation)
- [API Documentation](#api-documentation)
- [API Testing with Postman](#api-testing-with-postman)
- [Data Flow Diagram](#data-flow-diagram)
- [Page Routing](#page-routing)
- [Troubleshooting](#troubleshooting)
- [Repository Index](#repository-index)
- [Acknowledgments](#acknowledgments)

---

## Features

- **Customer Management:** Add, update, and delete customer information.
- **Inventory Management:** Track inventory items, stock levels, and pricing.
- **Order Management:** Manage customer orders, creation, updates, and status tracking.
- **User Authentication:** Secure login for admin and staff.
- **Role-Based Access Control:** Define roles and permissions.
- **Thymeleaf Templates:** Dynamic HTML templates.
- **Database Integration:** MySQL for data storage and retrieval.

---

## Technology Stack

- **Backend:** Spring Boot, Java 21, Spring MVC, Spring Data JPA (Hibernate)
- **Frontend:** Thymeleaf, HTML, CSS, JavaScript
- **Database:** MySQL
- **IDE:** IntelliJ IDEA, Eclipse, or Spring Tool Suite (STS)
- **API Docs:** Swagger UI

---

## Project Structure

```plaintext
src/
├── main/
│   ├── java/
│   │   └── com.example.demo/
│   │       ├── controllers/    # Controllers (HomeController, UserController, etc.)
│   │       ├── entities/       # Entity classes (User, Product, Orders, etc.)
│   │       ├── repositories/   # Repository interfaces (UserRepository, etc.)
│   │       └── services/       # Service classes (UserServices, etc.)
│   ├── resources/
│   │   ├── templates/          # Thymeleaf HTML templates
│   │   ├── static/             # Static assets (CSS, JS, images)
│   │   └── application.properties  # Configuration
│   └── webapp/
│       └── WEB-INF/views/      # Additional view files
└── test/                       # Unit tests
```

---

## Setup and Installation

1. **Clone the repository:**
    ```bash
    git clone https://github.com/vinayaksingh369/FoodFrenzy.git
    cd FoodFrenzy
    ```

2. **Configure MySQL Database:**
    - Create a new MySQL database.
    - Update `src/main/resources/application.properties`:
      ```properties
      spring.datasource.url=jdbc:mysql://localhost:3306/foodfrenzy
      spring.datasource.username=YOUR_USERNAME
      spring.datasource.password=YOUR_PASSWORD
      spring.jpa.hibernate.ddl-auto=update
      ```

3. **Run the project:**
    ```bash
    mvn spring-boot:run
    ```

4. **Access the application:**
    - Home: [http://localhost:8080/](http://localhost:8080/)
    - Products: [http://localhost:8080/products](http://localhost:8080/products)
    - Location: [http://localhost:8080/location](http://localhost:8080/location)
    - About: [http://localhost:8080/about](http://localhost:8080/about)
    - Login: [http://localhost:8080/login](http://localhost:8080/login)

---

## API Documentation

This project uses Swagger UI for interactive API documentation.

- After starting the backend, open [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html) in your browser to view and test all REST APIs.

---

## API Testing with Postman

A Postman collection is included for easy backend testing.
- Import `FoodFrenzyBackendTest.postman_collection.json` into Postman.
- Run the requests to verify backend endpoints.

---

## Data Flow Diagram

```mermaid
flowchart TD
    A[User (Browser)] -->|Form Submit/API Call| B[Controller]
    B -->|Calls| C[Service]
    C -->|Calls| D[Repository]
    D -->|JPA/Hibernate| E[(MySQL Database)]
    E -->|Returns Data| D
    D -->|Returns Entity| C
    C -->|Returns Data| B
    B -->|Returns View/JSON| A
```

---

## Page Routing

| URL Path         | View/Template      | Description                |
|------------------|--------------------|----------------------------|
| `/home` or `/`   | `Home`             | Home page                  |
| `/products`      | `Products`         | Product listing page       |
| `/location`      | `Locate_us`        | Location/contact page      |
| `/about`         | `About`            | About page                 |
| `/login`         | `Login`            | Login page                 |
| `/api/users`     | REST API           | User management endpoints  |
| `/api/products`  | REST API           | Product management         |
| `/api/orders`    | REST API           | Order management           |

---

## Troubleshooting

- **404 Whitelabel Error Page:**  
  Ensure you are using the correct URL and the backend is running.

- **Database Connection Issues:**  
  Make sure MySQL is running and your credentials in `application.properties` are correct.

- **Java Version Issues:**  
  Use Java 21 or Java 17 for compatibility with Spring Boot 3.x.

---

## Repository Index

- `src/main/java/com/example/demo/controllers/` — Controllers (e.g., `HomeController.java`, `UserController.java`)
- `src/main/java/com/example/demo/entities/` — Entity classes (e.g., `User.java`, `Product.java`)
- `src/main/java/com/example/demo/repositories/` — Repository interfaces (e.g., `UserRepository.java`)
- `src/main/java/com/example/demo/services/` — Service classes (e.g., `UserServices.java`)
- `src/main/resources/templates/` — Thymeleaf HTML templates
- `src/main/resources/static/` — Static files (CSS, JS, images)
- `src/main/resources/application.properties` — Main configuration file
- `README.md` — Project documentation
- `pom.xml` — Maven build configuration

---

## Acknowledgments

This project is fully made by **vinayak singh** with guidance from Q Spider Institute.

---

**For any queries or contributions, please contact [vinayaksingh369](https://github.com/vinayaksingh369)

---

## Client Acceptance Test & Demonstration Document

### Objective

To demonstrate the FoodFrenzy hotel application to the client, showcasing all major features including food item management, user roles, and order processing, ensuring the project meets client requirements.

---

### Demonstration Checklist

#### 1. **Login & Role-Based Access**
- Show secure login for admin and staff.
- Demonstrate different access levels (admin vs. staff).

#### 2. **Dashboard Overview**
- Present the main dashboard after login.
- Highlight quick links to customers, inventory, and orders.

#### 3. **Customer Management**
- Add a new customer and display the updated customer list.
- Edit and delete customer information.

#### 4. **Food/Inventory Management**
- Add a new food item (name, price, stock).
- Update existing food item details.
- Remove a food item from inventory.
- Show real-time stock level updates.

#### 5. **Order Management**
- Create a new order for a customer, selecting food items.
- Update order status (e.g., pending, completed).
- View order history and details.

#### 6. **Page Navigation**
- Navigate through Home, Products, Location, About, and Login pages.
- Show REST API endpoints via Swagger UI.

#### 7. **API Testing (Optional)**
- Use Postman to demonstrate backend API endpoints for users, products, and orders.

---

### Acceptance Criteria

- All features listed in the documentation are present and functional.
- User interface is intuitive and responsive.
- Data is correctly stored and retrieved from the MySQL database.
- Role-based access is enforced.
- No critical bugs or errors during demonstration.

---

### Client Feedback

- The client is encouraged to test adding, editing, and deleting food items and customers.
- The client should verify order creation and status updates.
- Any suggestions or required changes can be noted for further development.

---

### Conclusion

**FoodFrenzy** is ready for client acceptance. All core hotel application features, including food item management, customer handling, and order processing, have been implemented and tested. The project is now ready for deployment and real-world use.

---


Here are some important features and best practices you may not have yet, but are highly recommended for professional software development and real-world deployment:

1. Exception Handling & Error Pages
Implement global exception handling using @ControllerAdvice to provide user-friendly error messages and avoid exposing stack traces.
Create custom error pages for 404, 500, etc., in src/main/resources/templates/error/.
2. Logging
Use a logging framework (like SLF4J with Logback) for all backend logs.
Store logs in files for auditing and debugging (src/main/resources/logback-spring.xml).
3. Environment Configuration
Use environment-specific configuration files (e.g., application-dev.properties, application-prod.properties) for database URLs, credentials, and other settings.
Never hardcode sensitive data in your codebase.
4. Security Best Practices
Store passwords securely (always hash passwords using BCrypt or similar).
Use HTTPS in production.
Implement CSRF protection and input validation to prevent attacks.
5. Unit & Integration Testing
Write unit tests for services and controllers using JUnit and Mockito.
Add integration tests to verify end-to-end functionality.
6. CI/CD Pipeline
Set up Continuous Integration/Continuous Deployment (CI/CD) using GitHub Actions, Jenkins, or GitLab CI for automated builds and deployments.
7. API Versioning
Version your REST APIs (e.g., /api/v1/users) to allow for future upgrades without breaking existing clients.
8. Documentation
Use JavaDoc for your classes and methods.
Keep your Swagger/OpenAPI documentation up to date.
9. Database Migrations
Use a tool like Flyway or Liquibase for managing database schema changes in a controlled and versioned way.
10. Dockerization
Create a Dockerfile to containerize your application for easy deployment and scaling.
Optionally, use docker-compose to run your app and MySQL together.
11. Monitoring & Health Checks
Expose health endpoints using Spring Boot Actuator (/actuator/health).
Set up monitoring for uptime and performance.
12. Role Management UI
Provide an admin UI to manage user roles and permissions dynamically.
13. Email Notifications
Send email notifications for order confirmations, password resets, etc.
Adding these features will make your project more robust, secure, and production-ready!
If you want code examples or setup instructions for any of these, just ask!


Here are new concepts and best practices you can study and add to your project to make it even more modern, scalable, and professional:

1. JWT Authentication
Use JSON Web Tokens (JWT) for stateless, secure authentication in REST APIs.
This is more scalable than session-based authentication and is industry standard for APIs.
2. Spring Boot Actuator
Add the spring-boot-starter-actuator dependency.
Exposes endpoints like /actuator/health, /actuator/metrics for monitoring, health checks, and management.
3. API Rate Limiting
Prevent abuse by limiting how often users can call your APIs.
Use libraries like Bucket4j or Spring Cloud Gateway for rate limiting.
4. OpenAPI/Swagger Code Generation
Use OpenAPI specifications to auto-generate client SDKs or server stubs for your API.
This helps frontend and mobile teams integrate faster.
5. Flyway or Liquibase for Database Migrations
Manage DB schema changes with versioned migration scripts.
Ensures all environments (dev, test, prod) are in sync.
6. Docker & Docker Compose
Containerize your app and database for consistent deployment.
Use docker-compose.yml to run both app and MySQL together.
7. Cloud Deployment
Deploy your app to cloud platforms like AWS, Azure, or Google Cloud.
Learn about managed databases, load balancers, and cloud storage.
8. API Gateway & Microservices
Learn about API gateways (like Spring Cloud Gateway) and breaking your app into microservices for large-scale systems.
9. CI/CD Automation
Automate build, test, and deployment using GitHub Actions, Jenkins, or GitLab CI.
Ensures every code push is tested and can be deployed automatically.
10. Frontend Framework Integration
Try integrating a modern frontend (React, Angular, Vue) with your backend for a more dynamic UI.
11. Unit, Integration & End-to-End Testing
Write tests for all layers: JUnit/Mockito for backend, Selenium/Cypress for frontend.
12. API Documentation with Examples
Use Swagger annotations to add example requests/responses for each endpoint.
13. Internationalization (i18n)
Support multiple languages using Spring’s message resource bundles.
14. Performance Profiling
Use tools like Spring Boot DevTools, VisualVM, or YourKit to profile and optimize performance.
