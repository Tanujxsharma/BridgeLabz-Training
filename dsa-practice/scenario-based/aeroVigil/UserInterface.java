package aeroVigil;

import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {

        FlightUtil fu = new FlightUtil();
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the details ");
            String str = sc.nextLine();

            String[] data = str.split(":");

            String flightNo = data[0];
            String flightName = data[1];
            int totalPassenger = Integer.parseInt(data[2]);
            double currentFuel = Double.parseDouble(data[3]);

            fu.validateFlightNumber(flightNo);
            fu.validateFlightName(flightName);
            fu.validatePassengerCount(totalPassenger, flightName);

            double fuelToFill = fu.calculateFuelToFillTank(flightName, currentFuel);
            System.out.println("Fuel to be filled : " + fuelToFill);

        } catch (InvalidFlightException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input format");
        }

        sc.close();
    }
}
