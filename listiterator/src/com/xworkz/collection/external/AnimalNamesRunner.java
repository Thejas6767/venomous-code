package com.xworkz.collection.external;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class AnimalNamesRunner {
    public static void main(String[] args) {
        List<String> animalList = new ArrayList<>();
        animalList.add("Lion");
        animalList.add("Tiger");
        animalList.add("Elephant");
        animalList.add("Giraffe");
        animalList.add("Zebra");
        animalList.add("Panda");

        ListIterator<String> animalIterator = animalList.listIterator();

        while (animalIterator.hasNext()) {
            String animal = animalIterator.next();

            if (animal.equals("Tiger")) {
                animalIterator.add("Leopard");
            }
            if (animal.equals("Zebra")) {
                animalIterator.add("Hippopotamus");
            }
            System.out.println(animal);
        }
        System.out.println("Final list of animal names===" + animalList);
    }
}