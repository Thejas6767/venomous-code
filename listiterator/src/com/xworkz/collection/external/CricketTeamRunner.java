package com.xworkz.collection.external;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class CricketTeamRunner {
    public static void main(String[] args) {
        List<String> teamList = new ArrayList<>();
        teamList.add("India");
        teamList.add("Australia");
        teamList.add("England");
        teamList.add("South Africa");
        teamList.add("New Zealand");
        teamList.add("Pakistan");

        ListIterator<String> teamIterator = teamList.listIterator();

        while (teamIterator.hasNext()) {
            String team = teamIterator.next();

            if (team.equals("Australia")) {
                teamIterator.add("West Indies");
            }
            if (team.equals("New Zealand")) {
                teamIterator.add("Bangladesh");
            }
            System.out.println(team);
        }
        System.out.println("Final list of cricket teams===" + teamList);
    }
}
