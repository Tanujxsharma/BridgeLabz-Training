import java.util.*;
public class TotalPrize{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int unitPrize = sc.nextInt();
        int quantity = sc.nextInt();
        int totalPrize = unitPrize * quantity;
        System.err.println("The total purchase price is INR " + totalPrize + " if the quantity  " + quantity + " and unit price is INR " + unitPrize);
    }
}