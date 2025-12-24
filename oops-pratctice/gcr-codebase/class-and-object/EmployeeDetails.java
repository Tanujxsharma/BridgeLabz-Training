 class EmployeeDetails {
   // Private fields to encapsulate the data
    private String name;
    private int id;
    private double salary;

    // Constructor to initialize Employee attributes
    public EmployeeDetails(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for id
    public int getId() {
        return id;
    }

    // Setter method for id
    public void setId(int id) {
        this.id = id;
    }

    // Getter method for salary
    public double getSalary() {
        return salary;
    }

    // Setter method for salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name   : " + name);
        System.out.println("ID     : " + id);
        System.out.println("Salary : ₹" + salary);
    }

    // Main method to test the Employee class
    public static void main(String[] args) {
        // Creating an Employee object
        EmployeeDetails employeeOne = new EmployeeDetails("Tanuj Sharma ", 101, 50000.0);

        // Displaying the employee's details
        employeeOne.displayDetails();
    }
}