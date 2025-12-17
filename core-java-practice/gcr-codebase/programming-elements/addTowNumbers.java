import java.util.Scanner;
public class addTowNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt(); // take input the first number
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt(); // take input the second number
        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum); // Display the result
    }
}
