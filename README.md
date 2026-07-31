<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Day 1 - DBMS Fundamentals & SQL</title>

    <style>
        *{
            margin:0;
            padding:0;
            box-sizing:border-box;
            font-family:Arial, Helvetica, sans-serif;
        }

        body{
            background:#f4f6f9;
            color:#333;
            padding:40px;
            line-height:1.7;
        }

        .container{
            max-width:1000px;
            margin:auto;
            background:white;
            padding:40px;
            border-radius:10px;
            box-shadow:0 5px 15px rgba(0,0,0,.1);
        }

        h1{
            color:#0066cc;
            text-align:center;
            margin-bottom:10px;
        }

        h2{
            color:#0d6efd;
            margin-top:35px;
            margin-bottom:10px;
            border-left:5px solid #0d6efd;
            padding-left:10px;
        }

        h3{
            color:#444;
            margin-top:20px;
        }

        p{
            margin:10px 0;
        }

        ul{
            margin-left:25px;
            margin-top:10px;
        }

        li{
            margin:8px 0;
        }

        .header{
            text-align:center;
            margin-bottom:30px;
        }

        .card{
            background:#f8f9fa;
            padding:18px;
            border-radius:8px;
            margin-top:15px;
            border-left:5px solid #0d6efd;
        }

        footer{
            margin-top:40px;
            text-align:center;
            color:gray;
            font-size:14px;
        }

        code{
            background:#ececec;
            padding:2px 5px;
            border-radius:4px;
        }

    </style>

</head>
<body>

<div class="container">

<div class="header">
<h1> Day 1 - DBMS Fundamentals & SQL</h1>
<p><strong>Database Learning Journey</strong></p>
<p>Health Clinic Database Project</p>
</div>

<div class="card">
<strong>Overview</strong>

<p>
Today we covered the complete foundation of Database Management Systems,
Relational Databases, SQL basics, MySQL installation, SQL commands,
database design principles, normalization, joins and industry best practices.
</p>
</div>

<h2> Topics Covered</h2>

<h3>1. Database Fundamentals</h3>

<ul>
<li>What is Data?</li>
<li>Database</li>
<li>DBMS</li>
<li>File System vs DBMS</li>
<li>Advantages of DBMS</li>
<li>Types of DBMS</li>
<li>RDBMS</li>
<li>Features of RDBMS</li>
<li>Relational vs Non-Relational Database</li>
<li>SQL vs NoSQL</li>
<li>When to use SQL</li>
<li>When to use NoSQL</li>
</ul>

<h3>2. Introduction to MySQL</h3>

<ul>
<li>Introduction to MySQL</li>
<li>MySQL Architecture</li>
<li>Installing MySQL</li>
<li>MySQL CLI</li>
<li>Creating Databases</li>
<li>Creating Tables</li>
<li>Understanding Storage Engine</li>
</ul>

<h3>3. SQL Command Categories</h3>

<ul>
<li>DDL (CREATE, ALTER, DROP, TRUNCATE, RENAME)</li>
<li>DML (INSERT, UPDATE, DELETE)</li>
<li>DQL (SELECT)</li>
<li>TCL (COMMIT, ROLLBACK, SAVEPOINT)</li>
<li>DCL (GRANT, REVOKE)</li>
</ul>

<h3>4. SQL Keys</h3>

<ul>
<li>Primary Key</li>
<li>Foreign Key</li>
<li>Candidate Key</li>
<li>Composite Key</li>
<li>Unique Key</li>
</ul>

<h3>5. SQL Joins</h3>

<ul>
<li>INNER JOIN</li>
<li>LEFT JOIN</li>
<li>RIGHT JOIN</li>
<li>FULL OUTER JOIN</li>
<li>CROSS JOIN</li>
<li>SELF JOIN</li>
</ul>

<h3>6. Database Normalization</h3>

<ul>
<li>First Normal Form (1NF)</li>
<li>Second Normal Form (2NF)</li>
<li>Third Normal Form (3NF)</li>
<li>BCNF</li>
<li>Fourth Normal Form (4NF)</li>
<li>Denormalization</li>
</ul>

<h3>7. Database Design Best Practices</h3>

<ul>
<li>Choosing Proper Data Types</li>
<li>Primary & Foreign Keys</li>
<li>Constraints</li>
<li>Default Values</li>
<li>Normalization</li>
<li>Naming Conventions</li>
</ul>

<h3>8. Query Optimization</h3>

<ul>
<li>Efficient SQL Queries</li>
<li>Using EXPLAIN</li>
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