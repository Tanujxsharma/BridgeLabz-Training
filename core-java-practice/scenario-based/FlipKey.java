
import java.util.*;

public class FlipKey {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        String result = CleanseAndInvert(input);
        System.out.println("Result: " + result);
    }

    public static String CleanseAndInvert(String input) {
        if (input == null) {
            return "Invalid Input";
        }
        if (!input.matches("[a-zA-Z]+")) {
            return "Invalid Input";
        }

        String input2 = input.toLowerCase();
        StringBuilder tempString = new StringBuilder();

        for (int i = 0; i < input2.length(); i++) {
            int charAscii = input2.charAt(i);
            if (charAscii % 2 == 0) {
                continue;
            }

            tempString.append(input2.charAt(i));
        }

        tempString = tempString.reverse();

        for (int i = 0; i < tempString.length(); i++) {

            if (i % 2 == 0) {
                char b = tempString.charAt(i);
                b = (char) (b - 32);
                tempString.replace(i, i + 1, String.valueOf(b));
            }

        }
        return tempString.toString();
    }
}
