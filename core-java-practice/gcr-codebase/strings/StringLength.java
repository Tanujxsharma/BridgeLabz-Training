import java.util.*;
class StringLength{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String input=sc.next();
        int length=stringLength(input);
        System.out.println("Length of the string is: "+length);
    }
    public static int stringLength(String input){
        int count=0;
        for(char c:input.toCharArray()){
            count++;
        }
        return count;
    }
}