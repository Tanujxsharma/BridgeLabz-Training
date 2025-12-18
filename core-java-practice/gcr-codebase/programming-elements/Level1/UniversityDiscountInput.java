import java.util.*;
public class UniversityDiscountInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fees = sc.nextDouble();
        double discountPercentage = sc.nextDouble();
        double discountAmount = (fees * discountPercentage) / 100;
        double finalFees = fees - discountAmount;
        System.out.println("The discount amount is INR " + discountAmount + " and final discounted fee is INR " + finalFees);
    }
}