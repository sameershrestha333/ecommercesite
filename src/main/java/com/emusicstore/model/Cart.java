package com.emusicstore.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

/**
 * Created by sameer on 1/2/2017.
 */
@Entity
public class Cart implements Serializable {


    private static final long serialVersionUID = 7947563876152764620L;
    @Id
    @GeneratedValue
    private int cartId;

    @OneToMany(mappedBy = "cart",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<CartItem> cartItemList;

    @OneToOne
    @JoinColumn(name = "customerId")
    @JsonIgnore
    private Customer customer;

    private double grandTotal;

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public List<CartItem> getCartItemList() {
        return cartItemList;
    }

    public void setCartItemList(List<CartItem> cartItemList) {
        this.cartItemList = cartItemList;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(double grandTotal) {
        this.grandTotal = grandTotal;
    }

    //    private String cartId;
//    @OneToMany
//    private Map<String, CartItem> cartItems;
//    private double grandTotal;
//
//    //default constructor that generates new hashmap and set grandtotal to zero
//    public Cart() {
//        cartItems = new HashMap<String, CartItem>();
//        grandTotal = 0;
//    }
//
//    public Cart(String cartId) {
//        this();
//        this.cartId = cartId;
//    }
//
//    public String getCartId() {
//        return cartId;
//    }
//
//    public void setCartId(String cartId) {
//        this.cartId = cartId;
//    }
//
//    public Map<String, CartItem> getCartItems() {
//        return cartItems;
//    }
//
//    public void setCartItems(Map<String, CartItem> cartItems) {
//        this.cartItems = cartItems;
//    }
//
//    public double getGrandTotal() {
//        return grandTotal;
//    }
//
//    public void setGrandTotal(double grandTotal) {
//        this.grandTotal = grandTotal;
//    }
//
//    // adding cartitem functionality
//
//    public void addCartItem(CartItem item) {
//        String productId = item.getProduct().getProductId();
//
//        if (cartItems.containsKey(productId)) {
//            CartItem existingCartItem = cartItems.get(productId);
//
//            existingCartItem.setQuantity(existingCartItem.getQuantity() + item.getQuantity());
//            cartItems.put(productId, existingCartItem);
//
//
//        } else {
//            cartItems.put(productId, item);
//        }
//        updateGrandTotal();
//
//    }
//    // removing cartitem functionality
//    public void removeCartItem(CartItem item){
//        String productId=item.getProduct().getProductId();
//        cartItems.remove(productId);
//        updateGrandTotal();
//    }
//
//    //updateGrangTotal
//    public void updateGrandTotal(){
//        grandTotal=0;
//
//        for (CartItem item:cartItems.values()){
//            grandTotal+=item.getTotalPrice();
//
//        }
//    }

}
