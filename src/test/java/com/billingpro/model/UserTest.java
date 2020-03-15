package com.billingpro.model;

import com.billingpro.builder.BillingDataBuilder;
import org.junit.Assert;
import org.junit.Test;

public class UserTest {
    @Test
    public void shouldReturnTrueForMoreThanTwoYearOldCustUsers() {
        User user = BillingDataBuilder.getCustUserWithLoyaltyDiscount();
        Assert.assertEquals(0,Double.compare(user.getDiscountPercentage(),5));
    }

    @Test
    public void shouldReturnFalseForLessThanTwoYearOldCustUsers() {
        User user = BillingDataBuilder.getCustUserWithoutLoyaltyDiscount();
        Assert.assertEquals(0,Double.compare(user.getDiscountPercentage(),0));
    }

    @Test
    public void shouldReturnTrueForEmployeeUser() {
        User user = BillingDataBuilder.getEmployeeUser();
        Assert.assertEquals(0,Double.compare(user.getDiscountPercentage(),30));
    }

    @Test
    public void shouldReturnTrueForAffilateUser() {
        User user = BillingDataBuilder.getAffiliatedUser();
        Assert.assertEquals(0,Double.compare(user.getDiscountPercentage(),10));
    }


}
