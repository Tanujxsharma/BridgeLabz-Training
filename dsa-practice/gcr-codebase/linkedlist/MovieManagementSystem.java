class Movie{
	String title;
	String director;
	int yearOfRelease;
	double rating;
	Movie(String title, String director, int yearOfRelease, double rating){
		
		this.title = title;
		this.director=director;
		this.yearOfRelease=yearOfRelease;
		this.rating=rating;
	}
	public void printDetails() {
		System.out.println("Title of the movie is : "+title+", name of the director is : "+director+" , year of release "+yearOfRelease+",  rating " +rating);
	}
}
class MovieNode{
	Movie data;
	MovieNode next;
	MovieNode prev;
	MovieNode(Movie data){
		this.data=data;
		this.next=null;
		this.prev=null;
	}
}
public class MovieManagementSystem {
	MovieNode head;
	MovieNode tail;
	private void addAtStart(Movie data) {
		MovieNode newNode= new MovieNode(data);
		if(head == null ) {
			head = newNode;
			tail = newNode;
		}
		else {
			newNode.next=head;
			head.prev=newNode;
			head=newNode;
		}
	}
	private void addAtEnd(Movie data) {
		MovieNode newNode = new MovieNode(data);
		if(head == null ) {
			head=newNode;
			tail=newNode;
		}
		else {
			tail.next=newNode;
			newNode.prev = tail;
			tail=newNode;
		}
	}
	private void travresal(){
		MovieNode temp =head;
		 while (temp != null) {
		        temp.data.printDetails();
		        temp = temp.next;
		    }
	}
	private void reverseTraversal() {
	    if (tail == null) {
	        System.out.println("List is empty");
	        return;
	    }

	    MovieNode temp = tail;
	    while (temp != null) {
	        temp.data.printDetails();
	        temp = temp.prev;   
	    }
	}
	private void removeMovie(String title) {

	    if (head == null) {
	        System.out.println("List khali hai bhai");
	        return;
	    }

	    MovieNode temp = head;
	    while (temp != null && !temp.data.title.equals(title)) {
	        temp = temp.next;
	    }
	    if (temp == null) {
	        System.out.println("Movie nahi mili bhai");
	        return;
	    }
	    if (temp == head) {
	        head = head.next;
	        if (head != null) {
	            head.prev = null;
	        } else {
	            tail = null; 
	        }
	    }
	    else if (temp == tail) {
	        tail = tail.prev;
	        tail.next = null;
	    }
	    else {
	        temp.prev.next = temp.next;
	        temp.next.prev = temp.prev;
	    }
	    System.out.println("Ho Gyai Delete ");
	}
	private void updateMovieRating(String title,double rating ) {
		MovieNode temp= head;
		while(!temp.data.title.equals(title)) {
			temp=temp.next;
		}
		temp.data.rating=rating;
	}
	private void searchByDirector(String director) {
		MovieNode temp = head;
		while(temp!=null) {
			if(temp.data.director.equals(director)) {
				temp.data.printDetails();
			}
		}
	}
	private void searchByrating(double rating) {
		MovieNode temp = head;
		while(temp!=null) {
			if(temp.data.rating==rating) {
				temp.data.printDetails();
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovieManagementSystem newMovie = new MovieManagementSystem();
		Movie movie1 = new Movie("dileep ki prem khatha","Tanuj Sharma ",2026,9.8);
		newMovie.addAtStart(movie1);
//		newMovie.travresal();
		Movie movie2 = new Movie("Sachin ki javani ","Tanuj Sharma ",2025,9.5);
		newMovie.addAtStart(movie2);
//		newMovie.travresal();
		Movie movie3 = new Movie("naresh ka pagalpan ","Tanuj Sharma ",2025,9.7);
		newMovie.addAtStart(movie3);
//		newMovie.travresal();
		Movie movie4 = new Movie("kaka ka doglapan ","Tanuj Sharma ",2025,9.7);
		newMovie.addAtEnd(movie4);
//		newMovie.travresal();
		newMovie.reverseTraversal();
		newMovie.removeMovie("kaka ka doglapan ");
		newMovie.travresal();
	}

}