package oceanFleet;
import java.util.*;

public class UserInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        VesselUtil vu = new VesselUtil();

        System.out.println("Enter the number of vessels to be added");
        int number = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.println("Enter vessel details");

        for (int i = 0; i < number; i++) {
            String input = sc.nextLine();
            String[] data = input.split(":");

            double speed = Double.parseDouble(data[2]);

            Vessel vessel = new Vessel(
                data[0],
                data[1],
                speed,
                data[3]
            );

            vu.addVesselPreformance(vessel);
        }

        System.out.println("Enter the Vessel Id to check speed");
        String vesselId = sc.next();

        Vessel v = vu.getVesselById(vesselId);

        if (v != null) {
            System.out.println(
                v.getVesselId() + " | " +
                v.getVesselName() + " | " +
                v.getVesselType() + " | " +
                v.getAverageSpeed() + " knots"
            );
        }
        else {
        	System.out.println("Vessel Id "+vesselId+" not found ");
        }

        System.out.println("High performance vessels are");

        List<Vessel> highList = vu.getHighPreformanceVessels();

        for (Vessel hv : highList) {
            System.out.println(
                hv.getVesselId() + " | " +
                hv.getVesselName() + " | " +
                hv.getVesselType() + " | " +
                hv.getAverageSpeed() + " knots"
            );
        }
    }
}
