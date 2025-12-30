package com.xworkz.encapsulation.dto;


import java.util.Objects;

public class ProductDto {
    private int productId;
    private String productName;
    private double price;
    private boolean isAvailable;

    public ProductDto(int productId, String productName, double price, boolean isAvailable) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductDto)) return false;
        ProductDto that = (ProductDto) o;
        return productId == that.productId &&
                Double.compare(that.price, price) == 0 &&
                isAvailable == that.isAvailable &&
                Objects.equals(productName, that.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, productName, price, isAvailable);
    }

    @Override
    public String toString() {
        return "ProductDto{" +
                "id=" + productId +
                ", name='" + productName + '\'' +
                ", price=" + price +
                ", stock=" + isAvailable +
                '}';
    }
}
