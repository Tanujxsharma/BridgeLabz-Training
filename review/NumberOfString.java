import java.util.*;
public class NumberOfString {
public static int countVowel(String input) {
	int count =0;
	input = input.toLowerCase();
	for(int i = 0 ;i<input.length();i++) {
		if(input.charAt(i)=='a'||input.charAt(i)=='e'||input.charAt(i)=='i'||input.charAt(i)=='o'||input.charAt(i)=='u') {
			count++;
		}
	}
	return count ;
}
public static int countConsonents(String input) {
	int count  =0;
	input = input.toLowerCase();
	for(int i=0;i<input.length();i++) {
		if(input.charAt(i)=='a'||input.charAt(i)=='e'||input.charAt(i)=='i'||input.charAt(i)=='o'||input.charAt(i)=='u') {
			continue;
		}
		else {
			count++;
		}
	}
	return count ;
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		System.out.println("number of vowels are ");
		System.out.println(countVowel(input));
		System.out.println("number of consonents are ");
		System.out.println(countConsonents(input));
	}

}
