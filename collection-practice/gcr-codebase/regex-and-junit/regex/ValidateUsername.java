import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateUsername {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        boolean valid = Pattern.matches("^[A-Za-z][A-Za-z0-9_]{4,14}$", username);
        System.out.println(valid ? "Valid" : "Invalid");
    }
}