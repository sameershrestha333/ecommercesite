package com.emusicstore.dao;

import com.emusicstore.model.Cart;

import java.io.IOException;

/**
 * Created by sameer on 1/2/2017.
 */

public interface CartDao {
    Cart getCartById(int cartId);

    void updateCart(Cart cart);


    Cart validate(int cartId) throws IOException;
}
