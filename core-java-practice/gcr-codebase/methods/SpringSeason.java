import java.util.*;
public class SpringSeason {
    public static boolean isSpringSeason(int month, int day) {
        // Spring: March 20 to June 20
        if (month < 3 || month > 6) {
            return false;
        }
        
        if (month == 3 && day < 20) {
            return false;
        } 
        if (month == 6 && day > 20) {
            return false;
        }
        
        return true;
    }
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
        int month = sc.nextInt();
        int day = sc.nextInt();
        
        if (isSpringSeason(month, day)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}