import java.util.Scanner;

public class ValidateIP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ip = sc.nextLine();
        String pattern = "^((25[0-5]|2[0-4]\d|1\d\d|[1-9]?\d)\.){3}(25[0-5]|2[0-4]\d|1\d\d|[1-9]?\d)$";
        System.out.println(ip.matches(pattern) ? "Valid" : "Invalid");
    }
}