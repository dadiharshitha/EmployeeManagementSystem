# 💼 Employee Management System (Java + MySQL)

This is a simple **console-based Employee Management System** built using **Java** and **MySQL**, perfect for beginners and internship showcases.

---

## 📌 Features

✅ Add new employee  
✅ View all employees  
✅ Search by department  
✅ Update employee salary  
✅ Delete an employee  
✅ Export employee data to file

---

## 🛠️ Technologies Used

- Java (JDK 17 or above)
- MySQL (Workbench & JDBC connector)
- JDBC (Java Database Connectivity)
- CLI (Command Line Interface)

---

## 🧠 How to Run This Project

### 1. ✅ Prerequisites

- Install Java JDK
- Install MySQL Server & Workbench
- Download the MySQL Connector JAR (e.g. `mysql-connector-j-8.3.0.jar`)

### 2. 🔧 Setup

- Open **MySQL Workbench**
- Create a database:

```sql
CREATE DATABASE employees_db;
USE employees_db;

CREATE TABLE employee (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    department VARCHAR(50),
    salary DOUBLE
);
Update your EmployeeDAO.java file with your MySQL username and password.

3. ▶️ Run the Project
Open terminal in your project folder and execute:

bash
Copy
Edit
javac -cp .;mysql-connector-j-8.3.0.jar *.java
java -cp .;mysql-connector-j-8.3.0.jar Main

📂 Sample Screenshot of output:

![image alt] (https://github.com/dadiharshitha/EmployeeManagementSystem/blob/9e0922f43732d491b48462c0798ae35b72070e8b/EmpPic1.jpg)
![image alt](https://github.com/dadiharshitha/EmployeeManagementSystem/blob/7e4c705644461fe962f3868f5c9adb0f7ff1733b/EmpPic2.jpg)
![image alt](https://github.com/dadiharshitha/EmployeeManagementSystem/blob/de9ccd42a2f348ff8e7ff3a04cc5d114708043ff/EmpPic3.jpg)

🙋‍♀️ Created By
Harshitha Dadi
B.Tech - Final Year (Information Technology)
Linkedin : https://www.linkedin.com/in/harshitha-dadi-628477313/

📌 Future Scope
Convert this CLI app to a Java Web Application using Spring Boot + JSP
Add authentication and role-based access
Host it using Heroku / Render
