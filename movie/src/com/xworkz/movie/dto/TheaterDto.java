package com.xworkz.movie.dto;

import java.util.Objects;

public class TheaterDto {

    private int theaterID;
    private long capacity;
    private boolean hasRecliners;
    private char soundSystem;
    private double dailyRevenue;
    private float ticketPrice;

    private String theaterName;
    private String locationCity;
    private Integer numberOfScreens;
    private Long registrationNumber;
    private Double projectionQuality;
    private Float popcornPrice;
    private Boolean parkingAvailable;

    public void setTheaterID(int theaterID) { this.theaterID = theaterID; }
    public void setCapacity(long capacity) { this.capacity = capacity; }
    public void setHasRecliners(boolean hasRecliners) { this.hasRecliners = hasRecliners; }
    public void setSoundSystem(char soundSystem) { this.soundSystem = soundSystem; }
    public void setDailyRevenue(double dailyRevenue) { this.dailyRevenue = dailyRevenue; }
    public void setTicketPrice(float ticketPrice) { this.ticketPrice = ticketPrice; }
    public void setTheaterName(String theaterName) { this.theaterName = theaterName; }
    public void setLocationCity(String locationCity) { this.locationCity = locationCity; }
    public void setNumberOfScreens(Integer numberOfScreens) { this.numberOfScreens = numberOfScreens; }
    public void setRegistrationNumber(Long registrationNumber) { this.registrationNumber = registrationNumber; }
    public void setProjectionQuality(Double projectionQuality) { this.projectionQuality = projectionQuality; }
    public void setPopcornPrice(Float popcornPrice) { this.popcornPrice = popcornPrice; }
    public void setParkingAvailable(Boolean parkingAvailable) { this.parkingAvailable = parkingAvailable; }

    public int getTheaterID() { return theaterID; }
    public long getCapacity() { return capacity; }
    public boolean isHasRecliners() { return hasRecliners; }
    public char getSoundSystem() { return soundSystem; }
    public double getDailyRevenue() { return dailyRevenue; }
    public float getTicketPrice() { return ticketPrice; }
    public String getTheaterName() { return theaterName; }
    public String getLocationCity() { return locationCity; }
    public Integer getNumberOfScreens() { return numberOfScreens; }
    public Long getRegistrationNumber() { return registrationNumber; }
    public Double getProjectionQuality() { return projectionQuality; }
    public Float getPopcornPrice() { return popcornPrice; }
    public Boolean getParkingAvailable() { return parkingAvailable; }

    @Override
    public int hashCode() {
        return Objects.hash(theaterID, capacity, hasRecliners, soundSystem, dailyRevenue, ticketPrice,
                theaterName, locationCity, numberOfScreens, registrationNumber, projectionQuality, popcornPrice, parkingAvailable);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof TheaterDto)) return false;
        TheaterDto other = (TheaterDto) obj;
        return theaterID == other.theaterID && capacity == other.capacity && hasRecliners == other.hasRecliners &&
                soundSystem == other.soundSystem && Double.compare(other.dailyRevenue, dailyRevenue) == 0 &&
                Float.compare(other.ticketPrice, ticketPrice) == 0 && Objects.equals(theaterName, other.theaterName) &&
                Objects.equals(locationCity, other.locationCity) && Objects.equals(numberOfScreens, other.numberOfScreens) &&
                Objects.equals(registrationNumber, other.registrationNumber) && Objects.equals(projectionQuality, other.projectionQuality) &&
                Objects.equals(popcornPrice, other.popcornPrice) && Objects.equals(parkingAvailable, other.parkingAvailable);
    }

    @Override
    public String toString() {
        return "TheaterDto { theaterID=" + theaterID + ", capacity=" + capacity + ", hasRecliners=" + hasRecliners + ", soundSystem=" + soundSystem + ", dailyRevenue=" + dailyRevenue + ", ticketPrice=" + ticketPrice + ", theaterName='" + theaterName + "', locationCity='" + locationCity + "', numberOfScreens=" + numberOfScreens + ", registrationNumber=" + registrationNumber + ", projectionQuality=" + projectionQuality + ", popcornPrice=" + popcornPrice + ", parkingAvailable=" + parkingAvailable + "}";
    }
}