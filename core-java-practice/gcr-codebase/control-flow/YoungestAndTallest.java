import java.util.*;
class YoungestAndTallest{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int age1 = sc.nextInt();
        int height1 = sc.nextInt();
        int age2 = sc.nextInt();
        int height2 = sc.nextInt();
        int age3 = sc.nextInt();
        int height3 = sc.nextInt();
        if(age1<age2 && age1<age3){
            System.out.println("Friend 1 is Youngest");
        } else if(age2<age1 && age2<age3){
            System.out.println("Friend 2 is Youngest");
        } else if(age3 < age1 && age3 < age2){
            System.out.println("Friend 3 is Youngest");
        } 
        if(height1>height2 && height1>height3){
            System.out.println("Friend 1 is Tallest");
        } else if(height2>height1 && height2>height3){
            System.out.println("Friend 2 is Tallest");
        } else if(height3>height1 && height3>height2){
            System.out.println("Friend 3 is Tallest");
        } 
    }
}