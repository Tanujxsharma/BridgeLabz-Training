import java.util.*;
class HarshadNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number =sc.nextInt();
        int sum =0;
        int temp =number;
        while(number>0){
            int digit =number %10;
            sum +=digit;
            number /=10;
        }
        if(temp % sum ==0){
            System.out.println("yes, Harshad Number");
        }else{
            System.out.println("No, Not a Harshad Number");
        }
    }
}