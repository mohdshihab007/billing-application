package com.billingpro.model;

public class Item {
    private Product product;
    private int quantity;
    private double totalCost;

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public Item(Product product, int quantity) {
        super();
        this.product = product;
        this.quantity = quantity;
        this.totalCost = product.getUnitPrice() * quantity;
    }


    public double getNetPriceAfterDiscount(double discountPercentage) {
        if(product.isDiscountApplicable().booleanValue() && discountPercentage != 0 ) {
            return (totalCost - (totalCost * discountPercentage/100));
        }
        return totalCost;
    }
}
