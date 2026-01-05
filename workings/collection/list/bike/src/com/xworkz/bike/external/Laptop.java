package com.xworkz.bike.external;


import java.util.ArrayList;
import java.util.List;

public class Laptop {
    public Laptop(String hp, int i) {

    }

    public static void main(String[] args) {
        List<Laptop> list = new ArrayList<>();

        list.add(new Laptop("HP", 8));
        list.add(new Laptop("Dell", 16));
        list.add(new Laptop("MacBook", 8));

        System.out.println(list.toString());
        System.out.println("Size: " + list.size());

        list.clear();
        System.out.println("Size after clear: " + list.size());

        list.add(new Laptop("Lenovo", 12));
        list.add(new Laptop("Asus", 16));
        list.add(new Laptop("Acer", 8));
        list.add(new Laptop("Asus", 16));

        System.out.println(list.toString());
        System.out.println("Final size: " + list.size());
    }
}