package com.xworkz.set.external;


import java.util.HashSet;
import java.util.Set;

public class Student {
    public Student(String prasad, int i) {

    }

    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();

        set.add(new Student("Prasad", 10));
        set.add(new Student("Daya", 20));
        set.add(new Student("Mani", 30));
        set.add(new Student("Mani", 30));

        System.out.println("Set items: " + set.toString());
        System.out.println("Size before clear: " + set.size());

        set.clear();
        System.out.println("Size after clear: " + set.size());

        set.add(new Student("Abhi", 40));
        set.add(new Student("Kumar", 50));
        set.add(new Student("Anusha", 60));

        System.out.println("Iterating students:");
        set.forEach(s -> System.out.println(s));
    }
}