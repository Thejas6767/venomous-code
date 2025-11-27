package com.xworkz.collection.external;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ColorNamesRunner {
    public static void main(String[] args) {
        List<String> colorList = new ArrayList<>();
        colorList.add("Red");
        colorList.add("Green");
        colorList.add("Blue");
        colorList.add("Yellow");
        colorList.add("Black");
        colorList.add("White");

        ListIterator<String> colorIterator = colorList.listIterator();

        while (colorIterator.hasNext()) {
            String color = colorIterator.next();

            if (color.equals("Green")) {
                colorIterator.add("Cyan");
            }
            if (color.equals("Black")) {
                colorIterator.add("Gray");
            }
            System.out.println(color);
        }
        System.out.println("Final list of colors===" + colorList);
    }
}
