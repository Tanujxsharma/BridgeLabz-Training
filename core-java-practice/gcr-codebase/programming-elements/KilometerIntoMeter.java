import java.util.*;
public class KilometerIntoMeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double kilometers = scanner.nextDouble();
        double meters = kilometers * 1000; // Convert kilometers to meters
        System.out.println(kilometers + " kilometers is equal to " + meters + " meters."); // Display the result
    }
}