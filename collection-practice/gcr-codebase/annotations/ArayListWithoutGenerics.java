package annotations;
import java.util.*;
public class ArayListWithoutGenerics {

	public static void main(String[] args) {
		@SuppressWarnings(value =  "unchecked")
		ArrayList list = new ArrayList();
		list.add(2);
		list.add("Tanuj");
		System.out.println(list.get(0));
		System.out.println(list.get(1));
	}
}
