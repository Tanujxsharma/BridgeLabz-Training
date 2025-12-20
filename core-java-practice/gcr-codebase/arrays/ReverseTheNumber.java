import java.util.Scanner;

public class ReverseTheNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int temp = number;
        int count = 0;

        // Find count of digits
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }

        // Array to store digits
        int[] digits = new int[count];
        temp = number;

        // Store digits in array
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp = temp / 10;
        }

        // Array to store reversed digits
        int[] reverseDigits = new int[count];

        // Store digits in reverse order
        for (int i = 0; i < count; i++) {
            reverseDigits[i] = digits[count - 1 - i];
        }

        // Display reversed number
        System.out.print("Reversed Number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(reverseDigits[i]);
        }

    }
}
