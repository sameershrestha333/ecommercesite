package com.emusicstore.dao.Impl;

import com.emusicstore.dao.CustomerOrderDao;
import com.emusicstore.model.CustomerOrder;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by sameer on 1/4/2017.
 */
@Repository
@Transactional
public class CustomerOrderDaoImpl implements CustomerOrderDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addCustomerOrder(CustomerOrder customerOrder) {

        Session session=sessionFactory.getCurrentSession();
        session.saveOrUpdate(customerOrder);

        session.flush();
    }

    @Override
    public double getCustomerOrderGrandTotal(int cartId) {

        Session session=sessionFactory.getCurrentSession();

        session.flush();
        return 0;
    }
}
