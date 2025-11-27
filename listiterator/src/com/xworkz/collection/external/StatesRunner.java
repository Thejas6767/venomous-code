package com.xworkz.collection.external;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class StatesRunner {
    public static void main(String[] args) {
        List<String> stateList = new ArrayList<>();
        stateList.add("California");
        stateList.add("Texas");
        stateList.add("Florida");
        stateList.add("New York");
        stateList.add("Illinois");
        stateList.add("Ohio");

        ListIterator<String> stateIterator = stateList.listIterator();

        while (stateIterator.hasNext()) {
            String state = stateIterator.next();

            if (state.equals("Texas")) {
                stateIterator.add("Nevada");
            }
            if (state.equals("Illinois")) {
                stateIterator.add("Michigan");
            }
            System.out.println(state);
        }
        System.out.println("Final list of states===" + stateList);
    }
}