package com.xworkz.collection.external;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class KitchenAppliancesRunner {
    public static void main(String[] args) {
        List<String> applianceList = new ArrayList<>();
        applianceList.add("Toaster");
        applianceList.add("Blender");
        applianceList.add("Microwave");
        applianceList.add("Oven");
        applianceList.add("Dishwasher");

        ListIterator<String> applianceIterator = applianceList.listIterator();

        while (applianceIterator.hasNext()) {
            String appliance = applianceIterator.next();

            if (appliance.equals("Blender")) {
                applianceIterator.add("Food Processor");
            }
            if (appliance.equals("Oven")) {
                applianceIterator.add("Air Fryer");
            }
            System.out.println(appliance);
        }
        System.out.println("Final list of appliances===" + applianceList);
    }
}
