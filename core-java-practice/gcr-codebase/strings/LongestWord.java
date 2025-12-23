import java.util.*;
class LongestWord{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String longestWord = findLongestWord(input);
        System.out.println("Longest word: " + longestWord);
    }
    public static String findLongestWord(String str) {
        String[] words = str.split(" ");
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }
}