package annotations;
import java.lang.reflect.*;
public class TaskManager {
	@TaskInfo(priority = 1, assignedTo ="Chaman")
	public void task() {
		System.out.println("task assinned ");
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class<?>clazz = TaskManager.class;
		Method method = clazz.getDeclaredMethod("task");
		TaskInfo taskInfo = method.getAnnotation(TaskInfo.class);
		if(taskInfo!= null) {
			 System.out.println("Priority: " + taskInfo.priority());
             System.out.println("Assigned To: " + taskInfo.assignedTo());
		}
	}

}
