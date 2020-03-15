package com.billingpro.service;

import com.billingpro.builder.BillingDataBuilder;
import com.billingpro.model.Item;
import com.billingpro.model.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class BillCalculateServiceImplTest {

    private BillCalculateService  billCalculateService;
    private List<Item> itemsWithMultipleProds;


    @Before
    public void setUp() {
        billCalculateService = new BillCalculateServiceImpl();
        itemsWithMultipleProds = BillingDataBuilder.getItemListWithMultipleProducts();
    }

    @Test
    public void shouldCalculateBillForCustomerWithLoyaltyDiscount() {
        User user = BillingDataBuilder.getCustUserWithLoyaltyDiscount();
        Assert.assertEquals(485, billCalculateService.calculateNetPayableAmount(user, itemsWithMultipleProds), 0.1);
    }

    @Test
    public void shouldCalculateBillForCustomerWithoutLoyaltyDiscount() {
        User user = BillingDataBuilder.getCustUserWithoutLoyaltyDiscount();
        Assert.assertEquals(499, billCalculateService.calculateNetPayableAmount(user, itemsWithMultipleProds), 0.1);
    }

    @Test
    public void shouldCalculateBillforAffiliateUser() {
        User user = BillingDataBuilder.getAffiliatedUser();
        Assert.assertEquals(476, billCalculateService.calculateNetPayableAmount(user, itemsWithMultipleProds), 0.1);
    }

    @Test
    public void shouldCalculateBillForEmployeeUser() {
        User user = BillingDataBuilder.getEmployeeUser();
        Assert.assertEquals(421, billCalculateService.calculateNetPayableAmount(user, itemsWithMultipleProds), 0.1);
    }
}
