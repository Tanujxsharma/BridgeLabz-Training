import java.util.*;
class FirstNumberSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        if(number1 < number2 && number1 < number3){
            System.out.println("Yes , First Number is the Smallest ");
        }
        else{
            System.out.println("No , First Number is not the Smallest ");
        }
    }
}