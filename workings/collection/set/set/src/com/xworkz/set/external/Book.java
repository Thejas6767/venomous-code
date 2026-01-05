package com.xworkz.set.external;


import java.util.HashSet;
import java.util.Set;

public class Book {
    public Book(String javaBasics, double v) {

    }

    public static void main(String[] args) {
        Set<Book> set = new HashSet<>();

        set.add(new Book("Java Basics", 500.0));
        set.add(new Book("Spring Boot", 750.0));
        set.add(new Book("Microservices", 1200.0));
        set.add(new Book("Java Basics", 500.0));
        System.out.println("Set content: " + set.toString());
        System.out.println("Size: " + set.size());

        set.clear();
        System.out.println("Size after clear: " + set.size());

        set.add(new Book("SQL Guide", 450.0));
        set.add(new Book("Hibernate", 600.0));
        set.add(new Book("clean code", 900.0));
        System.out.println("Printing Books:");
        set.forEach(book -> System.out.println(book));
    }
}