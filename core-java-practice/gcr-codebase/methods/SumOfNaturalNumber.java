import java.util.Scanner;

public class SumOfNaturalNumber {
    
    // Method to find sum using recursion
    public static long sumRecursive(long n) {
        if (n <= 0) {
            return 0;
        }
        return n + sumRecursive(n - 1);
    }
    
    // Method to find sum using formula n*(n+1)/2
    public static long sumFormula(long n) {
        return (n * (n + 1)) / 2;
    }
    
    // Method to validate if number is natural
    public static boolean isNaturalNumber(long num) {
        return num > 0;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long number = sc.nextLong();
        // Calculate sum using both methods
        long recursiveSum = sumRecursive(number);
        long formulaSum = sumFormula(number);
        
        // Display results
        System.out.println("\nResults for n = " + number + ":");
        System.out.println("Sum using Recursion: " + recursiveSum);
        System.out.println("Sum using Formula n*(n+1)/2: " + formulaSum);
        
        // Compare results
        if (recursiveSum == formulaSum) {
            System.out.println("\n Both methods produce the same result: " + recursiveSum);
        } else {
            System.out.println("\n Results do not match!");
        }
    }
}