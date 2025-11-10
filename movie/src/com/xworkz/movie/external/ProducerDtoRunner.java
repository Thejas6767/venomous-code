package com.xworkz.movie.external;


import com.xworkz.movie.dto.ProducerDto;

public class ProducerDtoRunner {
    public static void main(String[] args) {
        ProducerDto producer1 = new ProducerDto();
        producer1.setProducerID(401);
        producer1.setTotalInvestment(950000000L);
        producer1.setOwnsStudio(true);
        producer1.setFundingGrade('A');
        producer1.setAverageProfitMargin(0.15);
        producer1.setRiskTolerance(0.5f);
        producer1.setProducerName("Kevin Feige");
        producer1.setProductionCompany("Marvel Studios");
        producer1.setMoviesProduced(35);
        producer1.setCompanyWorth(5000000000L);
        producer1.setAvgReviewScore(8.1);
        producer1.setDistributionFee(0.05f);
        producer1.setIsIndependent(false);

        System.out.println("---- PRODUCER DETAILS ----");
        System.out.println(producer1);
    }
}
