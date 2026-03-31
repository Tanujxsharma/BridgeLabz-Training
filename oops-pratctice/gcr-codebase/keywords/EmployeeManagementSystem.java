public class EmployeeManagementSystem {
	// declaring the variables
	private static String companyName;
	private static int totalEmployee;
	private String name;
	private final int  id;
	private String designation;
	// constructor of the class
	public EmployeeManagementSystem(String name, int id,String designation) {
		this.name = name;
		this.id = id;
		this.designation=designation;
		totalEmployee++;
	}
	// static method to get total employee
	public static void displayTotalEmployee() {
		System.out.println("total number of employees are "+ totalEmployee);
	}
	// method to display employee details
	public void displayEmployeeDetails() {
	       // Using 'instanceof' to verify the object's type before displaying details
	       if (this instanceof EmployeeManagementSystem) {
	           System.out.println("Company Name: " + companyName);
	           System.out.println("Employee ID: " + id);
	           System.out.println("Name: " + name);
	           System.out.println("Designation: " + designation);
	       } else {
	           System.out.println("The object is not an instance of the Employee class.");
	       }
	   }

	public static void main(String[] args) {
		

	}

}