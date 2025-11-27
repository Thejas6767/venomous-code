package com.xworkz.collection.external;


import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class FruitNamesRunner {
    public static void main(String[] args) {
        List<String> fruitList = new ArrayList<>();
        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Cherry");
        fruitList.add("Date");
        fruitList.add("Elderberry");
        fruitList.add("Fig");
        fruitList.add("Grape");

        ListIterator<String> fruitIterator = fruitList.listIterator();

        while (fruitIterator.hasNext()) {
            String fruit = fruitIterator.next();

            if (fruit.equals("Banana")) {
                fruitIterator.add("Blueberry");
            }
            if (fruit.equals("Fig")) {
                fruitIterator.remove();
            }
            System.out.println(fruit);
        }
        System.out.println("Final list of fruit names===" + fruitList);
    }
}
