package com.xworkz.collection.external;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class FlowerNamesRunner {
    public static void main(String[] args) {
        List<String> flowerList = new ArrayList<>();
        flowerList.add("Rose");
        flowerList.add("Tulip");
        flowerList.add("Lily");
        flowerList.add("Marigold");
        flowerList.add("Daisy");
        flowerList.add("Sunflower");

        ListIterator<String> flowerIterator = flowerList.listIterator();

        while (flowerIterator.hasNext()) {
            String flower = flowerIterator.next();

            if (flower.equals("Tulip")) {
                flowerIterator.add("Orchid");
            }
            if (flower.equals("Daisy")) {
                flowerIterator.add("Poppy");
            }
            System.out.println(flower);
        }
        System.out.println("Final list of flower names===" + flowerList);
    }
}
