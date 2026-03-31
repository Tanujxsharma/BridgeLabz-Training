import java.util.*;
class FactorialWithForLoop{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int factorial = 1;
        for(int i=number; i > 1; i--){
            factorial *= i;
        }
        System.out.println(factorial);
    }
}