import java.util.*;
public class AlwaysExecute extends Exception  {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 10;
		int num2 = 0;
		try {
			System.out.println(num1/num2);
		}
		finally {
			System.out.println("final block execuated ");
		}
	}
	

}
