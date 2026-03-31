import java.util.*;
class FactorialWithWhileLoop{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int factorial = 1;
        while(number > 1){
            factorial *= number;
            number--;
        }
        System.out.println(factorial);
    }
}