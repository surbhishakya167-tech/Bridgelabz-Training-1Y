package StockPriceLogger;

import java.util.*;

public class StockPriceLogger {

    public static void main(String[] args) {

        List<Double> stockPrices = Arrays.asList(150.5, 152.3, 149.8, 151.2, 153.0);

        stockPrices.forEach(price -> System.out.println("Stock Price: " + price));
    }
}