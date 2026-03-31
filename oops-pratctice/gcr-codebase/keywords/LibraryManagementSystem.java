public class LibraryManagementSystem {
    // declaring the variables
	private static String libraryName;
	private String title;
	private String author ;
	private final String isbn;
	//  constructor of the class
	public LibraryManagementSystem(String title,String author,String isbn) {
		this.title=title;
		this.author=author;
		this.isbn=isbn;
	}
    // getter setter methods
	public void getLibraryName() {
		System.out.println("the library name is"+libraryName);
	}
	public void setLibraryName(String name){
		libraryName=name;
	}
    // static method to display library name
	public static void displayLibraryName(String libraryName) {
		System.out.println("name of the library is "+ libraryName);
	}
    // method to display book details
	public void displayBookDetails() {
	      if (this instanceof LibraryManagementSystem) {
	           System.out.println("Title: " + title);
	           System.out.println("Author: " + author);
	           System.out.println("ISBN: " + isbn);
	       } else {
	           System.out.println("The object is not an instance of the Book class.");
	       }
	   }

	public static void main(String[] args) {
		
	}

}