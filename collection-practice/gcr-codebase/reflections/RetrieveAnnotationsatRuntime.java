package reflections;
import java.lang.reflect.*;
@Author(name="Kalu Prasad")
class Book{
	void read() {
		System.out.println("Reading book...");
	}
}
public class RetrieveAnnotationsatRuntime {

	public static void main(String[] args)throws Exception  {
		Class<Book> clazz = Book.class;
		Author author = clazz.getAnnotation(Author.class);
				if(author!= null) {
					System.out.println("My name is "+author.name());
				};
	}

}
