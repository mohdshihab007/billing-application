package com.billingpro.service;

import com.billingpro.model.Item;
import com.billingpro.model.User;

import java.util.List;

public interface BillCalculateService {
     double calculateNetPayableAmount(User user, List<Item> itemsList);
}
