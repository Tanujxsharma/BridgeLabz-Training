import java.util.Scanner;

public class StringOccurrences {
    
    public static int countOccurrences(String text, String substring) {
        if (text == null || substring == null || substring.isEmpty()) {
            return 0;
        }
        
        int count = 0;
        int index = 0;
        
        while ((index = text.indexOf(substring, index)) != -1) {
            count++;
            index += substring.length();
        }
        
        return count;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String text = sc.nextLine();
        
        String substring = sc.nextLine();
        
        int occurrences = countOccurrences(text, substring);
        System.out.println("The substring \"" + substring + "\" occurs " + occurrences + " times.");
        
    }
}