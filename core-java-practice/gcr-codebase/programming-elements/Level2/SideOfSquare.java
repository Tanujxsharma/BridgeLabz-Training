import java.util.*;
public class SideOfSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double parameter = scanner.nextDouble();
        double side = parameter / 4; // Calculate the side of the square from parameter
        System.out.println("The length of the side is " + side + " whose perimeter is " + parameter); // Display the result
    }
}