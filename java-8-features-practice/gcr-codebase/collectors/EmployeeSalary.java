import java.util.List;
import java.util.stream.Collectors;
import java.util.*;

class Employee {
	String name;
	String department;
	double salary;
	public Employee(String name, String department, double salary) {
		this.department=department;
		this.salary =salary;
		this.name= name;
		
		
	}
	String getname() {
		return name;
	}
	
	
	String getDepartment() {
		return department;
	}
	
	double getSalary() {
		return salary;
	}
}
public class EmployeeSalary {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
                new Employee("Amit", "IT", 75000),
                new Employee("Sumit", "HR", 55000),
                new Employee("Pankaj", "IT", 82000),
                new Employee("Neha", "Finance", 68000),
                new Employee("Rohit", "HR", 60000),
                new Employee("Anjali", "Finance", 72000)
        );
		
		 Map<String, Double> avgSalary = employees.stream().collect(Collectors.groupingBy(
	                             	 p->p.department,
	                                 Collectors.averagingDouble(Employee::getSalary)
	                         ));
		 avgSalary.forEach((dept,avg)->System.out.println(dept+" average salary: "+avg));
	}

}