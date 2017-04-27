package com.emusicstore.dao.Impl;

import com.emusicstore.dao.CartDao;
import com.emusicstore.dao.CartItemDao;
import com.emusicstore.model.Cart;
import com.emusicstore.model.CartItem;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by sameer on 1/4/2017.
 */
@Repository
@Transactional
public class CartItemDaoImpl implements CartItemDao{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addCartItem(CartItem cartItem) {
        Session session=sessionFactory.getCurrentSession();
        session.saveOrUpdate(cartItem);
        session.flush();
    }

    @Override
    public void removeCartItem(CartItem cartItem) {
        Session session=sessionFactory.getCurrentSession();
        session.delete(cartItem);
        session.flush();

    }

    @Override
    public void removeAllCartItem(Cart cart) {
        Session session=sessionFactory.getCurrentSession();
        List<CartItem> cartItemList=cart.getCartItemList();

        for(CartItem item:cartItemList){
            removeCartItem(item);
        }
       session.flush();

    }

    @Override
    public CartItem getCartItemByProductId(int productId) {

        Session session=sessionFactory.getCurrentSession();

        Query query=session.createQuery("from CartItem  WHERE productId=?");
        query.setInteger(0,productId);
        CartItem cartItem=(CartItem) query.uniqueResult();
        session.flush();
        return cartItem;
    }
}
