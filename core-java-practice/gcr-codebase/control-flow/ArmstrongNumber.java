import java.util.*;
class ArmstrongNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int originalNumber =number;
        int sum = 0;
        while(number!=0){
            int digit =number % 10;
            sum += digit*digit*digit;
            number/=10;
        }
        if(sum == originalNumber){
            System.out.println("the number is Armstrong Number");
        } else {
            System.out.println("the number is Not a Armstrong Number");
        }
    }
}