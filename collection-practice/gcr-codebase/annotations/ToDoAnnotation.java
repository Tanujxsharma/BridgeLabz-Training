package annotations;
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface ToDo{
	String task();
	String assignedTo();
	String priority() default "MEDIUM";
}

class List{
	@ToDo(task = "read" , assignedTo = "kalu" , priority = "HIGH")
	public void Task1() {
	
	}
	@ToDo(task = "write" , assignedTo = "telu" )
	public void Task2() {
	
	}
}

public class ToDoAnnotation {
	public static void main(String[] args) throws Exception{
		List list = new List();
		Method[] method = list.getClass().getDeclaredMethods();
		
		for(Method mtd : method) {
			if(mtd.isAnnotationPresent(ToDo.class)) {
				ToDo TD = mtd.getAnnotation(ToDo.class);
				System.out.println(mtd.getName() );
				System.out.println(TD.task() );
				System.out.println(TD.assignedTo() );
				System.out.println(TD.priority());
			}
		}
		
	}
}
