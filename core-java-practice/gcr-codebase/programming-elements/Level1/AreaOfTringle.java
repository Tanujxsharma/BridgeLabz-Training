import java.util.*;
public class AreaOfTringle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        double areaInInches = 0.5 * base * height;
        double areaInCm = areaInInches * 2.54 * 2.54;
        System.out.print("The area of triangle with base " + base + " inches and height " + height + " inches is " + areaInInches + " and " + areaInCm);
    }
}