package com.xworkz.sportsteam.external;

import com.xworkz.sportsteam.bridge.*;
import com.xworkz.sportsteam.internal.*;

public class TeamRunner {
    public static void main(String[] args) {
        TeamStats stats = new TeamStats("Coach Taylor", 12);
        TeamRoster roster = new TeamRoster(25, "John Smith");
        TeamPerformance perf = new TeamPerformance(550, "Rivals United");
        TeamFinance finance = new TeamFinance(50.5, "MegaCorp");
        TeamRecord record = new TeamRecord(3, "Premier League");

        TeamInfo teamInfo = new TeamInfoImpl();
        System.out.println("--- Testing TeamInfoImpl ---");
        teamInfo.getStats(stats);
        teamInfo.getRoster(roster);
        teamInfo.getPerformance(perf);
        teamInfo.getFinance(finance);
        teamInfo.getRecord(record);
        System.out.println("---------------------------------");

        TeamStatsAccess statsAccess = new TeamStatsAccessImpl();
        System.out.println("--- Testing TeamStatsAccessImpl ---");
        statsAccess.getStats(stats);
        statsAccess.getRoster(roster);
        statsAccess.getPerformance(perf);
        statsAccess.getFinance(finance);
        statsAccess.getRecord(record);
        System.out.println("---------------------------------");


        TeamRosterAccess rosterAccess = new TeamRosterAccessImpl();
        System.out.println("--- Testing TeamRosterAccessImpl ---");
        rosterAccess.getStats(stats);
        rosterAccess.getRoster(roster);
        rosterAccess.getPerformance(perf);
        rosterAccess.getFinance(finance);
        rosterAccess.getRecord(record);
        System.out.println("---------------------------------");


        TeamPerformanceAccess performanceAccess = new TeamPerformanceAccessImpl();
        System.out.println("--- Testing TeamPerformanceAccessImpl ---");
        performanceAccess.getStats(stats);
        performanceAccess.getRoster(roster);
        performanceAccess.getPerformance(perf);
        performanceAccess.getFinance(finance);
        performanceAccess.getRecord(record);
        System.out.println("---------------------------------");


        TeamFinanceAccess financeAccess = new TeamFinanceAccessImpl();
        System.out.println("-- Testing TeamFinanceAccessImpl ---");
        financeAccess.getStats(stats);
        financeAccess.getRoster(roster);
        financeAccess.getPerformance(perf);
        financeAccess.getFinance(finance);
        financeAccess.getRecord(record);
        System.out.println("---------------------------------");
    }
}

