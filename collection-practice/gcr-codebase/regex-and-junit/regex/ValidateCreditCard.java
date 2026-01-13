import java.util.Scanner;

public class ValidateCreditCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String card = sc.nextLine();
        boolean valid = card.matches("^4\d{15}$") || card.matches("^5\d{15}$");
        System.out.println(valid ? "Valid" : "Invalid");
    }
}