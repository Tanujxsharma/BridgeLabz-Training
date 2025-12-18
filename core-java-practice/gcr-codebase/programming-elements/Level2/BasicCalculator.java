import java.util.*;
public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();

        double sum = num1+num2;
        double difference = num1-num2;
        double multiplication = num1*num2;
        double division = num1/num2;
        System.out.print("The addition, subtraction, multiplication and division value of 2 numbers " + num1 + " and " + num2 + " is " + sum + ", " + difference + ", " + multiplication + ", and " + division);
    }
}