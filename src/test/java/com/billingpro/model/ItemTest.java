package com.billingpro.model;
import com.billingpro.builder.BillingDataBuilder;
import org.junit.Assert;
import org.junit.Test;

public class ItemTest {

    @Test
    public void shouldGetNoDiscountForNonDiscountableProduct() {
        Product product = BillingDataBuilder.getProductWithNoDiscount();
        Item item = new Item(product, 4);
        Assert.assertEquals(142, item.getNetPriceAfterDiscount(5), 0);
    }

    @Test
    public void shouldGetDiscountedPriceForDiscountableProduct() {
        Product product = BillingDataBuilder.getProductWithDiscount();
        Item item = new Item(product, 4);
        Assert.assertEquals(209, item.getNetPriceAfterDiscount(5),0);
    }

    @Test
    public void shouldGetNoDiscountForZeroDiscountPercent() {
        Product product = BillingDataBuilder.getProductWithDiscount();
        Item item = new Item(product, 4);
        Assert.assertEquals(220, item.getNetPriceAfterDiscount(0),0);

    }
}
