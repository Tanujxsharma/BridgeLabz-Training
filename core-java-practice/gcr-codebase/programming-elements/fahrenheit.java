import java.util.Scanner;
public class Fahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble(); // Read temperature in Celsius from the user
        double fahrenheit = (celsius * 9/5) + 32; // Conversion formula from Celsius to Fahrenheit
        System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit."); 
    }
}