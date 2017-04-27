package com.emusicstore.service;

import com.emusicstore.model.CustomerOrder;

/**
 * Created by sameer on 1/4/2017.
 */
public interface CustomerOrderService {

    void addCustomerOrder(CustomerOrder customerOrder);

    double getCustomerOrderGrandTotal(int cartId);
}
