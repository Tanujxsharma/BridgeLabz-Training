import java.util.*;

public class StringToUpperCase {
    
    // Method to convert string to uppercase using charAt() and ASCII values
    public static String convertToUpperCase(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                // Convert lowercase to uppercase by subtracting 32 from ASCII value
                result.append((char)(ch - 32));
            } else {
                result.append(ch);
            }
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
        Scanner sc= new Scanner(System.in);


        String userInput = sc.nextLine();
        
        // Convert using custom method
        String customUpperCase = convertToUpperCase(userInput);
        
        // Convert using built-in method
        String builtInUpperCase = userInput.toUpperCase();
        
        // Compare both results
        boolean areEqual = compareStrings(customUpperCase, builtInUpperCase);
        
        System.out.println("Original text: " + userInput);
        System.out.println("Custom conversion: " + customUpperCase);
        System.out.println("Built-in conversion: " + builtInUpperCase);
        System.out.println("Are both results equal? " + areEqual);
    }
}