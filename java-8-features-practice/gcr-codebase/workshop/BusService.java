package workshop;

import java.util.*;

public class BusService implements TransportService {

    double distance;

    public BusService(String from, String to) {
        distance = GeoUtils.calculateDistance(from, to);
    }

    public void displayAvailableBuses() {

        if (distance == 0) {
            System.out.println("Route not available");
            return;
        }

        List<BusType> buses = Arrays.asList(
            new BusType("Local Bus", 2.0),
            new BusType("Express Bus", 3.0),
            new BusType("AC Bus", 4.0),
            new BusType("Volvo", 5.0)
        );

        buses.stream()
             .sorted(Comparator.comparing(b -> b.ratePerKm))
             .forEach(b -> {

                 FareCalculator calculator = () -> distance * b.ratePerKm;

                 System.out.println(
                     b.name + " Fare: " + calculator.calculateFare()
                 );
             });
    }

    @Override
    public double getBaseFare() {
        return 50; // minimum bus fare (base)
    }

  
}
