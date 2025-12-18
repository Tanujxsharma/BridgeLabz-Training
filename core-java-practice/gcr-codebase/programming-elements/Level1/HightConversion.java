import java.util.*;
public class HightConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double heightInCentimeters = sc.nextDouble();
        double heightInFeet = heightInCentimeters / 30.48;
        double heightInInches = heightInCentimeters / 2.54;
        System.out.print("Your Height in cm is " + heightInCentimeters + " while in feet is " + heightInFeet + " and inches is " + heightInInches);
    }
}