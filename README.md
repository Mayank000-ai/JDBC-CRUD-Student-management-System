# JDBC-CRUD-Student-management-System


# 📘 Student Management System (JDBC CRUD)

## 🔹 Overview
The **Student Management System** is a console-based Java application built using **JDBC (Java Database Connectivity)**. It performs basic **CRUD operations (Create, Read, Update, Delete)** on student records stored in a MySQL database.

This project demonstrates how Java applications interact with databases using JDBC and follows a layered architecture:



---

## 🛠️ Technologies Used
- Java (Core Java)
- JDBC API
- MySQL Database
- MySQL Connector/J (JDBC Driver)
- IDE (Eclipse / IntelliJ / VS Code)

---

## 🧩 Project Architecture

### 🔸 Controller Layer
- Handles user input/output
- Calls service methods

### 🔸 Service Layer
- Contains business logic
- Validates input data
- Calls DAO methods

### 🔸 DAO Layer
- Handles database operations
- Executes SQL queries using JDBC

### 🔸 Database Layer
- Stores student records

---

## 🗃️ Database Structure

**Table Name:** `student`

| Column Name | Data Type | Description        |
|------------|----------|--------------------|
| sid        | INT      | Student ID (PK)    |
| sname      | VARCHAR  | Student Name       |
| sage       | INT      | Student Age        |
| saddress   | VARCHAR  | Student Address    |

---

## ⚙️ Functionalities

### ✅ 1. Add Student (CREATE)
- Insert a new student record
- Inputs:
  - Student ID
  - Name
  - Age
  - Address

---

### 🔍 2. Search Student (READ)
- Fetch student details using **Student ID**
- Displays:
  - ID
  - Name
  - Age
  - Address

---

### ✏️ 3. Update Student (UPDATE)
- Update existing student details
- Fields:
  - Name
  - Age
  - Address

---

### ❌ 4. Delete Student (DELETE)
- Delete a student record using Student ID

---

## 🔌 JDBC Workflow

1. Load Driver  
2. Establish Connection  
3. Create Statement / PreparedStatement  
4. Execute Query  
5. Process Result  
6. Close Connection  

---

## ▶️ How to Run

### 1. Create Database
```sql
CREATE DATABASE student_db;


src/
│
├── controller/
│   └── TestApp.java
│
├── service/
│   ├── RStudentService.java
│   └── StudentServiceImpl.java
│
├── dao/
│   ├── RStudentDao.java
│   ├── StudentDaoImpl.java
│   └── StudentDaoFactory.java
│
├── util/
│   └── DBConnection.java
│
└── model/
    └── Student.java
