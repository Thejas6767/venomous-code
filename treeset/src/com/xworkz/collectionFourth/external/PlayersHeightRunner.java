package com.xworkz.collectionFourth.external;

import java.util.Set;
import java.util.TreeSet;

public class PlayersHeightRunner {
    public static void main(String[] args) {

        Set<Float> heights = new TreeSet<>();

        heights.add(5.4f);
        heights.add(6.0f);
        heights.add(5.9f);
        heights.add(5.7f);
        heights.add(6.0f);


        heights.forEach(h -> System.out.println(h));

        heights.clear();
        System.out.println("Size after clear: " + heights.size());

        heights.add(5.5f);
        heights.add(6.1f);
        heights.add(5.8f);
        heights.add(6.3f);
        heights.add(5.8f);
        System.out.println(heights);

        heights.forEach(h -> System.out.println(h));
    }
}
