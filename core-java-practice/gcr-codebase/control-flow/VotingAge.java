import java.util.*;
class VotingAge{
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt(); 
        if(age>=18){
            System.out.println("The person can vote");
        }
        else{
            System.out.println("The person cannot vote");
        }
    }
}