package com.emusicstore.dao.Impl;

import com.emusicstore.dao.ProductDao;
import com.emusicstore.model.Product;
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
public class ProductDaoImpl implements ProductDao {


    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public List<Product> getProductList() {

        Session session=sessionFactory.getCurrentSession();
        Query query=session.createQuery("from Product");
        List<Product> productList=query.list();
        session.flush();
        return productList;

    }

    @Override
    public Product getProductById(int id) {

        Session session=sessionFactory.getCurrentSession();
        Product product=(Product) session.get(Product.class,id);
        session.flush();

        return product;
    }

    @Override
    public void addProduct(Product product) {
        Session session=sessionFactory.getCurrentSession();
        session.saveOrUpdate(product);
        session.flush();

    }

    @Override
    public void updateProduct(Product product) {
        Session session=sessionFactory.getCurrentSession();
        session.saveOrUpdate(product);
        session.flush();
    }

    @Override
    public void deleteProduct(Product product) {
        Session session=sessionFactory.getCurrentSession();
        session.delete(product);
        session.flush();
    }
}
