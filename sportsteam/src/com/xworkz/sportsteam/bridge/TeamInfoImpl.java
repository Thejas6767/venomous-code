package com.xworkz.sportsteam.bridge;

import com.xworkz.sportsteam.internal.*;

public class TeamInfoImpl implements TeamInfo {
    @Override
    public TeamStats getStats(TeamStats teamStats) {
        System.out.println("--- Stats --- Coach: " + TeamStats.coachName + ", Wins: " + TeamStats.wins);
        return teamStats;
    }
    @Override
    public TeamRoster getRoster(TeamRoster teamRoster) {
        System.out.println("--- Roster --- Players: " + TeamRoster.numberOfPlayers + ", Captain: " + TeamRoster.captainName);
        return teamRoster;
    }
    @Override
    public TeamPerformance getPerformance(TeamPerformance teamPerformance) {
        System.out.println("--- Perf. --- Total Score: " + TeamPerformance.scoreTotal + ", Last Game: " + TeamPerformance.latestOpponent);
        return teamPerformance;
    }
    @Override
    public TeamFinance getFinance(TeamFinance teamFinance) {
        System.out.println("--- Finance --- Budget (M): $" + TeamFinance.budgetMillions + ", Sponsor: " + TeamFinance.sponsor);
        return teamFinance;
    }
    @Override
    public TeamRecord getRecord(TeamRecord teamRecord) {
        System.out.println("--- Record --- Rank: " + TeamRecord.rank + ", League: " + TeamRecord.leagueName);
        return teamRecord;
    }
}
