package com.emusicstore.service;

import com.emusicstore.model.Cart;
import com.emusicstore.model.CartItem;

/**
 * Created by sameer on 1/4/2017.
 */
public interface CartItemService {


    void addCartItem(CartItem cartItem);

    void removeCartItem(CartItem cartItem);

    void removeAllCartItem(Cart cart);

    CartItem getCartItemByProductId(int productId);

}
