package streamApi;
import java.util.*;
public class CustomerName {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("Rahul");
        list.add("anita");
        list.add("Karan");
        list.add("pooja");

		list.stream().map( String::toUpperCase).sorted();
	}

}
