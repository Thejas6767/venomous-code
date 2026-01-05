package com.xworkz.bike.external;


import java.util.ArrayList;
import java.util.List;

public class Bottle{
    public Bottle(String copper, int i) {

    }

    public static void main(String[] args) {
        List<Bottle> list = new ArrayList<>();

        list.add(new Bottle("Copper", 1000));
        list.add(new Bottle("Glass", 500));
        list.add(new Bottle("Steel", 750));

        System.out.println(list.toString());
        System.out.println("Initial Size: " + list.size());

        list.clear();
        System.out.println("Size after clear: " + list.size());

        list.add(new Bottle("Plastic", 1000));
        list.add(new Bottle("Bamboo", 750));
        list.add(new Bottle("Silicon", 300));
        list.add(new Bottle("Bamboo", 750));
        System.out.println(list.toString());
        System.out.println("Final size: " + list.size());
    }
}