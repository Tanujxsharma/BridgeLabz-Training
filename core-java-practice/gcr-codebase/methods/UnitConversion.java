import java.util.*;
public class UnitConversion {

    public static double convertKmToMiles(double km) {
        return km * 0.621371;
    }

    public static double convertMilesToKm(double miles) {
        return miles * 1.60934;
    }

    public static double convertMetersToFeet(double meters) {
        return meters * 3.28084;
    }

    public static double convertFeetToMeters(double feet) {
        return feet * 0.3048;
    }

    public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	int km=sc.nextInt();

	int miles=sc.nextInt();
	
	int meters=sc.nextInt();

	int feet=sc.nextInt();
        System.out.println("km in miles: " + convertKmToMiles(km));
        System.out.println(" miles in km: " + convertMilesToKm(miles));
        System.out.println("meters in feet: " + convertMetersToFeet(meters));
        System.out.println("feet in meters: " + convertFeetToMeters(feet));
    }
}