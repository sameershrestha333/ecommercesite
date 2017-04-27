package com.emusicstore.dao.Impl;

import com.emusicstore.dao.CartDao;
import com.emusicstore.model.Cart;
import com.emusicstore.service.CustomerOrderService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

/**
 * Created by sameer on 1/3/2017.
 */
@Repository
@Transactional
public class CartDaoImpl implements CartDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Autowired
    private CustomerOrderService customerOrderService;

    @Override
    public Cart getCartById(int cartId) {

        Session session=sessionFactory.getCurrentSession();
        Cart cart=(Cart) session.get(Cart.class,cartId);

        return  cart;

    }


    @Override
    public void updateCart(Cart cart) {
        //Session session=sessionFactory.getCurrentSession();
       // session.saveOrUpdate(cart);
        int cartId= cart.getCartId();

        double grandTotal=customerOrderService.getCustomerOrderGrandTotal(cartId);
        cart.setGrandTotal(grandTotal);
        Session session=sessionFactory.getCurrentSession();
         session.saveOrUpdate(cart);
    }

    @Override
    public Cart validate(int cartId) throws IOException {
        Cart cart=getCartById(cartId);
        if(cart==null|| cart.getCartItemList().size()==0){
            throw new IOException(cartId+"");
        }
        updateCart(cart);

        return cart ;
    }
}
