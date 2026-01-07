package JavaStreams.ObjectSerialization;

import java.io.Serializable;

public class Employee implements Serializable {
    private static final long serialVersionUID = 1L; // Recommended for version control
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Getters (setters are not strictly necessary for serialization/deserialization demonstration)
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", department='" + department + '\'' +
               ", salary=" + salary +
               '}';
    }
}