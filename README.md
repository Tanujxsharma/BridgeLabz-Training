# BridgeLabz Training - Database Learning Journey



This README documents the learning progress across the days of the training program.

---

# Day 1 - DBMS Fundamentals & SQL

## Overview

Today we covered the foundational concepts of Database Management Systems, relational databases, SQL basics, MySQL installation, SQL commands, database design principles, normalization, joins, and industry best practices.

## Topics Covered

### 1. Database Fundamentals
- What is Data?
- Database
- DBMS
- File System vs DBMS
- Advantages of DBMS
- Types of DBMS
- RDBMS
- Features of RDBMS
- Relational vs Non-Relational Database
- SQL vs NoSQL
- When to use SQL
- When to use NoSQL

### 2. Introduction to MySQL
- Introduction to MySQL
- MySQL Architecture
- Installing MySQL
- MySQL CLI
- Creating Databases
- Creating Tables
- Understanding Storage Engine

### 3. SQL Command Categories
- DDL (CREATE, ALTER, DROP, TRUNCATE, RENAME)
- DML (INSERT, UPDATE, DELETE)
- DQL (SELECT)
- TCL (COMMIT, ROLLBACK, SAVEPOINT)
- DCL (GRANT, REVOKE)

### 4. SQL Keys
- Primary Key
- Foreign Key
- Candidate Key
- Composite Key
- Unique Key

### 5. SQL Joins
- INNER JOIN
- LEFT JOIN
- RIGHT JOIN
- FULL OUTER JOIN
- CROSS JOIN
- SELF JOIN

### 6. Database Normalization
- First Normal Form (1NF)
- Second Normal Form (2NF)
- Third Normal Form (3NF)
- BCNF
- Fourth Normal Form (4NF)
- Denormalization

### 7. Database Design Best Practices
- Choosing proper data types
- Primary & foreign keys
- Constraints
- Default values
- Normalization
- Naming conventions

### 8. Query Optimization
- Efficient SQL queries
- Using EXPLAIN
- Prepared statements
- Stored procedures
- Optimizing WHERE clauses
- Pagination (LIMIT & OFFSET)

### 9. Performance Optimization
- Connection pooling
- Transactions
- Partitioning
- Sharding
- Caching
- Indexing basics

### 10. Security Best Practices
- SQL injection prevention
- Parameterized queries
- User roles
- Least privilege principle
- Data encryption

### 11. Backup & Recovery
- Database backups
- Monitoring
- Replication
- Failover

### 12. Industry Standards
- ACID properties
- GDPR / HIPAA / PCI-DSS awareness
- Schema documentation
- Version control for database changes

### 13. Practical Session
- Installed MySQL
- Configured MySQL server
- Used MySQL CLI
- Created database
- Created tables
- Inserted records
- Updated records
- Deleted records
- Modified tables
- Executed SQL queries
- Created database users

## Learning Outcomes
- Understand DBMS and RDBMS concepts
- Understand SQL vs NoSQL
- Install and configure MySQL
- Create databases and tables
- Perform CRUD operations
- Understand SQL command categories
- Write JOIN queries
- Understand normalization
- Learn database design principles
- Follow SQL industry best practices
- Write secure and optimized SQL queries

---

# Day 2 - Advanced Database Design & Query Optimization

## Overview

Building upon Day 1, today’s session focused on designing a more realistic database schema, implementing different types of relationships, verifying normalization using an actual table, understanding indexing strategies, and optimizing SQL queries using the EXPLAIN statement.

## Topics Covered

### 14. Database Schema Extension
- Extended the Health Clinic database
- Added the Rooms table
- Created a Doctor-Room relationship
- Assigned doctors to consultation rooms
- Inserted sample room data

### 15. Entity Relationships
- One-to-One Relationship
- One-to-Many Relationship
- Many-to-Many Relationship
- Junction (Bridge) Tables
- Foreign Keys
- Cascading Deletes

### 16. Practical Database Normalization
Verified the patient_phones table satisfies:
- First Normal Form (1NF)
- Second Normal Form (2NF)
- Third Normal Form (3NF)

Topics covered:
- Atomic values
- Functional dependency
- Partial dependency
- Transitive dependency

### 17. SQL Indexing
- Why indexes are required
- Single Column Index
- Composite Index
- Covering Index
- Index selection
- Query optimization using indexes

### 18. EXPLAIN Statement
Executed and analyzed query execution plans.

Compared:
- Query without index
- Query using single-column index
- Query using composite index

Observed:
- type
- possible_keys
- key
- rows
- Extra

### 19. Covering Index
- Created a covering index
- Optimized reporting queries
- Verified index usage in EXPLAIN
- Reduced unnecessary table lookups

### 20. SQL Performance Optimization
- Table Scan vs Index Scan
- Efficient indexing strategies
- Choosing appropriate indexes
- Avoiding unnecessary full table scans

### 21. Practical Session
Completed the following:
- Extended database schema
- Created the rooms table
- Created the doctor_room junction table
- Inserted sample data
- Executed EXPLAIN on multiple queries
- Compared query execution plans
- Created covering indexes
- Verified database normalization

## Additional Learning Outcomes
- Design scalable relational databases
- Create many-to-many relationships
- Build junction tables
- Apply normalization practically
- Create efficient indexes
- Analyze SQL execution plans
- Improve query performance
- Understand how MySQL chooses indexes
- Design optimized database schemas

## Assignment Completed
- Extended the Health Clinic schema with Rooms and Doctor-Room relationship
- Verified the patient_phones table satisfies 1NF, 2NF, and 3NF
- Created and tested Single Column, Composite, and Covering indexes
- Compared query execution plans using EXPLAIN
- Optimized reporting queries using covering indexes

---

# Day 3 - SQL Joins, Stored Procedures, Triggers

## Overview

Today we moved from single-table queries to combining data across multiple related tables using SQL joins, then learned how to store reusable database logic in stored procedures and automate database actions with triggers.

## Topics Covered

### SQL Joins
1. INNER JOIN
2. LEFT JOIN
3. RIGHT JOIN
4. FULL OUTER JOIN
5. SELF JOIN
6. CROSS JOIN
7. Multiple Table Join

### Stored Procedures
8. Why Stored Procedures
9. Creating Procedures
10. Calling Procedures
11. IN Parameter
12. OUT Parameter
13. INOUT Parameter
14. Error Handling

### Triggers
15. BEFORE INSERT
16. AFTER INSERT
17. BEFORE UPDATE
18. AFTER UPDATE
19. BEFORE DELETE
20. AFTER DELETE

## Mini Overview
- We moved from single-table queries to combining data across multiple related tables using all major JOIN types.
- We wrote multi-table joins across the normalized Health Clinic schema (Patients, Doctors, Appointments, Billing, VisitHistory) to produce meaningful reports.
- We learned stored procedures as precompiled, reusable SQL logic stored inside the database.
- We finished with triggers to automatically maintain audit logs and enforce business rules at the database level.

## Expected Outcome
- You will be able to write any combination of JOINs confidently and know when to use INNER vs LEFT vs SELF vs CROSS.
- You will be able to design and call stored procedures with IN, OUT, and INOUT parameters, with proper error handling.
- You will be able to write triggers that automatically maintain audit logs and enforce business rules without relying on application code.
- You will build the Appointment Procedure, Billing Procedure, Visit History Trigger, and Audit Trigger for the Health Clinic project.

## Health Clinic Database Schema
- Patients(patient_id, name, dob, gender, phone, address)
- Doctors(doctor_id, name, phone, specialization_id)
- Specializations(specialization_id, name)
- Appointments(appointment_id, patient_id, doctor_id, appointment_date, status)
- VisitHistory(visit_id, appointment_id, notes, visit_date)
- Billing(bill_id, appointment_id, amount, payment_status, bill_date)

## Part 1 - SQL Joins

### 1. INNER JOIN
- Returns only rows where there is a match in both tables.
- Example: join Appointments with Patients and Doctors to get confirmed appointment details.

### 2. LEFT JOIN
- Returns all rows from the left table and matched rows from the right table.
- Unmatched rows from the right side appear as NULL.
- Example: list all patients even if they have never booked an appointment.

### 3. RIGHT JOIN
- Mirror of LEFT JOIN.
- Returns all rows from the right table and matched rows from the left table.

### 4. FULL OUTER JOIN
- Returns all rows from both tables.
- MySQL does not support it natively, so it is simulated using UNION with LEFT and RIGHT joins.

### 5. SELF JOIN
- A table is joined with itself using aliases.
- Useful for hierarchical or related data such as doctor mentorship relationships.

### 6. CROSS JOIN
- Produces the Cartesian product of two tables.
- Useful for generating a complete availability grid before filtering.

### 7. Multiple Table Join
- Chaining more than two tables in one query.
- Example: join Appointments, Patients, Doctors, Specializations, and Billing in one report.

## Part 2 - Stored Procedures

### Why Stored Procedures
- Stored procedures are reusable SQL logic saved inside the database.
- They reduce network round-trips and centralize business rules.

### Creating Procedures
- Use DELIMITER before creating a procedure because the procedure body contains semicolons.
- Example: create a procedure to get patient appointments.

### Calling Procedures
- Use CALL procedure_name(arguments);

### Parameter Types
- IN: passes a value into the procedure and is read-only inside it.
- OUT: returns a value from the procedure to the caller.
- INOUT: passes an initial value, allows modification inside the procedure, and returns the updated value.

### Error Handling
- Use handlers such as SQLEXCEPTION to rollback transactions and return meaningful messages.

## Part 3 - Triggers

### Trigger Concept
- A trigger executes automatically when an INSERT, UPDATE, or DELETE occurs.
- BEFORE triggers run before data is changed.
- AFTER triggers run after the change has been made.

### Common Trigger Examples
- BEFORE INSERT: validate appointment dates.
- AFTER INSERT: insert an audit log entry.
- BEFORE UPDATE: update a billing field automatically.
- AFTER UPDATE: create VisitHistory when an appointment is marked Completed.
- BEFORE DELETE: prevent deletion of patients with active appointments.
- AFTER DELETE: archive deleted patient records.

## Day 3 Wrap-Up
- Appointment Procedure: BookAppointment
- Billing Procedure: GenerateBill / ApplyDiscount
- Visit History Trigger: auto-inserts a visit record when an appointment is marked Completed
- Audit Trigger: logs every INSERT into Appointments

## Interview Practice Summary
- INNER JOIN returns only matching rows, while LEFT JOIN keeps all rows from the left table.
- A LEFT JOIN followed by a filter on the right table’s key can be used to find unmatched records.
- MySQL does not support FULL OUTER JOIN natively, so it is often simulated with UNION.
- Stored procedures reduce repeated SQL logic and centralize database operations.
- Triggers are useful for validation, auditing, and enforcing rules automatically.

---

## Next Learning Goals
- Aggregate Functions
- GROUP BY
- HAVING
- ORDER BY
- SQL Functions
- Views
- Transactions
- ACID Properties (Practical)
- Advanced SQL Queries

---

# Day 4 - JDBC and MySQL

## Overview
Today I completed the complete JDBC implementation for my Health Clinic Management System project using Java, MySQL, JDBC, and Maven following a layered architecture.

## Database
- Designed and created the Health Clinic database in MySQL.
- Created tables:
  - Patients
  - Doctors
  - Specializations
  - Doctor Specializations (Many-to-Many)
  - Appointments
  - Billing
  - Visit History
  - Audit Log
- Added:
  - Primary Keys
  - Foreign Keys
  - Unique Constraints
  - Indexes
  - Triggers
  - Sample Data

## Project Structure
```
HealthClinicApp
│
├── config
│   └── DatabaseConnection.java
│
├── dto
│   ├── Patient.java
│   ├── Doctor.java
│   ├── Specialization.java
│   ├── Appointment.java
│   ├── Billing.java
│   └── VisitHistory.java
│
├── dao
│   ├── PatientDAO
│   ├── PatientDAOImpl
│   ├── DoctorDAO
│   ├── DoctorDAOImpl
│   ├── SpecializationDAO
│   ├── SpecializationDAOImpl
│   ├── AppointmentDAO
│   ├── AppointmentDAOImpl
│   ├── BillingDAO
│   ├── BillingDAOImpl
│   ├── VisitHistoryDAO
│   └── VisitHistoryDAOImpl
│
├── service
│   └── AppointmentService.java
│
├── ui
│   └── ConsoleMenu.java
│
└── Main.java
```

## JDBC Concepts Learned

### JDBC Architecture
- DriverManager
- Connection
- PreparedStatement
- ResultSet
- SQLException Handling

### CRUD Operations
Implemented complete CRUD operations for:
- Patient
- Doctor
- Specialization
- Appointment
- Billing
- Visit History

Operations included:
- INSERT
- SELECT By ID
- SELECT ALL
- UPDATE
- DELETE

### PreparedStatement
Used PreparedStatement for every SQL query to:
- Prevent SQL Injection
- Improve Performance
- Bind Parameters Safely

### ResultSet Mapping
Converted database records into Java DTO objects.

### Auto Generated Keys
Learned how to retrieve auto-generated primary keys.

### Try-With-Resources
Used try-with-resources to automatically close:
- Connection
- PreparedStatement
- ResultSet

### DAO Pattern
Implemented DAO (Data Access Object) pattern.

### DTO Pattern
Created DTO classes for every database table.

### Layered Architecture
Console UI
      │
      ▼
Service Layer
      │
      ▼
DAO Layer
      │
      ▼
Database

Each layer has a single responsibility.

### Transaction Management
Implemented transaction handling inside AppointmentService.

### Business Logic
Implemented a real-world business workflow:
- Complete Appointment
- Update Appointment Status
- Generate Bill
- Store Visit History
- Commit Transaction

If any query fails:
- Rollback

### Console Application
Built a menu-driven console application capable of:
- Register Patient
- View Patient
- View All Patients
- Register Doctor
- View Doctors
- Book Appointment
- Complete Appointment

### Technologies Used
- Java
- JDBC
- MySQL
- Maven
- MySQL Workbench
- IntelliJ IDEA
- Git
- GitHub

### Key Concepts Practiced
- JDBC API
- CRUD Operations
- PreparedStatement
- ResultSet
- DAO Pattern
- DTO Pattern
- Layered Architecture
- Transaction Management
- Exception Handling
- Connection Management
- Auto Generated Keys
- SQL Integration with Java
- Foreign Keys
- Relationships
- ACID Properties
- Commit & Rollback

### Outcome
Successfully developed a layered Health Clinic Management System using Java, JDBC, and MySQL, implementing complete CRUD operations, transaction management, and a modular architecture that follows real-world backend development practices.

---

# Day 5 - Java Servlet Fundamentals

## Topics Covered

### Java Servlet Basics
- Introduction to Java Servlets
- Understanding the role of Servlets in Java Web Applications
- Servlet Architecture
- Servlet Life Cycle Overview

### Apache Tomcat
- Downloading and configuring Apache Tomcat 10
- Setting up JAVA_HOME and environment variables
- Deploying WAR files on Tomcat
- Understanding the webapps directory and application deployment
- Running and testing applications on the Tomcat server

### Maven Web Application
- Creating a Maven-based Dynamic Web Project
- Project structure for Servlet applications
- Configuring pom.xml
- WAR packaging and Maven build process

### Servlet Development
- Creating a Servlet by extending HttpServlet
- Mapping Servlets using @WebServlet
- Understanding HttpServletRequest
- Understanding HttpServletResponse
- Using PrintWriter to send responses to the client

### HTTP Methods
- Implementing doGet()
- Implementing doPost()
- Difference between GET and POST requests
- Handling request parameters using request.getParameter()

### HTML Form Integration
- Creating HTML forms
- Form submission using GET and POST methods
- Connecting HTML forms with Servlets
- Processing user input on the server

### Project Completed
- Greeting Application using Java Servlet
  - HTML Form
  - Servlet Mapping
  - GET Request Handling
  - POST Request Handling
  - Dynamic Response Generation

### Troubleshooting and Debugging
- Fixing JAVA_HOME configuration issues
- Resolving Tomcat deployment problems
- Fixing HTTP 404 (Not Found)
- Fixing HTTP 405 (Method Not Allowed)
- Understanding WAR deployment and project structure
- Rebuilding and redeploying Maven projects

## Technologies Used
- Java 21
- Jakarta Servlet API 6
- Apache Tomcat 10
- Maven
- HTML
- IntelliJ IDEA

## Key Concepts Learned
- Java Servlet Fundamentals
- Web Application Deployment
- Request-Response Cycle
- Servlet Mapping
- GET vs POST
- Form Handling
- Tomcat Configuration
- Maven WAR Packaging
- Basic Web Application Debugging

## Outcome
Successfully built and deployed a Java Servlet-based Greeting Application using Apache Tomcat, implemented both GET and POST request handling, integrated HTML forms with Servlets, and gained hands-on experience in configuring, deploying, and debugging Java web applications.


# Day 6 – Spring MVC and CRUD Operations

## Topics Covered

### Spring MVC Fundamentals
- Introduction to Spring MVC architecture
- Understanding the Model, View, and Controller pattern
- Understanding the role of `DispatcherServlet`
- Difference between Java Servlet and Spring MVC
- Understanding request and response handling in Spring MVC

### Spring Boot Setup
- Creating a Spring Boot Maven project
- Configuring Spring MVC using Maven dependencies
- Using `spring-boot-starter-web`
- Understanding embedded Tomcat
- Running a Spring MVC application without installing an external Tomcat server
- Configuring Java 21 with Spring Boot

### MVC Architecture

Implemented the following application flow:

```text
Client
   |
   v
DispatcherServlet
   |
   v
Controller
   |
   v
Service
   |
   v
Repository
   |
   v
Data
---
```
# Day 7 - Contact Management REST API

## Overview

On Day 7, I built a basic Contact Management REST API using Spring Boot.

The main focus of this project was understanding layered architecture, REST APIs, DTOs, service interfaces, service implementations, Spring Data JPA, Lombok, validation, and H2 database configuration.

The application currently supports two operations:

- Create a contact
- Get all contacts

---

## Technologies Used

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database
- Lombok
- Jakarta Validation
- Maven

---

## Project Architecture

The application follows a layered architecture:

```text
Client
   |
   v
Controller
   |
   v
DTO
   |
   v
Service Interface
   |
   v
Service Implementation
   |
   v
Repository
   |
   v
Entity
   |
   v
H2 Database

src/main/java/com/contactapp/
│
├── controller/
│   └── ContactController.java
│
├── dto/
│   ├── ContactRequestDto.java
│   └── ContactResponseDto.java
│
├── entity/
│   └── Contact.java
│
├── repository/
│   └── ContactRepository.java
│
├── service/
│   ├── ContactService.java
│   └── ContactServiceImpl.java
│
└── ContactAppApplication.java
```



