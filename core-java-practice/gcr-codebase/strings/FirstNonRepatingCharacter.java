import java.util.*;

public class FirstNonRepatingCharacter {
    
    public static char findFirstNonRepeatingCharacter(String text) {
        // Array to store frequency of characters (256 ASCII characters)
        int[] frequency = new int[256];
        
        // Loop through the text to count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            frequency[ch]++;
        }
        
        // Loop through the text to find the first non-repeating character
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (frequency[ch] == 1) {
                return ch;
            }
        }
        
        // Return null character if no non-repeating character is found
        return '\0';
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        String input = sc.nextLine();
        
        char result = findFirstNonRepeatingCharacter(input);
        
        if (result == '\0') {
            System.out.println("No non-repeating character found in the string.");
        } else {
            System.out.println( result);
        }
        
    }
}