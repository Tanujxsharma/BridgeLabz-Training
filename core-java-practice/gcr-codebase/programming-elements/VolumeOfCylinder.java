import java.util.*;
public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        double height = scanner.nextDouble();
        double volume = Math.PI * Math.pow(radius, 2) * height;// formula for volume of cylinder
        System.out.printf("The volume of the cylinder is: %.2f\n", volume); // formatted to 2 decimal places
    }
}