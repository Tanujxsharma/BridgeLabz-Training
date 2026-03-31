import java.util.*;
public class DistanceInYardsAndMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double feets = sc.nextDouble();
        double miles = feets / 5280; // Convert feet to miles
        double yards = feets / 3; // Convert feet to yards
        System.out.print("The distance in feets is " + feets + " in miles is " + miles + " and in yards is " + yards);
    }
}