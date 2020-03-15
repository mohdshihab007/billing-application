package com.billingpro.model;

public enum UserType {

    CUSTOMER(5),AFFILIATE(10),EMPLOYEE(30);

    private double discountPercent;

    UserType(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

}
