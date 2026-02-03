package workshop;

import java.util.*;

public class UserInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter user name:");
        String name = sc.nextLine();

        System.out.println("Enter source (agra / mathura / delhi / hathrus):");
        String from = sc.nextLine();

        System.out.println("Enter destination:");
        String to = sc.nextLine();

        System.out.println("Choose service (bus / metro / taxi):");
        String type = sc.nextLine();

        User user = new User(name, from, to, type);

//        List<TransportService> services = new ArrayList<>();
//
//        services.add(new BusService(from, to));
//        services.add(new MetroService(from, to));

        // 1️⃣ Filter + Sort using Lambda
//        services.stream()
//        .sorted(Comparator.comparingDouble(TransportService::getBaseFare))
//        .forEach(TransportService::printServiceDetails);

        // 2️⃣ Taxi handling
        if(user.getServiceType().equalsIgnoreCase("taxi")) {
            TaxiService taxi = new TaxiService(from, to);
            taxi.displayAvailableTaxis();
        }
        if (user.getServiceType().equalsIgnoreCase("bus")) {
            BusService bus = new BusService(from, to);
            bus.displayAvailableBuses();   
        }
        sc.close();
    }
}
