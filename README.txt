# Employee Management System - Java + MySQL + JDBC

## Features
- Add Employee
- View All Employees
- Search by Department
- Update Salary
- Delete Employee
- Export to File

## Database Setup
Run the following SQL on your MySQL server:

CREATE DATABASE employees_db;
USE employees_db;
CREATE TABLE employees (
    id INT PRIMARY KEY,
    name VARCHAR(100),
    department VARCHAR(50),
    salary DOUBLE
);

## How to Run
1. Update JDBC URL, username, password in EmployeeDAO.java
2. Compile all `.java` files
3. Run `Main.java`