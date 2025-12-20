import java.util.*;

class OddAndEvenNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        // Validate input
        if (number < 1) {
            System.out.println("Invalid input");
            return;
        }
        // Arrays to store even and odd numbers
        int[] evens = new int[number / 2 + 1];
        int[] odds = new int[number / 2 + 1];
        int ei = 0, oi = 0;
        // Separate even and odd numbers
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evens[ei++] = i; 
            }else {
                odds[oi++] = i;
            }
        }
        // Display even and odd numbers
        System.out.print("Even: ");
        for (int i = 0; i < ei; i++) {
            System.out.print(evens[i] + " ");
        }
        System.out.println();
        System.out.print("Odd: ");
        for (int i = 0; i < oi; i++) {
            System.out.print(odds[i] + " ");
        }
    }
}