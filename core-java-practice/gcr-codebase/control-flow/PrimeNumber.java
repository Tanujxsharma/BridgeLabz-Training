import java.util.*;
class PrimeNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number =sc.nextInt();
        boolean isPrime=false;
        for(int i=2;i<=number/2;i++){
            if(number%i==0){
                isPrime=true;
                break;
            }
        }
        if(isPrime){
            System.out.println("Not Prime");
        }
        else{
            System.out.println("Prime");
        }
    }
}