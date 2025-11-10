package com.xworkz.movie.dto;

import java.util.Objects;

public class AwardDto {

    private int awardID;
    private long cashPrize;
    private boolean isInternational;
    private char categoryRank;
    private double trophyWeightKg;
    private float mediaCoverageIndex;

    private String awardName;
    private String recipientName;
    private Integer yearAwarded;
    private Long totalViewsCeremony;
    private Double judgingScore;
    private Float nomineeChance;
    private Boolean acceptedInPerson;

    public void setAwardID(int awardID) { this.awardID = awardID; }
    public void setCashPrize(long cashPrize) { this.cashPrize = cashPrize; }
    public void setIsInternational(boolean isInternational) { this.isInternational = isInternational; }
    public void setCategoryRank(char categoryRank) { this.categoryRank = categoryRank; }
    public void setTrophyWeightKg(double trophyWeightKg) { this.trophyWeightKg = trophyWeightKg; }
    public void setMediaCoverageIndex(float mediaCoverageIndex) { this.mediaCoverageIndex = mediaCoverageIndex; }
    public void setAwardName(String awardName) { this.awardName = awardName; }
    public void setRecipientName(String recipientName) { this.recipientName = recipientName; }
    public void setYearAwarded(Integer yearAwarded) { this.yearAwarded = yearAwarded; }
    public void setTotalViewsCeremony(Long totalViewsCeremony) { this.totalViewsCeremony = totalViewsCeremony; }
    public void setJudgingScore(Double judgingScore) { this.judgingScore = judgingScore; }
    public void setNomineeChance(Float nomineeChance) { this.nomineeChance = nomineeChance; }
    public void setAcceptedInPerson(Boolean acceptedInPerson) { this.acceptedInPerson = acceptedInPerson; }

    public int getAwardID() { return awardID; }
    public long getCashPrize() { return cashPrize; }
    public boolean isIsInternational() { return isInternational; }
    public char getCategoryRank() { return categoryRank; }
    public double getTrophyWeightKg() { return trophyWeightKg; }
    public float getMediaCoverageIndex() { return mediaCoverageIndex; }
    public String getAwardName() { return awardName; }
    public String getRecipientName() { return recipientName; }
    public Integer getYearAwarded() { return yearAwarded; }
    public Long getTotalViewsCeremony() { return totalViewsCeremony; }
    public Double getJudgingScore() { return judgingScore; }
    public Float getNomineeChance() { return nomineeChance; }
    public Boolean getAcceptedInPerson() { return acceptedInPerson; }

    @Override
    public int hashCode() {
        return Objects.hash(awardID, cashPrize, isInternational, categoryRank, trophyWeightKg, mediaCoverageIndex,
                awardName, recipientName, yearAwarded, totalViewsCeremony, judgingScore, nomineeChance, acceptedInPerson);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof AwardDto)) return false;
        AwardDto other = (AwardDto) obj;
        return awardID == other.awardID && cashPrize == other.cashPrize && isInternational == other.isInternational &&
                categoryRank == other.categoryRank && Double.compare(other.trophyWeightKg, trophyWeightKg) == 0 &&
                Float.compare(other.mediaCoverageIndex, mediaCoverageIndex) == 0 && Objects.equals(awardName, other.awardName) &&
                Objects.equals(recipientName, other.recipientName) && Objects.equals(yearAwarded, other.yearAwarded) &&
                Objects.equals(totalViewsCeremony, other.totalViewsCeremony) && Objects.equals(judgingScore, other.judgingScore) &&
                Objects.equals(nomineeChance, other.nomineeChance) && Objects.equals(acceptedInPerson, other.acceptedInPerson);
    }

    @Override
    public String toString() {
        return "AwardDto { awardID=" + awardID + ", cashPrize=" + cashPrize + ", isInternational=" + isInternational + ", categoryRank=" + categoryRank + ", trophyWeightKg=" + trophyWeightKg + ", mediaCoverageIndex=" + mediaCoverageIndex + ", awardName='" + awardName + "', recipientName='" + recipientName + "', yearAwarded=" + yearAwarded + ", totalViewsCeremony=" + totalViewsCeremony + ", judgingScore=" + judgingScore + ", nomineeChance=" + nomineeChance + ", acceptedInPerson=" + acceptedInPerson + "}";
    }
}
