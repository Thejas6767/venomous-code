package com.xworkz.collection.external;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class CurrencyRunner {
    public static void main(String[] args) {
        List<String> currencyList = new ArrayList<>();
        currencyList.add("USD");
        currencyList.add("EUR");
        currencyList.add("JPY");
        currencyList.add("GBP");
        currencyList.add("AUD");

        ListIterator<String> currencyIterator = currencyList.listIterator();

        while (currencyIterator.hasNext()) {
            String currency = currencyIterator.next();

            if (currency.equals("EUR")) {
                currencyIterator.add("CHF");
            }
            if (currency.equals("GBP")) {
                currencyIterator.add("CAD");
            }
            System.out.println(currency);
        }
        System.out.println("Final list of currencies===" + currencyList);
    }
}
