package com.xworkz.collection.external;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class SocialMediaRunner {
    public static void main(String[] args) {
        List<String> appList = new ArrayList<>();
        appList.add("Facebook");
        appList.add("Instagram");
        appList.add("Twitter");
        appList.add("LinkedIn");
        appList.add("Snapchat");

        ListIterator<String> appIterator = appList.listIterator();

        while (appIterator.hasNext()) {
            String app = appIterator.next();

            if (app.equals("Instagram")) {
                appIterator.add("Threads");
            }
            if (app.equals("LinkedIn")) {
                appIterator.add("Indeed");
            }
            System.out.println(app);
        }
        System.out.println("Final list of apps/sites===" + appList);
    }
}