create database health_clinic;
use health_clinic;
CREATE TABLE patients (
patient_id INT AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(50) NOT NULL,
date_of_birth DATE,
gender ENUM('Male', 'Female', 'Other'),
phone_number VARCHAR(15) UNIQUE,
email VARCHAR(100),
registered_on TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
ALTER TABLE patients MODIFY COLUMN email VARCHAR(50);
ALTER TABLE patients ADD COLUMN address VARCHAR(200);
ALTER TABLE patients CHANGE COLUMN address home_address VARCHAR(200);
ALTER TABLE patients DROP COLUMN home_address;
RENAME TABLE patients TO clinic_patients;
RENAME TABLE clinic_patients TO patients;
INSERT INTO patients (name, date_of_birth, gender, phone_number, email)
VALUES ('Raju', '1980-10-16', 'Male', '0987654321', 'raju@email.com');
INSERT INTO patients (name, date_of_birth, gender, phone_number, email)
VALUES
('Sita', '1998-10-21', 'Female', '923543211', 'sita@email.com'),
('Aman',  '1999-08-30', 'Male', '97654343212', 'aman@email.com');
UPDATE patients
SET phone_number = '9998887777'
WHERE patient_id = 1;
DELETE FROM patients
WHERE patient_id = 3;
CREATE TABLE doctors (
doctor_id INT AUTO_INCREMENT PRIMARY KEY,
first_name VARCHAR(50) NOT NULL,
last_name VARCHAR(50) NOT NULL,
specialization VARCHAR(100),
phone_number VARCHAR(15) UNIQUE,
email VARCHAR(100)
);
INSERT INTO doctors (first_name, last_name, specialization, phone_number, email)
VALUES
('Anjali', 'Rao', 'Cardiology', '9123456780', 'dr.rao@clinic.com'),
('Vikram', 'Iyer', 'Pediatrics', '9123456781', 'dr.iyer@clinic.com');
SELECT * FROM patients;
SELECT * FROM doctors;

create database collage;
use collage;
CREATE TABLE Students (
StudentID INT PRIMARY KEY,
Name VARCHAR(100)
);

CREATE TABLE Enrollments (
EnrollmentID INT PRIMARY KEY,
StudentID INT,
FOREIGN KEY (StudentID) REFERENCES Students(StudentID)
);

CREATE TABLE Orders (
OrderID INT,
ProductID INT,
PRIMARY KEY (OrderID, ProductID)
);
SELECT * FROM Students
INNER JOIN Enrollments ON Students.StudentID = Enrollments.StudentID;

SELECT * FROM Students
LEFT JOIN Enrollments ON Students.StudentID = Enrollments.StudentID;
SELECT *
FROM Students
LEFT JOIN Enrollments
ON Students.StudentID = Enrollments.StudentID

UNION

SELECT *
FROM Students
RIGHT JOIN Enrollments
ON Students.StudentID = Enrollments.StudentID;

INSERT INTO Students (StudentID, Name) VALUES ( 1,'Arjun');