package com.billingpro.model;

public class Product {

    private String productId;
    private String productName;
    private Boolean isDiscountApplicable;
    private double unitPrice;


    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public Boolean isDiscountApplicable() {
        return isDiscountApplicable;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public Product(String productId, String productName, Boolean isDiscountApplicable, double unitPrice) {
        this.productId = productId;
        this.productName = productName;
        this.isDiscountApplicable = isDiscountApplicable;
        this.unitPrice = unitPrice;
    }
}

