package com.xworkz.encapsulation.dto;


import java.util.Objects;

public class ArtifactDto {
    private String artifactName;
    private int ageInYears;
    private double estimatedValue;
    private boolean isAuthentic;

    public ArtifactDto(String artifactName, int ageInYears, double estimatedValue, boolean isAuthentic) {
        this.artifactName = artifactName;
        this.ageInYears = ageInYears;
        this.estimatedValue = estimatedValue;
        this.isAuthentic = isAuthentic;
    }

    public String getArtifactName() {
        return artifactName;
    }

    public void setArtifactName(String artifactName) {
        this.artifactName = artifactName;
    }

    public int getAgeInYears() {
        return ageInYears;
    }

    public void setAgeInYears(int ageInYears) {
        this.ageInYears = ageInYears;
    }

    public double getEstimatedValue() {
        return estimatedValue;
    }

    public void setEstimatedValue(double estimatedValue) {
        this.estimatedValue = estimatedValue;
    }

    public boolean isAuthentic() {
        return isAuthentic;
    }

    public void setAuthentic(boolean authentic) {
        isAuthentic = authentic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ArtifactDto)) return false;
        ArtifactDto that = (ArtifactDto) o;
        return ageInYears == that.ageInYears &&
                Double.compare(that.estimatedValue, estimatedValue) == 0 &&
                isAuthentic == that.isAuthentic &&
                Objects.equals(artifactName, that.artifactName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(artifactName, ageInYears, estimatedValue, isAuthentic);
    }

    @Override
    public String toString() {
        return "ArtifactDto{" +
                "name='" + artifactName + '\'' +
                ", age=" + ageInYears + " years" +
                ", value=$" + estimatedValue +
                ", authentic=" + isAuthentic +
                '}';
    }
}
