import java.util.*;

public class LexicalTwist {

    public static int countVowel(String str) {
        int count = 0;
        for(char ch : str.toCharArray()) {
        	if(ch == 'A' || ch=='E'|| ch== 'I' || ch== 'O' || ch == 'U' ) { count++; }
        }
        return count;
    }

    public static int countConsonents(String str) {
        int count = 0;
        for(char ch : str.toCharArray()) {
        	if(ch != 'A' && ch!='E'&& ch!= 'I' && ch != 'O' && ch != 'U' ) { count++; }
        }
        return count;
    }

    public static String replaceVowel(String word) {
        char[] arr = word.toCharArray();
        for(int i = 0; i < arr.length; i++) {
        	if(arr[i]== 'a' || arr[i]=='e'|| arr[i]== 'i' || arr[i]== 'o' || arr[i] == 'u' ) {
                arr[i] = '@';
            }
        }
        return new String(arr);
    }

    public static String check(String firstWord, String secondWord) {

        StringBuilder sb = new StringBuilder(secondWord);
        if(sb.reverse().toString().equalsIgnoreCase(firstWord)) {
            return replaceVowel(secondWord.toLowerCase());
        }

        String combined = (firstWord + secondWord).toUpperCase();
        int vowel = countVowel(combined);
        int consonent = countConsonents(combined);

        String result = "";
        int count = 0;

        if(vowel > consonent) {
            for(char ch : combined.toCharArray()) {
                if("AEIOU".indexOf(ch) != -1 && result.indexOf(ch) == -1) {
                    result += ch;
                    if(++count == 2) break;
                }
            }
            return result;
        }

        else if(consonent > vowel) {
            for(char ch : combined.toCharArray()) {
                if(ch>='A' && ch<='Z' && "AEIOU".indexOf(ch) == -1
                   && result.indexOf(ch) == -1) {
                    result += ch;
                    if(++count == 2) break;
                }
            }
            return result;
        }

        return "Both vowels and consonants are equal";
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enetr the first word");
    	String firstWord = sc.next();
    	System.out.println("Enter the secound word ");
    	String secoundWord = sc.next();
        System.out.println(check(firstWord,secoundWord)); 
    }
}
