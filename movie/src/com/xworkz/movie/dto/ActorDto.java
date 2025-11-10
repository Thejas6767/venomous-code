package com.xworkz.movie.dto;

import java.util.Objects;

public class ActorDto {

    private int actorID;
    private long salary;
    private boolean oscarWinner;
    private char popularityGrade;
    private double netWorth;
    private float heightFeet;

    private String actorName;
    private String bornCity;
    private Integer debutYear;
    private Long followersCount;
    private Double avgMovieRating;
    private Float age;
    private Boolean isActive;

    public void setActorID(int actorID) { this.actorID = actorID; }
    public void setSalary(long salary) { this.salary = salary; }
    public void setOscarWinner(boolean oscarWinner) { this.oscarWinner = oscarWinner; }
    public void setPopularityGrade(char popularityGrade) { this.popularityGrade = popularityGrade; }
    public void setNetWorth(double netWorth) { this.netWorth = netWorth; }
    public void setHeightFeet(float heightFeet) { this.heightFeet = heightFeet; }
    public void setActorName(String actorName) { this.actorName = actorName; }
    public void setBornCity(String bornCity) { this.bornCity = bornCity; }
    public void setDebutYear(Integer debutYear) { this.debutYear = debutYear; }
    public void setFollowersCount(Long followersCount) { this.followersCount = followersCount; }
    public void setAvgMovieRating(Double avgMovieRating) { this.avgMovieRating = avgMovieRating; }
    public void setAge(Float age) { this.age = age; }
    public void setIsActive(Boolean isActive) { this.isActive = isActive; }

    public int getActorID() { return actorID; }
    public long getSalary() { return salary; }
    public boolean isOscarWinner() { return oscarWinner; }
    public char getPopularityGrade() { return popularityGrade; }
    public double getNetWorth() { return netWorth; }
    public float getHeightFeet() { return heightFeet; }
    public String getActorName() { return actorName; }
    public String getBornCity() { return bornCity; }
    public Integer getDebutYear() { return debutYear; }
    public Long getFollowersCount() { return followersCount; }
    public Double getAvgMovieRating() { return avgMovieRating; }
    public Float getAge() { return age; }
    public Boolean getIsActive() { return isActive; }

    @Override
    public int hashCode() {
        return Objects.hash(actorID, salary, oscarWinner, popularityGrade, netWorth, heightFeet,
                actorName, bornCity, debutYear, followersCount, avgMovieRating, age, isActive);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof ActorDto)) return false;
        ActorDto other = (ActorDto) obj;
        return actorID == other.actorID && salary == other.salary && oscarWinner == other.oscarWinner &&
                popularityGrade == other.popularityGrade && Double.compare(other.netWorth, netWorth) == 0 &&
                Float.compare(other.heightFeet, heightFeet) == 0 && Objects.equals(actorName, other.actorName) &&
                Objects.equals(bornCity, other.bornCity) && Objects.equals(debutYear, other.debutYear) &&
                Objects.equals(followersCount, other.followersCount) && Objects.equals(avgMovieRating, other.avgMovieRating) &&
                Objects.equals(age, other.age) && Objects.equals(isActive, other.isActive);
    }

    @Override
    public String toString() {
        return "ActorDto { actorID=" + actorID + ", salary=" + salary + ", oscarWinner=" + oscarWinner + ", popularityGrade=" + popularityGrade + ", netWorth=" + netWorth + ", heightFeet=" + heightFeet + ", actorName='" + actorName + "', bornCity='" + bornCity + "', debutYear=" + debutYear + ", followersCount=" + followersCount + ", avgMovieRating=" + avgMovieRating + ", age=" + age + ", isActive=" + isActive + "}";
    }
}