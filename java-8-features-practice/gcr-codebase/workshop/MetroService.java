package workshop;

public class MetroService implements TransportService {

    double price;

    public MetroService(String from, String to) {

        double distance = GeoUtils.calculateDistance(from, to);

        FareCalculator calc = () -> distance * 2;

        price = calc.calculateFare();
    }

    @Override
    public double getBaseFare() {
        return price;
    }
}
