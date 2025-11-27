package com.xworkz.collection.external;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class BeverageNamesRunner {
    public static void main(String[] args) {
        List<String> beverageList = new ArrayList<>();
        beverageList.add("Coffee");
        beverageList.add("Tea");
        beverageList.add("Water");
        beverageList.add("Soda");
        beverageList.add("Juice");
        beverageList.add("Milk");

        ListIterator<String> beverageIterator = beverageList.listIterator();

        while (beverageIterator.hasNext()) {
            String beverage = beverageIterator.next();

            if (beverage.equals("Tea")) {
                beverageIterator.add("Green Tea");
            }
            if (beverage.equals("Juice")) {
                beverageIterator.add("Smoothie");
            }
            System.out.println(beverage);
        }
        System.out.println("Final list of beverages===" + beverageList);
    }
}
