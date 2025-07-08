# Course Registration System

A secure backend API built with **Spring Boot**, **Spring Security**, and **MySQL** that allows students to register for courses and enables administrators to manage student and course data.

---

## 🚀 Features

- ✅ User authentication with **Basic Auth**
- 🧾 CRUD operations for Students and Courses
- 🔐 Role-based access (Admin vs Student)
- 🔧 Spring Data JPA & Hibernate for efficient ORM
- 📬 Tested with Postman (all endpoints)
- 🔗 Designed to support integration with a frontend (HTML/CSS/JavaScript)

---

## 🛠️ Tech Stack

- Java 17+
- Spring Boot 3.x
- Spring Security
- Spring Data JPA (Hibernate)
- MySQL
- Postman (for testing)

---

## 📂 Project Structure

├── src/
│ ├── main/
│ │ ├── java/com/example/courseregistration/
│ │ │ ├── controller/
│ │ │ ├── model/
│ │ │ ├── repository/
│ │ │ ├── service/
│ │ │ └── security/
│ │ └── resources/
│ │ ├── application.properties
├── pom.xml

---

## 📦 Getting Started

### 1. Clone the Repository

```
git clone https://github.com/mohamedasif3/course-registration-system.git
cd course-registration-system
```

### 2. Set Up MySQL Database
Create a MySQL database (e.g., coursedb) and update your credentials in:

```
src/main/resources/application.properties

Example:
```
spring.datasource.url=jdbc:mysql://localhost:3306/coursedb
spring.datasource.username=root
spring.datasource.password=yourpassword
```
### 3. Build the Project
Make sure you have Maven installed:

```
./mvnw clean install
```
Or use:
```
mvn clean install
```
### 4. Run the Application
```
./mvnw spring-boot:run
```
Or use:
```
mvn spring-boot:run
```

🔐 Authentication
This project uses Basic Authentication. Use Postman to test endpoints by setting Authorization type to Basic Auth.

Example Credentials:
Admin: admin / admin123

Student: student / student123

🔒 Credentials can be configured in the SecurityConfig.java file or loaded from the database.

Add the fist credentials manually using password hasher file.


📌 Future Improvements
Add JWT-based authentication

Build a full frontend in React or HTML/CSS

Add validation and error handling

Deploy on Render/Heroku

📧 Contact
Developed by Mohamed Asif
🔗 GitHub: @mohamedasif3

📄 License
This project is licensed under the MIT License.
