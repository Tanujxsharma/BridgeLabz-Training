import java.util.*;

public class StringToLowerCase {
    
    // Method to convert uppercase to lowercase using ASCII values
    public static String convertToLowerCase(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                // ASCII difference between uppercase and lowercase is 32
                ch = (char) (ch + 32);
            }
            result.append(ch);
        }
        return result.toString();
    }
    
    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        String userInput = sc.nextLine();
        
        // User-defined method to convert to lowercase
        String customLowerCase = convertToLowerCase(userInput);
        
        // Built-in method to convert to lowercase
        String builtInLowerCase = userInput.toLowerCase();
        
        // Compare both results
        boolean isEqual = compareStrings(customLowerCase, builtInLowerCase);
        
        System.out.println("Original text: " + userInput);
        System.out.println("Custom method result: " + customLowerCase);
        System.out.println("Built-in method result: " + builtInLowerCase);
        System.out.println("Are both results equal? " + isEqual);
        
    }
}