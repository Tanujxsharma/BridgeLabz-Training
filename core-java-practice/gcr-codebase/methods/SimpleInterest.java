import java.util.*;
class SimpleInterest{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int pinciple= sc.nextInt();
        int rate= sc.nextInt();
        int time= sc.nextInt();
        System.out.println("The Simple Interest is: "+calclulateSimpleInterest(pinciple,rate,time)+"for the given pinciple "+pinciple+", rate "+rate+" and time "+time );
    }
    public static int calclulateSimpleInterest(int pinciple, int rate, int time){
        int simpleInterest= (pinciple*rate*time)/100;
        return simpleInterest;
    }
}