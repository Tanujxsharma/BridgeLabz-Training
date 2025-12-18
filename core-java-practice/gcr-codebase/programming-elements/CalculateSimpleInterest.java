import java.util.*;
public class CalculateSimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double principal = scanner.nextDouble();
        double rate = scanner.nextDouble();
        double time = scanner.nextDouble();
        double simpleInterest = (principal * rate * time) / 100; // formula to calculate simple interest
        System.out.printf("The Simple Interest is: %.2f\n", simpleInterest); // displaying up to 2 decimal places
    }
}