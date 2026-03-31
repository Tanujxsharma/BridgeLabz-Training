import java.util.*;
public class MaximumNumberOfHandshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int maxHandshakes = n * (n - 1) / 2; // Calculate maximum number of handshakes
        System.out.println("The maximum number of handshakes possible is " + maxHandshakes); // Display the result
    }
}
