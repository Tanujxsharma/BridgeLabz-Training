class Task{
	int taskId;
	String taskName;
	int priority;
	String date;
	Task(int taskId,String taskName,int priority,String date){
		this.taskId=taskId;
		this.taskName=taskName;
		this.priority=priority;
		this.date=date;
	}
	public void printDetails() {
		System.out.println("the task id is : "+taskId+" the task name is "+taskName+" priority is "+priority+" the date is "+date);
	}
}
class TaskNode {
	Task data ;
	TaskNode next = null;
	TaskNode(Task data){
		this.data=data;
		
	}
}
public class TaskScheduler {
TaskNode head;
TaskNode tail;
private void addAtStart(Task data) {
	TaskNode newNode = new TaskNode(data);
	if(head==null) {
		head= newNode;
		tail=newNode;
		tail.next=newNode;
	}
	else {
		newNode.next=head;
		head = newNode;
		tail.next=head;
	}
	
}
private void addAtEnd(Task data) {
	TaskNode newNode = new TaskNode(data);
	if(tail==null) {
		head=newNode;
		tail=newNode;
		tail.next=head;
	}
	else {
		tail.next=newNode;
		tail=newNode;
		tail.next=head;
	}
}
private void showDetails() {
	TaskNode temp =head;
	do {
		temp.data.printDetails();
		temp=temp.next;
	}
	while(temp!=head);
	System.out.println("khatam ho gaya bhai kitna dekhega ");
}
private void removeByTaskId(int taskId) {
	TaskNode temp=head;
	if(head.data.taskId==taskId) {
		head=head.next;
	}
	if(tail.data.taskId==taskId) {
		while (temp.next!=tail) {
			temp=temp.next;
		}
		tail=temp;
		tail.next=head;
	}
	else {
		while (temp.next.data.taskId!=taskId) {
			temp=temp.next;
		}
		temp.next=temp.next.next;
	}
}
private void searchByPriority(int priority) {
	TaskNode temp =head;
	while (temp.data.priority!=priority) {
		temp=temp.next;
	}
	temp.data.printDetails();
}
	public static void main(String[] args) {
		TaskScheduler ts = new TaskScheduler();
		Task task1 = new Task(1,"find love",1,"30/dec");
		ts.addAtStart(task1);
		Task task2 = new Task(2,"find yourself",2,"30/dec");
		ts.addAtStart(task2);
//		ts.showDetails();
		Task task3 = new Task(3,"office work ",3,"30/dec");
		ts.addAtEnd(task3);
		ts.showDetails();
		ts.removeByTaskId(2);
		ts.showDetails();
		
	}

}