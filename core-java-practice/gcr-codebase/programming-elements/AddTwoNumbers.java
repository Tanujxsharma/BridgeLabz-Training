import java.util.Scanner;
public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt(); // take input the first number
        int num2 = sc.nextInt(); // take input the second number
        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum); // Display the result
    }
}
