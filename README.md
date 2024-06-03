# Shiavnski_Employee
This project is an Employee Management System that uses a REST API, PostgreSQL, and JWT for security. It helps you manage employee and department data.

<pre>
<h2>Features</h2>
Employee Management: Add, view, update, and delete employee records.
Department Management: Manage departments and link employees to departments.
Secure Access: Use JWT (JSON Web Tokens) for secure login and access.
Data Integrity: Employees are linked to departments using foreign keys in the database.

<h2>API Endpoints<h2>

<h6>
Authentication:
POST /authenticate - To validate user and generate the token.
  
Employees:
GET /employees - Get all employees.
GET /employees/{employeeId}- Get a specific employee.
POST /add/employees - Add a new employee.
PUT /employees/{employeeId} - Update an employee.
DELETE /employees/{employeeId} - Delete an employee.
  
Departments:
GET /departments - Get all departments.
GET /departments/{departmentId} - Get a specific department.
POST /departments - Add a new department.
PUT /departments/{departmentId} - Update a department.
DELETE /departments/{departmentId}- Delete a department.
</h6>
<h2>Security</h2>
This system uses JWT tokens to secure the API. Make sure to keep tokens safe and refresh them as needed.

<h2>Technologies Used</h2>
This Employee Management System is built with the following technologies:
Spring Tool Suite (STS): To develop the RESTful API.
PostgreSQL: As database.
JSON Web Tokens (JWT): To secure API endpoints.
Role-Based Authentication: To control on access.
</pre>
