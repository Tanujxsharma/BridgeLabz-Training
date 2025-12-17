import java.util.Scanner;
public class areaOfCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble(); // Read radius input from user
        double area = Math.PI * radius * radius; // Area calculation using the formula PI * radius *radius
        System.out.println("The area of the circle is: " + area); 
    }
}