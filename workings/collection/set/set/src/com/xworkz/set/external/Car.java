package com.xworkz.set.external;


import java.util.HashSet;
import java.util.Set;

public class Car {
    public Car(String thar, String black) {

    }

    public static void main(String[] args) {
        Set<Car> set = new HashSet<>();

        set.add(new Car("Thar", "Black"));
        set.add(new Car("Swift", "White"));
        set.add(new Car("XUV700", "Blue"));


        set.add(new Car("Thar", "Black"));

        System.out.println("Set content: " + set.toString());
        System.out.println("Size: " + set.size());

        set.clear();
        System.out.println("Size after clear: " + set.size());

        set.add(new Car("Ferrari", "Red"));
        set.add(new Car("BMW", "Silver"));
        set.add(new Car("Audi", "Grey"));

        System.out.println("Iterating using forEach:");
        set.forEach(c -> System.out.println(c));
    }
}