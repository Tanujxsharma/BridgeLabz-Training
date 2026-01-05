class Student{
	private String name;
	private int age;
	private int grade;
	public void setName(String name) {
		this.name =name;
	}
	public void getName() {
		System.out.println(name);
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void getAge() {
		System.out.println(age);
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public void getGrade() {
		System.out.println(grade);
	}
}
	public class EncapsulationClass {
	public static void main(String[] args) {
		Student student = new Student();
		student.setName("tanuj ");
		student.getName();
	}

}
