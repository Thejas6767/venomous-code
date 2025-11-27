package com.xworkz.collection.external;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ShoeSizesRunner {
    public static void main(String[] args) {
        List<Integer> sizeList = new ArrayList<>();
        sizeList.add(7);
        sizeList.add(8);
        sizeList.add(9);
        sizeList.add(10);
        sizeList.add(11);
        sizeList.add(12);

        ListIterator<Integer> sizeIterator = sizeList.listIterator();

        while (sizeIterator.hasNext()) {
            Integer size = sizeIterator.next();

            if (size.equals(8)) {
                sizeIterator.add(85);
            }
            if (size.equals(11)) {
                sizeIterator.add(115);
            }
            System.out.println(size);
        }
        System.out.println("Final list of shoe sizes===" + sizeList);
    }
}
