import java.util.Scanner;

public class StringLexicographicallyOrNot {
    
    public static int compareLexicographically(String str1, String str2) {
        int minLength = Math.min(str1.length(), str2.length());
        
        // Compare characters one by one
        for (int i = 0; i < minLength; i++) {
            char char1 = str1.charAt(i);
            char char2 = str2.charAt(i);
            
            if (char1 != char2) {
                return char1 - char2;
            }
        }
        
        // If all characters match, compare by length
        return str1.length() - str2.length();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str1 = sc.nextLine();
        
        String str2 = sc.nextLine();
        
        int result = compareLexicographically(str1, str2);
        
        if (result < 0) {
            System.out.println(str1 + " comes before " + str2);
        } else if (result > 0) {
            System.out.println(str1 + " comes after " + str2);
        } else {
            System.out.println(str1 + " is equal to " + str2);
        }

    }
}