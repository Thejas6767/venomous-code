package com.xworkz.encapsulation.dto;


import java.util.Objects;

public class SatelliteDto {
    private String name;
    private int launchYear;
    private double orbitalDistance;
    private boolean isOperational;

    public SatelliteDto(String name, int launchYear, double orbitalDistance, boolean isOperational) {
        this.name = name;
        this.launchYear = launchYear;
        this.orbitalDistance = orbitalDistance;
        this.isOperational = isOperational;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLaunchYear() {
        return launchYear;
    }

    public void setLaunchYear(int launchYear) {
        this.launchYear = launchYear;
    }

    public double getOrbitalDistance() {
        return orbitalDistance;
    }

    public void setOrbitalDistance(double orbitalDistance) {
        this.orbitalDistance = orbitalDistance;
    }

    public boolean isOperational() {
        return isOperational;
    }

    public void setOperational(boolean operational) {
        isOperational = operational;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SatelliteDto)) return false;
        SatelliteDto that = (SatelliteDto) o;
        return launchYear == that.launchYear &&
                Double.compare(that.orbitalDistance, orbitalDistance) == 0 &&
                isOperational == that.isOperational &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, launchYear, orbitalDistance, isOperational);
    }

    @Override
    public String toString() {
        return "SatelliteDto{" +
                "name='" + name + '\'' +
                ", launchYear=" + launchYear +
                ", orbitalDistance=" + orbitalDistance + "km" +
                ", isOperational=" + isOperational +
                '}';
    }
}
