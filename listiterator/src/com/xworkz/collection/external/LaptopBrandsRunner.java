package com.xworkz.collection.external;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class LaptopBrandsRunner {
    public static void main(String[] args) {
        List<String> laptopList = new ArrayList<>();
        laptopList.add("Dell");
        laptopList.add("HP");
        laptopList.add("Lenovo");
        laptopList.add("Asus");
        laptopList.add("Acer");
        laptopList.add("Microsoft");
        laptopList.add("Apple");

        ListIterator<String> laptopIterator = laptopList.listIterator();

        while (laptopIterator.hasNext()) {
            String brand = laptopIterator.next();

            if (brand.equals("HP")) {
                laptopIterator.add("Compaq");
            }
            if (brand.equals("Acer")) {
                laptopIterator.add("Alienware");
            }
            System.out.println(brand);
        }
        System.out.println("Final list of laptop brands===" + laptopList);
    }
}