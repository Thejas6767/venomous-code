package com.xworkz.collectionFourth.external;

import java.util.Set;
import java.util.TreeSet;

public class CityTemperatureRunner {
    public static void main(String[] args) {

        Set<Float> temperatures = new TreeSet<>();

        temperatures.add(32.5f);
        temperatures.add(28.3f);
        temperatures.add(35.0f);
        temperatures.add(30.8f);
        temperatures.add(28.3f);

        temperatures.forEach(t -> System.out.println(t));

        temperatures.clear();
        System.out.println("Size after clear: " + temperatures.size());

        temperatures.add(27.4f);
        temperatures.add(33.6f);
        temperatures.add(29.9f);
        temperatures.add(36.1f);
        temperatures.add(27.4f);
        System.out.println(temperatures);

        temperatures.forEach(t -> System.out.println(t));
    }
}

