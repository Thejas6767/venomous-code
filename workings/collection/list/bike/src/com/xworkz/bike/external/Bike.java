package com.xworkz.bike.external;


import java.util.ArrayList;
import java.util.List;

public class Bike {
    public Bike(String kawasaki, int i) {

    }

    public static void main(String[] args) {
        List<Bike> list = new ArrayList<>();

        list.add(new Bike("Yamaha", 155));
        list.add(new Bike("KTM", 390));
        list.add(new Bike("Royal Enfield", 350));

        System.out.println(list.toString());
        System.out.println("Size: " + list.size());

        list.clear();
        System.out.println("Size after clear: " + list.size());

        list.add(new Bike("Kawasaki", 650));
        list.add(new Bike("Honda", 300));
        list.add(new Bike("Suzuki", 250));
        list.add(new Bike("Honda", 300)); // Duplicate entry

        System.out.println(list.toString());
        System.out.println("Final size: " + list.size());
    }
}
