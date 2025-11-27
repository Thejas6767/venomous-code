package com.xworkz.collectionFourth.external;

import java.util.Set;
import java.util.TreeSet;

public class ProductPriceRunner {
    public static void main(String[] args) {

        Set<Float> prices = new TreeSet<>();

        prices.add(1500.50f);
        prices.add(999.99f);
        prices.add(2000.00f);
        prices.add(1750.75f);
        prices.add(999.99f);
        prices.forEach(p -> System.out.println(p));

        prices.clear();
        System.out.println("Set size after clearing: " + prices.size());

        prices.add(1200.00f);
        prices.add(1850.40f);
        prices.add(940.25f);
        prices.add(2100.60f);
        prices.add(1200.00f);
        System.out.println(prices);

        prices.forEach(p -> System.out.println(p));
    }
}

