import java.util.*;
class MaximumHandshake{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println("The Maximum Handshakes possible are: "+calculateMaximumHandshakes(n)+" for the given number of people: "+n);
    }
    public static int calculateMaximumHandshakes(int n){
        int maxHandshakes= (n*(n-1))/2;
        return maxHandshakes;
    }
}