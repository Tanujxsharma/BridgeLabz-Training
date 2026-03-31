package workshop;

import java.util.*;

public class TaxiService implements TransportService {

    double distance;

    public TaxiService(String from, String to) {
        distance = GeoUtils.calculateDistance(from, to);
    }

    public void displayAvailableTaxis() {

        if (distance == 0) {
            System.out.println("Route not available");
            return;
        }

        List<TaxiType> taxis = Arrays.asList(
            new TaxiType("Mini", 10),
            new TaxiType("Sedan", 15),
            new TaxiType("SUV", 20),
            new TaxiType("Luxury", 25)
        );

        taxis.stream()
             .sorted(Comparator.comparing(t -> t.ratePerKm))
             .forEach(t -> {

                 FareCalculator calculator = () -> distance * t.ratePerKm;

                 System.out.println(
                     t.name + " Taxi Fare: " + calculator.calculateFare()
                 );
             });
    }

    @Override
    public double getBaseFare() {
        return 100; // minimum taxi fare
    }

}
