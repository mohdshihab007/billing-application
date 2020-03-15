package com.billingpro.service;

import com.billingpro.model.Item;
import com.billingpro.model.User;

import java.util.List;

public class BillCalculateServiceImpl implements BillCalculateService {

    private static final int DISCOUNT_PER_HUNDRED = 5;
    @Override
    public double calculateNetPayableAmount(User user, List<Item> itemsList) {
        double totalDiscountedPrice=0;
        for(Item item:itemsList) {
            totalDiscountedPrice = totalDiscountedPrice + item.getNetPriceAfterDiscount(user.getDiscountPercentage());
        }
        return Math.round(totalDiscountedPrice-getDiscountPerHundred(totalDiscountedPrice));
    }


    private double getDiscountPerHundred(double totalDiscountedPrice) {
        return Math.floor(totalDiscountedPrice / 100) * DISCOUNT_PER_HUNDRED;
    }
}
