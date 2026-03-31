import java.util.*;
class RoundsToCompleteFiveKm{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int firstSide= sc.nextInt();
        int secoundSide= sc.nextInt();
        int thirdSide= sc.nextInt();
        int trackLength= firstSide + secoundSide + thirdSide;
        System.out.println("The number of rounds to complete 5 km is: "+calculateRoundsToCompleteFiveKm(trackLength)+" for the given track length: "+trackLength+" meters");
    }
    public static int calculateRoundsToCompleteFiveKm(int trackLength){
        int totalDistance=5000; // 5 km in meters
        int rounds= totalDistance/trackLength;
        if(totalDistance % trackLength != 0){
            rounds += 1; // Add an extra round if there's a remainder
        }
        return rounds;
    }
}