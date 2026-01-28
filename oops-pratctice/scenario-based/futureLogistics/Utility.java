package futureLogistics;

public class Utility {

    public GoodsTransport parseDetails(String input) {

        String[] data = input.split(":");

        String transportId = data[0];
        String transportDate = data[1];
        int rating = Integer.parseInt(data[2]);
        String transportType = data[3];

        if (!validateTransportId(transportId)) {
            System.out.println("Transport id " + transportId + " is invalid");
            System.out.println("Please provide a valid record");
            return null;
        }

        if (transportType.equalsIgnoreCase("BrickTransport")) {

            float brickSize = Float.parseFloat(data[4]);
            int brickQuantity = Integer.parseInt(data[5]);
            float brickPrice = Float.parseFloat(data[6]);

            return new BrickTransport(
                    transportId, transportDate, rating,
                    brickSize, brickQuantity, brickPrice
            );
        }

        if (transportType.equalsIgnoreCase("TimberTransport")) {

            float timberLength = Float.parseFloat(data[4]);
            float timberRadius = Float.parseFloat(data[5]);
            String timberType = data[6];
            float timberPrice = Float.parseFloat(data[7]);

            return new TimberTransport(
                    transportId, transportDate, rating,
                    timberLength, timberRadius, timberPrice, timberType
            );
        }

        return null;
    }

    public boolean validateTransportId(String transportId) {
        return transportId.matches("RTS[0-9]{3}[A-Z]");
    }

    public String findObjectType(GoodsTransport obj) {
        if (obj instanceof TimberTransport)
            return "TimberTransport";
        if (obj instanceof BrickTransport)
            return "BrickTransport";
        return "Unknown";
    }
}
