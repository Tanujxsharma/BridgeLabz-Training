import java.util.*;

public class FrequencyOfCharacters {

    public static int[][] findFrequency(String text) {
        int[] frequency = new int[256]; // Array to store frequency of each ASCII character

        // Loop through the text to find the frequency of characters
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        // Create a 2D array to store characters and their frequencies
        int count = 0;
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                count++;
            }
        }

        int[][] result = new int[count][2];
        int index = 0;
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                result[index][0] = i; // ASCII value of character
                result[index][1] = frequency[i]; // Frequency of character
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int[][] frequencyArray = findFrequency(input);

        System.out.println("Character Frequencies:");
        for (int i = 0; i < frequencyArray.length; i++) {
            System.out.println((char) frequencyArray[i][0] + ": " + frequencyArray[i][1]);
        }

    }
}