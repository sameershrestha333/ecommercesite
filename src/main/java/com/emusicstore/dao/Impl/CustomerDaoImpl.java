package com.emusicstore.dao.Impl;

import com.emusicstore.dao.CustomerDao;
import com.emusicstore.model.Authorities;
import com.emusicstore.model.Cart;
import com.emusicstore.model.Customer;
import com.emusicstore.model.Users;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by sameer on 1/3/2017.
 */

@Repository
@Transactional
public class CustomerDaoImpl implements CustomerDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addCustomer(Customer customer) {
        Session session=sessionFactory.getCurrentSession();


        //since customer table has two foreign keys(billingId and shoppingId) so we dont only set the values of own fields
        //we should set billing and shoppingId

        customer.getBillingAddress().setCustomer(customer);
        customer.getShippingAddress().setCustomer(customer);


        session.saveOrUpdate(customer);

        session.saveOrUpdate(customer.getBillingAddress());
        session.saveOrUpdate(customer.getShippingAddress());


        //user is also created

        Users newUser=new Users();
        newUser.setUsername(customer.getUsername());
        newUser.setPassword(customer.getPassword());
        newUser.setEnabled(true);
        newUser.setCustomerId(customer.getCustomerId());

        //Authorities is also created.
        Authorities newAuthority=new Authorities();
        newAuthority.setUsername(customer.getUsername());
        newAuthority.setAuthority("ROLE_USER");

        session.saveOrUpdate(newUser);
        session.saveOrUpdate(newAuthority);

        Cart newCart=new Cart();

        //since relationship is bidirectional
        newCart.setCustomer(customer);
        customer.setCart(newCart);

        session.saveOrUpdate(customer);
        session.saveOrUpdate(newCart);

        session.flush();
    }

    @Override
    public Customer getCustomerById(int customerId) {
        Session session=sessionFactory.getCurrentSession();

        Customer customer=(Customer) session.get(Customer.class,customerId);
        session.flush();

        return customer;
    }

    @Override
    public List<Customer> getAllCustomer() {
        Session session=sessionFactory.getCurrentSession();

        Query query=session.createQuery("FROM Customer");
        List<Customer> customerList=query.list();
        session.flush();

        return customerList;
    }

    @Override
    public Customer getCustomerByUsername(String username) {

        Session session=sessionFactory.getCurrentSession();

        Query query=session.createQuery("From Customer where username=? ");
        query.setString(0,username);
        //since username is string so we are using setString if
        //Username was int,we had to use setInteger
        Customer customer=(Customer) query.uniqueResult();

        session.flush();

        return customer;
    }
}
