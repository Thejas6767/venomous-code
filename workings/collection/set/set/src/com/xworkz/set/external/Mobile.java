package com.xworkz.set.external;


import java.util.HashSet;
import java.util.Set;

public class Mobile {
    public Mobile(String iPhone, int i) {
    }

    public static void main(String[] args) {
        Set<Mobile> set = new HashSet<>();

        set.add(new Mobile("IPhone", 8));
        set.add(new Mobile("Samsung", 12));
        set.add(new Mobile("Pixel", 8));
        set.add(new Mobile("Pixel", 8));

        System.out.println(set.toString());
        System.out.println("Current Size: " + set.size());

        set.clear();
        System.out.println("Size after clear: " + set.size());

        set.add(new Mobile("OnePlus", 16));
        set.add(new Mobile("Nokia", 4));
        set.add(new Mobile("Vivo", 8));

        System.out.println("Iterating through the Set:");
        set.forEach(m -> System.out.println(m));
    }
}