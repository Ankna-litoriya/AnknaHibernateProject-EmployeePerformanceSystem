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

## Setup Instructions

Follow these steps to set up the project on your local machine:

### 1. Clone the Repository

Open your terminal or command prompt and run the following command to clone the repository:

```bash
git clone https://github.com/yourusername/EmployeePerformanceSystem.git
cd EmployeePerformanceSystem

CREATE DATABASE employee_performance;




