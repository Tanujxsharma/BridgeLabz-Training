package reflections;
import java.lang.reflect.*;
class StudentGetClassInformation{
	String name;
	int age ;
	int grade ;
	StudentGetClassInformation(String name,int age,int grade ){
		this.name=name;
		this.age=age;
		this.grade=grade;
	}
	private void getName() {
		System.out.println(name);	
}
}
public class GetClassInformation {

	

	public static void main(String[] args) throws ClassNotFoundException {
		try {
		Class<?> clazz = StudentGetClassInformation.class;
		System.out.println(" constructors of the class ");
		Constructor <?>[] constructors =clazz.getDeclaredConstructors();
		for(Constructor <?>c : constructors) {
			System.out.println(c);
		}
		System.out.println("fields of the class  ");
		Field[] fields = clazz.getDeclaredFields();
		for(Field f : fields) {
			System.out.println(f);
		}
		System.out.println("Methods of the class ");
		Method [] methods = clazz.getDeclaredMethods();
		for(Method m : methods) {
			System.out.println(m);
		}
		}	
		catch(Exception e ){}
	}

}
