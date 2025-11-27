package com.xworkz.collection.external;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class CarBrandsRunner {
    public static void main(String[] args) {
        List<String> carList = new ArrayList<>();
        carList.add("BMW");
        carList.add("Audi");
        carList.add("Mercedes");
        carList.add("Toyota");
        carList.add("Ford");
        carList.add("Hyundai");
        carList.add("Kia");
        carList.add("Volvo");

        ListIterator<String> carIterator = carList.listIterator();

        while (carIterator.hasNext()) {
            String car = carIterator.next();

            if (car.equals("Audi")) {
                carIterator.add("Lexus");
            }
            if (car.equals("Ford")) {
                carIterator.remove();
            }
            System.out.println(car);
        }
        System.out.println("Final list of car names = " + carList);
    }
}