import java.util.*;
class GreatestFactorUsingWhileLoop{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int greatestFactor = 1;
        int i = number;
        while(i >= 1){
            if(number % i == 0){
                greatestFactor = i;
                break;
            }
            i--;
        }
        System.out.println(greatestFactor);
    }
}