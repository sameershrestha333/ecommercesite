package com.emusicstore.dao;



import com.emusicstore.model.Product;

import java.util.List;

/**
 * Created by sameer on 12/31/2016.
 */
public interface ProductDao {

    List<Product> getProductList();

    Product getProductById(int id);

    void addProduct(Product product);

    void updateProduct(Product product);

    void deleteProduct(Product product);
}
