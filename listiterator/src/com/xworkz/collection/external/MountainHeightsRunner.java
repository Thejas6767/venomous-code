package com.xworkz.collection.external;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class MountainHeightsRunner {
    public static void main(String[] args) {
        List<Double> heightList = new ArrayList<>();
        heightList.add(8848.86);
        heightList.add(8611.0);
        heightList.add(8586.0);
        heightList.add(8516.0);

        ListIterator<Double> heightIterator = heightList.listIterator();

        while (heightIterator.hasNext()) {
            Double height = heightIterator.next();

            if (height.equals(8611.0)) {
                heightIterator.add(8800.0);
            }
            if (height.equals(8516.0)) {
                heightIterator.add(8000.0);
            }
            System.out.println(height);
        }
        System.out.println("Final list of heights===" + heightList);
    }
}