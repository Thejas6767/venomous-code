package com.xworkz.collection.external;


import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class PlanetNamesRunner {
    public static void main(String[] args) {
        List<String> planetList = new ArrayList<>();
        planetList.add("Mercury");
        planetList.add("Venus");
        planetList.add("Earth");
        planetList.add("Mars");
        planetList.add("Jupiter");
        planetList.add("Saturn");
        planetList.add("Uranus");

        ListIterator<String> planetIterator = planetList.listIterator();

        while (planetIterator.hasNext()) {
            String planet = planetIterator.next();

            if (planet.equals("Earth")) {
                planetIterator.add("Moon"); // Adding a satellite for example
            }
            if (planet.equals("Saturn")) {
                planetIterator.add("Titan"); // Adding a moon
            }
            System.out.println(planet);
        }
        System.out.println("Final list of planets/objects===" + planetList);
    }
}
