package com.emusicstore.dao;

import com.emusicstore.model.CustomerOrder;

/**
 * Created by sameer on 1/4/2017.
 */
public interface CustomerOrderDao {

    void addCustomerOrder(CustomerOrder customerOrder);

    double getCustomerOrderGrandTotal(int cartId);
}
