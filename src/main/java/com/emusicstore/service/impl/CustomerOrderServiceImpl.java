package com.emusicstore.service.impl;

import com.emusicstore.dao.CustomerOrderDao;
import com.emusicstore.model.Cart;
import com.emusicstore.model.CartItem;
import com.emusicstore.model.CustomerOrder;
import com.emusicstore.service.CartService;
import com.emusicstore.service.CustomerOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by sameer on 1/4/2017.
 */
@Service
public class CustomerOrderServiceImpl implements CustomerOrderService {

    @Autowired
    private CustomerOrderDao customerOrderDao;

    @Autowired
    private CartService cartService;

    @Override
    public void addCustomerOrder(CustomerOrder customerOrder) {

        customerOrderDao.addCustomerOrder(customerOrder);
    }

    @Override
    public double getCustomerOrderGrandTotal(int cartId) {
        //since we dont to access database to calculate grandtotal
        //so we dont have to use customerOrderDao for it.
        Cart cart=cartService.getCartById(cartId);
        List<CartItem> cartItems=cart.getCartItemList();

        double grandTotal=0;
        for(CartItem item:cartItems){
            grandTotal+=item.getTotalPrice();
        }


        return grandTotal;
    }
}
