import java.util.*;
public class KilometerIntoMiles{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double kilometers = scanner.nextDouble();
        double miles = kilometers * 0.6; // Convert kilometers to miles
        System.out.println("The total miles is " + miles + " mile for the given " + kilometers + " km");
    }
}