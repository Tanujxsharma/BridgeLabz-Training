import java.util.*;
class NaturalNumber{
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number>0){
            System.out.print("The sum Of "+number+"natural numbers is "+(number*(number+1)/2));
        }
        else{
            System.out.println("The number "+number+" is not a natural number");
        }
    }
}