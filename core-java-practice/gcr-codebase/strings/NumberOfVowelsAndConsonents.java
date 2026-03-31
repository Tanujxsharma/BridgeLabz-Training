import java.util.Scanner;

public class NumberOfVowelsAndConsonents {
    
    // Method to check if a character is a vowel or consonant
    public static String checkCharacter(char ch) {
        // Convert to lowercase if uppercase
        ch = Character.toLowerCase(ch);
        
        // Check if it's a vowel
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "Vowel";
        }
        // Check if it's a consonant
        else if (ch >= 'a' && ch <= 'z') {
            return "Consonant";
        }
        // Not a letter
        else {
            return "Not a Letter";
        }
    }
    
    // Method to find vowels and consonants count in a string
    public static int[] countVowelsAndConsonants(String str) {
        int vowelCount = 0;
        int consonantCount = 0;
        
        // Iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String charType = checkCharacter(ch);
            
            if (charType.equals("Vowel")) {
                vowelCount++;
            } else if (charType.equals("Consonant")) {
                consonantCount++;
            }
        }
        
        // Return counts in an array [vowels, consonants]
        return new int[]{vowelCount, consonantCount};
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String input = sc.nextLine();
        
        // Get vowel and consonant counts
        int[] counts = countVowelsAndConsonants(input);
        
        // Display results
        System.out.println("Number of Vowels: " + counts[0]);
        System.out.println("Number of Consonants: " + counts[1]);
    
    }
}