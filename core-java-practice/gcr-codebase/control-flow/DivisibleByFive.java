import java.util.*;
class DivisibleByFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number%5 == 0) 
        {
            System.out.println("The Number "+ number + " is divisible by 5");
        } 
        else 
        {
            System.out.println("The Number "+ number + " is not divisible by 5");
        }
    }
}