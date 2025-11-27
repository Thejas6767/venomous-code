package com.xworkz.collection.external;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class CityNamesRunner {
    public static void main(String[] args) {
        List<String> cityList = new ArrayList<>();
        cityList.add("New York");
        cityList.add("London");
        cityList.add("Paris");
        cityList.add("Tokyo");
        cityList.add("Sydney");
        cityList.add("Dubai");
        cityList.add("Rio");

        ListIterator<String> cityIterator = cityList.listIterator();

        while (cityIterator.hasNext()) {
            String city = cityIterator.next();

            if (city.equals("London")) {
                cityIterator.add("Berlin");
            }
            if (city.equals("Sydney")) {
                cityIterator.add("Melbourne");
            }
            System.out.println(city);
        }
        System.out.println("Final list of city names===" + cityList);
    }
}
