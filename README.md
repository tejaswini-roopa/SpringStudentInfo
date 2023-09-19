# SpringStudentInfo
SpringStudentInfo is a simple Spring Boot web application that manages student information. It provides basic CRUD (Create, Read, Update, Delete) operations for student records.
## Features

- Create, read, update, and delete student records.
- Store student data in a relational database using Spring Data JPA.
- Expose a RESTful API for interacting with student records.
## Technologies Used

- [Spring Boot](https://spring.io/projects/spring-boot) - Framework for building Java applications.
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa) - Simplifies database access with Java Persistence API.
- [MySQL](https://www.mysql.com/) - The chosen relational database management system.
- [Maven](https://maven.apache.org/) - Dependency management and build tool.

Navigate to the project directory:
-   cd SpringStudentInfo
Configure the database connection by editing the application.properties file in the src/main/resources directory. Replace the placeholders with your MySQL credentials:
-   spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
    spring.datasource.username=your_username
    spring.datasource.password=your_password
Build and run the project using Maven:
-    mvn spring-boot:run
Application will be available at http://localhost:8080.      
