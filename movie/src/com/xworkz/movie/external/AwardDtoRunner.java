package com.xworkz.movie.external;


import com.xworkz.movie.dto.AwardDto;

public class AwardDtoRunner {
    public static void main(String[] args) {
        AwardDto award1 = new AwardDto();
        award1.setAwardID(701);
        award1.setCashPrize(1000000L);
        award1.setIsInternational(true);
        award1.setCategoryRank('B');
        award1.setTrophyWeightKg(3.5);
        award1.setMediaCoverageIndex(9.8f);
        award1.setAwardName("Golden Globe");
        award1.setRecipientName("Best Screenplay");
        award1.setYearAwarded(2024);
        award1.setTotalViewsCeremony(5000000L);
        award1.setJudgingScore(92.5);
        award1.setNomineeChance(0.2f);
        award1.setAcceptedInPerson(true);

        System.out.println("---- AWARD DETAILS ----");
        System.out.println(award1);
    }
}
