# AnknaHibernateProject-EmployeePerformanceSystem

# Employee Performance System

## Overview

The **Employee Performance System** is a Java-based application designed to manage employee performance data using Hibernate for Object-Relational Mapping (ORM). This system allows users to perform CRUD (Create, Read, Update, Delete) operations on employee records, performance reviews, departments, and other related entities. The project is built without the use of Spring, focusing solely on Hibernate and follows the DAO (Data Access Object) design pattern.

### Key Features

- **CRUD Operations**: Create, Read, Update, and Delete operations for employees, performances, departments, projects, feedback, skills, training, reviews, salaries, and leaves.
- **Associations**: Implements various associations between entities (e.g., one-to-many, many-to-one).
- **Cascading**: Supports cascading operations for related entities, ensuring that related data is managed effectively.
- **Additional Operations**: Includes methods for searching employees, pagination, and sorting.
- **JavaFX UI**: A simple user interface for managing employee records, making it user-friendly.

## Technologies Used

- **Java**: Programming language used for the application.
- **Hibernate**: ORM framework for database interactions.
- **MySQL**: Relational database management system for storing data.
- **Maven**: Build automation tool for managing project dependencies.
- **Lombok**: Java library that helps reduce boilerplate code.
- **JavaFX**: Framework for building the user interface.

## Prerequisites

Before you begin, ensure you have the following installed:

- **Java Development Kit (JDK)** 8 or higher
- **MySQL Server** (version 8.0 or higher)
- **Maven** (version 3.6 or higher)
- **Eclipse IDE** (or any Java IDE of your choice)

## Usage
Once the application is running, you can perform the following actions:

Add Employees: Use the UI to enter employee details and save them to the database.
View Employees: Retrieve and view the list of employees and their performance records.
Update Employees: Modify existing employee records through the UI.
Delete Employees: Remove employees from the database as needed.
Search Employees: Search for employees by name or other criteria.
View Performance Reports: Generate and view performance reports for employees.

## Folder Structure

EmployeePerformanceSystem/
|-- pom.xml                          # Maven configuration file
|-- src/
    |-- main/
        |-- java/
            |-- com/
                |-- example/
                    |-- dao/        # Data Access Object classes
                        |-- EmployeeDAO.java
                        |-- PerformanceDAO.java
                        |-- DepartmentDAO.java
                    |-- model/      # Entity classes
                        |-- Employee.java
                        |-- Performance.java
                        |-- Department.java
                        |-- Project.java
                        |-- Feedback.java
                        |-- Skill.java
                        |-- Training.java
                        |-- Review.java
                        |-- Salary.java
                        |-- Leave.java
                    |-- service/     # Service layer classes
                        |-- EmployeeService.java
                        |-- PerformanceService.java
                        |-- DepartmentService.java
                    |-- controller/  # Controller classes for handling requests
                        |-- EmployeeController.java
                        |-- PerformanceController.java
                        |-- DepartmentController.java
                    |-- util/        # Utility classes
                        |-- HibernateUtil.java
                        |-- Constants.java
        |-- resources/
            |-- hibernate.cfg.xml    # Hibernate configuration file
            |-- fxml/                # FXML files for JavaFX UI
                |-- employee.fxml     # FXML for employee management UI
                |-- performance.fxml   # FXML for performance management UI
                |-- department.fxml    # FXML for department management UI
            |-- css/                 # CSS files for styling
                |-- styles.css        # Styles for JavaFX UI
            |-- images/              # Images used in the application
                |-- logo.png          # Application logo
        |-- webapp/                   # Web resources (if applicable)
            |-- css/                 # CSS files for web UI (if applicable)
            |-- js/                  # JavaScript files (if applicable)
|-- target/                           # Compiled classes and packaged application
|-- .gitignore                        # Git ignore file
|-- README.md                         # Project documentation


