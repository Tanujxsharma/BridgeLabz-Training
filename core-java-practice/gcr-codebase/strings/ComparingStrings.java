package string;
import java.util.*;
public class ComparingStrings {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		String inputOne= sc.next();
		String inputSecond= sc.next();
		boolean isEqual=true;
		int size = 0;
		if(inputOne.length()>inputSecond.length()) {
			size= inputOne.length();
		}
		else {
			size = inputSecond.length();
		}
		for(int i = 0; i < size ;i++) {
			if(inputOne.charAt(i) == inputSecond.charAt(i)){
				continue;
			}
			else {
				isEqual=false;
			}
		}
		if(inputOne.equals(inputSecond)== isEqual) {
			System.out.println(true);
		}
		else {
			System.out.print(false);
		}
	}
}
