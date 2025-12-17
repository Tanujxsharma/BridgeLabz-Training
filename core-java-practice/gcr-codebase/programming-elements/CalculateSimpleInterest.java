import java.util.*;
public class CalculateSimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter annual interest rate (in %): ");
        double rate = scanner.nextDouble();
        System.out.print("Enter time period (in years): ");
        double time = scanner.nextDouble();
        double simpleInterest = (principal * rate * time) / 100; // formula to calculate simple interest
        System.out.printf("The Simple Interest is: %.2f\n", simpleInterest); // displaying up to 2 decimal places
    }
}