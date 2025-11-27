package com.xworkz.collectionFourth.external;

import java.util.Set;
import java.util.TreeSet;

public class StudentMarksRunner {
    public static void main(String[] args) {

        Set<Float> marks = new TreeSet<>();

        marks.add(78.5f);
        marks.add(85.0f);
        marks.add(92.3f);
        marks.add(88.8f);
        marks.add(85.0f);
        marks.forEach(m -> System.out.println(m));

        marks.clear();
        System.out.println("Size after clear: " + marks.size());

        marks.add(81.4f);
        marks.add(90.2f);
        marks.add(76.9f);
        marks.add(88.0f);
        marks.add(81.4f);
        System.out.println(marks);

        marks.forEach(m -> System.out.println(m));
    }
}

