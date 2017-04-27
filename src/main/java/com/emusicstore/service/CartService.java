package com.emusicstore.service;

import com.emusicstore.model.Cart;

/**
 * Created by sameer on 1/3/2017.
 */
public interface CartService {

    Cart getCartById(int cartId);

    void updateCart(Cart cart);
}
