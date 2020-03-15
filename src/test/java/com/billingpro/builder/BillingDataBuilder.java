package com.billingpro.builder;


import com.billingpro.model.Item;
import com.billingpro.model.Product;
import com.billingpro.model.User;
import com.billingpro.model.UserType;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class BillingDataBuilder {
    private static final int CUSTOMER_LOYALTY_THRESHOLD_IN_YRS = 2;


    public static Product getProductWithDiscount() {
        return new Product("STATION123456", "Pencils", Boolean.TRUE, 55);
    }


    public static Product getProductWithNoDiscount() {
        return new Product("GROC7896","Tomato",Boolean.FALSE,35.5);

    }

    public static Item getItemWithDiscountableProduct(int quantity) {
        return new Item(getProductWithDiscount(),quantity);
    }

    public static Item getItemWithNonDiscountableProduct(int quantity) {
        return new Item(getProductWithNoDiscount(), quantity);
    }

    public static User getAffiliatedUser() {
        User user = new User("Cust001","Affiliate User", UserType.AFFILIATE,LocalDateTime.now().minusYears(1));
        return user;
    }

    public static User getEmployeeUser() {
        User user = new User("Cust002","Employee User", UserType.EMPLOYEE,LocalDateTime.now().minusYears(1));
        return user;
    }

    public static User getCustUserWithLoyaltyDiscount() {
        User user = new User("Cust003","Loyalty Customer", UserType.CUSTOMER,
                LocalDateTime.now().minusYears(CUSTOMER_LOYALTY_THRESHOLD_IN_YRS+1));
        return user;
    }

    public static User getCustUserWithoutLoyaltyDiscount() {
        User user = new User("Cust004","Non-Loyalty Customer", UserType.CUSTOMER,
                LocalDateTime.now().minusYears(CUSTOMER_LOYALTY_THRESHOLD_IN_YRS-1));
        return user;
    }

    public static List<Item> getItemListWithMultipleProducts() {
        List<Item> items = new ArrayList<Item>();
        items.add(getItemWithDiscountableProduct(5));
        items.add(getItemWithNonDiscountableProduct(7));
        return items;
    }

}
