import java.util.*;
public class QuotientAndReminder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int quotient = number1 / number2; // Calculate quotient
        int remainder = number1 % number2; // Calculate remainder
        System.out.println("The quotient is " + quotient + " and the remainder is " + remainder); // Display the result
    }
}