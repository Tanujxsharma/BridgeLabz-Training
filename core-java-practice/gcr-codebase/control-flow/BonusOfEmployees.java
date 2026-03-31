import java.util.*;
class BonusOfEmployees{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        int yearsOfService = sc.nextInt();
        if(yearsOfService > 5){
            double bonus = salary * 0.05;
            System.out.println(bonus);
        } else {
            System.out.println("No Bonus");
        }
    }
}