# Student Management REST API

A simple Spring Boot project to manage student records using a MySQL database. This project supports basic CRUD operations and is tested using Postman.

---

## 📚 Student Model

Each student record contains:

- `id` (Long, auto-generated)
- `name` (String)
- `email` (String)
- `course` (String)

---

## 🔗 REST API Endpoints

| Method | Endpoint            | Description             |
|--------|---------------------|-------------------------|
| POST   | `/students/add`     | Add a new student       |
| GET    | `/students`         | Get all students        |
| GET    | `/students/{id}`    | Get a student by ID     |
| PUT    | `/students/{id}`    | Update a student by ID  |
| DELETE | `/students/{id}`    | Delete a student by ID  |

---

## 🛠️ MySQL Configuration

Update your `application.properties` like this:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/student_db
spring.datasource.username=my username
spring.datasource.password=my password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
