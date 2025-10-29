package com.xworkz.sportsteam.bridge;

import com.xworkz.sportsteam.internal.*;

public interface TeamInfo {
    TeamStats getStats(TeamStats teamStats);
    TeamRoster getRoster(TeamRoster teamRoster);
    TeamPerformance getPerformance(TeamPerformance teamPerformance);
    TeamFinance getFinance(TeamFinance teamFinance);
    TeamRecord getRecord(TeamRecord teamRecord);
}