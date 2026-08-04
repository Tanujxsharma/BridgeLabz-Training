# BridgeLabz Training - Database Learning Journey

## Health Clinic Database Project

This README documents the learning progress across the first three days of the database training program.

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
