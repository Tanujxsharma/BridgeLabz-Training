import java.util.*;
public class Person {
	String name;
	int age;
	Person(String name , int age ){
		this.name=name ;
		this.age=age;
	}
	// copy constructor
	Person (Person other){
		this.name=other.name;
		this.age= other.age;
	}
	public static void main (String []args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		int age = sc.nextInt();
		Person person = new Person("kalu",25);
	}
}
