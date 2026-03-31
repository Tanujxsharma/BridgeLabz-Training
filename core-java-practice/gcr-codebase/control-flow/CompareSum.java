import java.util.*;
class CompareSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalViaFormula=0.0;
        double totalViaLoop=0.0;
        double number = sc.nextDouble();
        totalViaFormula = number * (number + 1) / 2.0;
        while(number>0){
            totalViaLoop += number;
            number--;
        }
        if(totalViaFormula == totalViaLoop){
            System.out.println("Both sums are equal " );
        } else {
            System.out.println("Sums are not equal");
        }

    }
}