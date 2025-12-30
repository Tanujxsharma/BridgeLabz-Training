class Student

{
	int rollNumber ;
	String name ;
	int age ;
	double grade ;
	Student(int rollNumber,String name,int age ,double grade){
		this.rollNumber= rollNumber;
		this.name =name;
		this.age=age;
		this.grade=grade;
	}
	public  void printDetails() {
		System.out.println("roll number "+rollNumber+" name is "+name+" age is "+age+" grade is "+grade);
	}
}

class Node{
	Student data ;
	Node next ;
	
	Node(Student data){
		this.data = data ;
		this.next=null ;
	}
}
public class StudentLinkedList {
	Node head ;
	Node tail;
	private void addNodeAtBeginning(Student data) {
		Node newNode =new Node(data);
		if(head == null && tail==null) {
			head = newNode;
			tail=newNode;
			tail.next=null;
		}
		else {
			newNode.next=head;
			head=newNode;
		}
		
	}
	
	private void addNodeAtEnd(Student data){
		Node newNode = new Node(data);
		if(head == null && tail==null) {
			head = newNode;
			tail=newNode;
			tail.next=null;
		}
		else {
			tail.next = newNode;
			tail = newNode;
		}
	}
	private void searchStudent(int rollNumber ) {
		Node temp = head ;
		while(temp!=null && temp.data.rollNumber!=rollNumber) {
			temp=temp.next;
		}
		if(temp==null) {
			System.out.println("Nahi Mila Bhai ");
		}
		else {
			temp.data.printDetails();
		}
	}
	private void upgradeGrade(int rollNumber,double grade ) {
		Node temp = head ;
		while(temp!=null && temp.data.rollNumber!=rollNumber) {
			temp=temp.next;
		}
		if(temp==null) {
			System.out.println("Nahi Mila Bhai ");
		}
		else {
			temp.data.grade = grade;
		}
	}
	private void deleteNode(int rollNumber ) {
		if(head==null) {
			System.out.println("list is empty");
		}
		
		if(head.data.rollNumber==rollNumber) {
			if(head.next==null) {
				head =null;
				tail=null;
				return;
			}
			head=head.next;
		}
		else {
			Node temp =head;
			while(temp.next!=null && temp.next.data.rollNumber!=rollNumber) {
				temp=temp.next;
			}
			if(temp.next==null) {
				System.out.println("rollnumber nahi mila bhai ");
			}
			else {
				temp.next=temp.next.next;
			}
		}
		
	}
	
	private void travarsal() {
		Node temp;
		temp=head;
		while(temp!=null) {
		temp.data.printDetails();
		temp=temp.next;
		}
	}
	public static void main(String[] args) {
		Student student1 = new Student(20,"kaka",21,7.5);
		StudentLinkedList studentLinkedList = new StudentLinkedList();
		studentLinkedList.addNodeAtBeginning(student1);
		Student student2 = new Student(25,"lala",20,7.8);
		studentLinkedList.addNodeAtBeginning(student2);
		Student student3 = new Student(16,"dileepi",16,5.5);
		studentLinkedList.addNodeAtEnd(student3);
//		studentLinkedList.travarsal();
		studentLinkedList.deleteNode(30);
//		studentLinkedList.travarsal();
		studentLinkedList.searchStudent(16);
		studentLinkedList.upgradeGrade(16, 7.0);
		studentLinkedList.travarsal();
	}

}