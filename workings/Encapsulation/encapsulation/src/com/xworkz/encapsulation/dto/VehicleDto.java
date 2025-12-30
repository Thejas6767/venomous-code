package com.xworkz.encapsulation.dto;


import java.util.Objects;

public class VehicleDto {
    private String brand;
    private String modelName;
    private int year;
    private double price;

    public VehicleDto(String brand, String modelName, int year, double price) {
        this.brand = brand;
        this.modelName = modelName;
        this.year = year;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VehicleDto)) return false;
        VehicleDto that = (VehicleDto) o;
        return year == that.year &&
                Double.compare(that.price, price) == 0 &&
                Objects.equals(brand, that.brand) &&
                Objects.equals(modelName, that.modelName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, modelName, year, price);
    }

    @Override
    public String toString() {
        return "VehicleDto{" +
                "brand='" + brand + '\'' +
                ", model='" + modelName + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
