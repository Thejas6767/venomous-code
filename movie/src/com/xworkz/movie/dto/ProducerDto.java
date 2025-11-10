package com.xworkz.movie.dto;

import java.util.Objects;

public class ProducerDto {

    private int producerID;
    private long totalInvestment;
    private boolean ownsStudio;
    private char fundingGrade;
    private double averageProfitMargin;
    private float riskTolerance;

    private String producerName;
    private String productionCompany;
    private Integer moviesProduced;
    private Long companyWorth;
    private Double avgReviewScore;
    private Float distributionFee;
    private Boolean isIndependent;

    public void setProducerID(int producerID) { this.producerID = producerID; }
    public void setTotalInvestment(long totalInvestment) { this.totalInvestment = totalInvestment; }
    public void setOwnsStudio(boolean ownsStudio) { this.ownsStudio = ownsStudio; }
    public void setFundingGrade(char fundingGrade) { this.fundingGrade = fundingGrade; }
    public void setAverageProfitMargin(double averageProfitMargin) { this.averageProfitMargin = averageProfitMargin; }
    public void setRiskTolerance(float riskTolerance) { this.riskTolerance = riskTolerance; }
    public void setProducerName(String producerName) { this.producerName = producerName; }
    public void setProductionCompany(String productionCompany) { this.productionCompany = productionCompany; }
    public void setMoviesProduced(Integer moviesProduced) { this.moviesProduced = moviesProduced; }
    public void setCompanyWorth(Long companyWorth) { this.companyWorth = companyWorth; }
    public void setAvgReviewScore(Double avgReviewScore) { this.avgReviewScore = avgReviewScore; }
    public void setDistributionFee(Float distributionFee) { this.distributionFee = distributionFee; }
    public void setIsIndependent(Boolean isIndependent) { this.isIndependent = isIndependent; }

    public int getProducerID() { return producerID; }
    public long getTotalInvestment() { return totalInvestment; }
    public boolean isOwnsStudio() { return ownsStudio; }
    public char getFundingGrade() { return fundingGrade; }
    public double getAverageProfitMargin() { return averageProfitMargin; }
    public float getRiskTolerance() { return riskTolerance; }
    public String getProducerName() { return producerName; }
    public String getProductionCompany() { return productionCompany; }
    public Integer getMoviesProduced() { return moviesProduced; }
    public Long getCompanyWorth() { return companyWorth; }
    public Double getAvgReviewScore() { return avgReviewScore; }
    public Float getDistributionFee() { return distributionFee; }
    public Boolean getIsIndependent() { return isIndependent; }

    @Override
    public int hashCode() {
        return Objects.hash(producerID, totalInvestment, ownsStudio, fundingGrade, averageProfitMargin, riskTolerance,
                producerName, productionCompany, moviesProduced, companyWorth, avgReviewScore, distributionFee, isIndependent);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof ProducerDto)) return false;
        ProducerDto other = (ProducerDto) obj;
        return producerID == other.producerID && totalInvestment == other.totalInvestment && ownsStudio == other.ownsStudio &&
                fundingGrade == other.fundingGrade && Double.compare(other.averageProfitMargin, averageProfitMargin) == 0 &&
                Float.compare(other.riskTolerance, riskTolerance) == 0 && Objects.equals(producerName, other.producerName) &&
                Objects.equals(productionCompany, other.productionCompany) && Objects.equals(moviesProduced, other.moviesProduced) &&
                Objects.equals(companyWorth, other.companyWorth) && Objects.equals(avgReviewScore, other.avgReviewScore) &&
                Objects.equals(distributionFee, other.distributionFee) && Objects.equals(isIndependent, other.isIndependent);
    }

    @Override
    public String toString() {
        return "ProducerDto { producerID=" + producerID + ", totalInvestment=" + totalInvestment + ", ownsStudio=" + ownsStudio + ", fundingGrade=" + fundingGrade + ", averageProfitMargin=" + averageProfitMargin + ", riskTolerance=" + riskTolerance + ", producerName='" + producerName + "', productionCompany='" + productionCompany + "', moviesProduced=" + moviesProduced + ", companyWorth=" + companyWorth + ", avgReviewScore=" + avgReviewScore + ", distributionFee=" + distributionFee + ", isIndependent=" + isIndependent + "}";
    }
}
