package reflections;
import java.lang.reflect.*;
class Person{
	private int  age =20;
}
public class AccessPrivateField {
	public static void main(String[] args) throws Exception {
		Person person = new Person();
		Class<?> clazz = person.getClass();
		Field field = clazz.getDeclaredField("age");
		field.setAccessible(true);
		System.out.println("Old value is : "+field.get(person));
		field.set(person,25);
		System.out.println("New Value is : "+field.get(person));
	}

}
