import java.util.Scanner;

public class LargestAndSecondLargestNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take number input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Store digits of the number in the array
        while (number != 0 && index < maxDigit) {
            digits[index] = number % 10;
            number = number / 10;
            index++;
        }

        // Initialize largest and second largest
        int largest = 0;
        int secondLargest = 0;

        // Find largest and second largest digit
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Output result
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

    }
}
