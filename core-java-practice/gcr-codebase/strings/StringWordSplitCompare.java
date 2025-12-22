import java.util.Scanner;
import java.util.Arrays;

public class StringWordSplitCompare {
    
    // Method to find length of string without using built-in length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }
    
    // Method to split text into words without using built-in split()
    public static String[] customSplit(String str) {
        int len = findLength(str);
        int wordCount = 0;
        
        // Count words
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
                wordCount++;
            }
        }
        wordCount++; // For the last word
        
        // Store space indexes
        int[] spaceIndexes = new int[wordCount + 1];
        spaceIndexes[0] = -1;
        int spaceCount = 1;
        
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
                spaceIndexes[spaceCount++] = i;
            }
        }
        spaceIndexes[spaceCount] = len;
        
        // Extract words
        String[] words = new String[wordCount];
        for (int i = 0; i < wordCount; i++) {
            int startIndex = spaceIndexes[i] + 1;
            int endIndex = spaceIndexes[i + 1];
            words[i] = str.substring(startIndex, endIndex);
        }
        
        return words;
    }
    
    // Method to compare two String arrays
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }  
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String text = scanner.nextLine();
        
        // Custom split method
        String[] customWords = customSplit(text);
        
        // Built-in split method
        String[] builtInWords = text.split(" ");
        
        // Display results
        System.out.println("\nCustom Split Result: " + Arrays.toString(customWords));
        System.out.println("Built-in Split Result: " + Arrays.toString(builtInWords));
        
        // Compare arrays
        boolean isEqual = compareArrays(customWords, builtInWords);
        System.out.println(isEqual);
        
    }
}