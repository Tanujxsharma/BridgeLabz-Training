import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

class Student{
	String name;
	String grades;
	public Student(String name, String grades) {
		this.grades=grades;
		this.name=name;
	}
}
public class StudentGrading {
	public static void main(String[] args) {
		
		ArrayList<Student> students = new ArrayList<>(Arrays.asList(
				new Student("Amit", "A"),
				new Student("Sumit", "B"),
				new Student("Pankaj", "C"),
				new Student("Surendar", "A"),
				new Student("krishna", "B"),
				new Student("Radha", "C"),
				new Student("Shivam", "A+"),
				new Student("Rohit", "A+")
				));
		
		students.stream().collect(Collectors.groupingBy(p->p.grades)).forEach((grade, studentList) -> {
	        System.out.println("Grade: " + grade);
	        studentList.forEach(s ->
	            System.out.println("  " + s.name)
	        );
	    });
	}

}