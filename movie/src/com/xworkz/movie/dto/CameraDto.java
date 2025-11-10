package com.xworkz.movie.dto;

import java.util.Objects;

public class CameraDto {

    private int cameraID;
    private long shutterCount;
    private boolean isDigital;
    private char format;
    private double rentalPricePerDay;
    private float sensorSize;

    private String brand;
    private String model;
    private Integer maxFPS;
    private Long assetTag;
    private Double resolutionMP;
    private Float weightKg;
    private Boolean isAvailable;

    public void setCameraID(int cameraID) { this.cameraID = cameraID; }
    public void setShutterCount(long shutterCount) { this.shutterCount = shutterCount; }
    public void setIsDigital(boolean isDigital) { this.isDigital = isDigital; }
    public void setFormat(char format) { this.format = format; }
    public void setRentalPricePerDay(double rentalPricePerDay) { this.rentalPricePerDay = rentalPricePerDay; }
    public void setSensorSize(float sensorSize) { this.sensorSize = sensorSize; }
    public void setBrand(String brand) { this.brand = brand; }
    public void setModel(String model) { this.model = model; }
    public void setMaxFPS(Integer maxFPS) { this.maxFPS = maxFPS; }
    public void setAssetTag(Long assetTag) { this.assetTag = assetTag; }
    public void setResolutionMP(Double resolutionMP) { this.resolutionMP = resolutionMP; }
    public void setWeightKg(Float weightKg) { this.weightKg = weightKg; }
    public void setIsAvailable(Boolean isAvailable) { this.isAvailable = isAvailable; }

    public int getCameraID() { return cameraID; }
    public long getShutterCount() { return shutterCount; }
    public boolean isIsDigital() { return isDigital; }
    public char getFormat() { return format; }
    public double getRentalPricePerDay() { return rentalPricePerDay; }
    public float getSensorSize() { return sensorSize; }
    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public Integer getMaxFPS() { return maxFPS; }
    public Long getAssetTag() { return assetTag; }
    public Double getResolutionMP() { return resolutionMP; }
    public Float getWeightKg() { return weightKg; }
    public Boolean getIsAvailable() { return isAvailable; }

    @Override
    public int hashCode() {
        return Objects.hash(cameraID, shutterCount, isDigital, format, rentalPricePerDay, sensorSize,
                brand, model, maxFPS, assetTag, resolutionMP, weightKg, isAvailable);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof CameraDto)) return false;
        CameraDto other = (CameraDto) obj;
        return cameraID == other.cameraID && shutterCount == other.shutterCount && isDigital == other.isDigital &&
                format == other.format && Double.compare(other.rentalPricePerDay, rentalPricePerDay) == 0 &&
                Float.compare(other.sensorSize, sensorSize) == 0 && Objects.equals(brand, other.brand) &&
                Objects.equals(model, other.model) && Objects.equals(maxFPS, other.maxFPS) &&
                Objects.equals(assetTag, other.assetTag) && Objects.equals(resolutionMP, other.resolutionMP) &&
                Objects.equals(weightKg, other.weightKg) && Objects.equals(isAvailable, other.isAvailable);
    }

    @Override
    public String toString() {
        return "CameraDto { cameraID=" + cameraID + ", shutterCount=" + shutterCount + ", isDigital=" + isDigital + ", format=" + format + ", rentalPricePerDay=" + rentalPricePerDay + ", sensorSize=" + sensorSize + ", brand='" + brand + "', model='" + model + "', maxFPS=" + maxFPS + ", assetTag=" + assetTag + ", resolutionMP=" + resolutionMP + ", weightKg=" + weightKg + ", isAvailable=" + isAvailable + "}";
    }
}
