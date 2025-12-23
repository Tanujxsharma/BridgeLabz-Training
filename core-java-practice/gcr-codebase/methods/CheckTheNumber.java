import java.util.*;
class CheckTheNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number= sc.nextInt();
        System.out.println("The number "+number+" is: "+checkNumber(number));
    }
    public static String checkNumber(int number){
        if(number>0){
            return "Positive";
        }else if(number<0){
            return "Negative";
        }else{
            return "Zero";
        }
    }
}