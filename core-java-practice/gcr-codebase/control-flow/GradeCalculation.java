import java.util.*;
class GradeCalculation{   
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int physics =sc.nextInt();
        int chemistry =sc.nextInt();
        int math =sc.nextInt();
        double persent = ((physics+chemistry+math)/300)*100;
        if(persent>=80){
            System.out.println("A, above agency-normalized standard");
        }
        else if(persent>=70){
            System.out.println("B, at agency-normalized standard");
        }
        else if(persent>=60){
            System.out.println("C, below,but approaching agency-normalized standard");
        }
        else if(persent>=50){
            System.out.println("D, well below agency-normalized standard");
        }
        else if(persent>=40){
            System.out.println("E, too below agency-normalized standard");
        }
        else{
            System.out.println("R, remedial standard");
        }
    }
}