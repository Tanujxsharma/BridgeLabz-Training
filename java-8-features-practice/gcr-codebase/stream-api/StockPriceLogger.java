package streamApi;

import java.util.*;

public class StockPriceLogger {
    public static void main(String[] args) {

        List<Double> stockPrices = Arrays.asList(120.5, 118.75, 121.30, 119.90);

        stockPrices.forEach(price ->System.out.println("Live Stock Price: " + price));
    }
}
