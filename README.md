# Day 1 - DBMS Fundamentals & SQL

## Database Learning Journey

**Health Clinic Database Project**

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

## Technologies Used

- MySQL Server
- MySQL Command Line Client
- SQL

<li>Prepared Statements</li>
<li>Stored Procedures</li>
<li>Optimizing WHERE Clause</li>
<li>Pagination (LIMIT & OFFSET)</li>
</ul>

<h3>9. Performance Optimization</h3>

<ul>
<li>Connection Pooling</li>
<li>Transactions</li>
<li>Partitioning</li>
<li>Sharding</li>
<li>Caching</li>
<li>Indexing Basics</li>
</ul>

<h3>10. Security Best Practices</h3>

<ul>
<li>SQL Injection Prevention</li>
<li>Parameterized Queries</li>
<li>User Roles</li>
<li>Least Privilege Principle</li>
<li>Data Encryption</li>
</ul>

<h3>11. Backup & Recovery</h3>

<ul>
<li>Database Backups</li>
<li>Monitoring</li>
<li>Replication</li>
<li>Failover</li>
</ul>

<h3>12. Industry Standards</h3>

<ul>
<li>ACID Properties</li>
<li>GDPR / HIPAA / PCI-DSS Awareness</li>
<li>Schema Documentation</li>
<li>Version Control for Database</li>
</ul>

<h3>13. Practical Session</h3>

<ul>
<li>Installed MySQL</li>
<li>Configured MySQL Server</li>
<li>Used MySQL CLI</li>
<li>Created Database</li>
<li>Created Tables</li>
<li>Inserted Records</li>
<li>Updated Records</li>
<li>Deleted Records</li>
<li>Modified Tables</li>
<li>Executed SQL Queries</li>
<li>Created Database Users</li>
</ul>

<h2> Learning Outcomes</h2>

<ul>
<li>Understand DBMS and RDBMS concepts.</li>
<li>Understand SQL vs NoSQL.</li>
<li>Install and configure MySQL.</li>
<li>Create databases and tables.</li>
<li>Perform CRUD operations.</li>
<li>Understand SQL command categories.</li>
<li>Write JOIN queries.</li>
<li>Understand Normalization.</li>
<li>Learn database design principles.</li>
<li>Follow SQL industry best practices.</li>
<li>Write secure and optimized SQL queries.</li>
</ul>

<h2> Technologies Used</h2>

<ul>
<li>MySQL Server</li>
<li>MySQL Command Line Client</li>
<li>SQL</li>
</ul>



</div>

</body>
</html>
<<<<<<< HEAD

# Day 2 - Advanced Database Design & Query Optimization

## Overview

Building upon the concepts learned on Day 1, today's session focused on designing a more realistic database schema, implementing different types of relationships, verifying normalization using an actual table, understanding indexing strategies, and optimizing SQL queries using the EXPLAIN statement.

---

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
- Verified Using index in EXPLAIN
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

---

## Additional Learning Outcomes

By the end of Day 2, we were able to:

- Design scalable relational databases
- Create many-to-many relationships
- Build junction tables
- Apply normalization practically
- Create efficient indexes
- Analyze SQL execution plans
- Improve query performance
- Understand how MySQL chooses indexes
- Design optimized database schemas

---

## Assignment Completed

- Extended the Health Clinic schema with Rooms and Doctor-Room relationship.
- Verified the patient_phones table satisfies 1NF, 2NF, and 3NF.
- Created and tested Single Column, Composite, and Covering indexes.
- Compared query execution plans using EXPLAIN.
- Optimized reporting queries using covering indexes.

---

## Technologies Used (Updated)

- MySQL Server
- MySQL Command Line Client
- SQL
- EXPLAIN
- Indexes
- Relational Database Design
- Query Optimization

---

## Next Learning Goals

- Aggregate Functions
- GROUP BY
- HAVING
- ORDER BY
- SQL Functions
- Views
- Stored Procedures
- Triggers
- Transactions
- ACID Properties (Practical)
- Advanced SQL Queries
=======
>>>>>>> 272713f3072ecfb52d97ecdbcc707151b230a873
