package com.emusicstore.service;

import com.emusicstore.model.Product;

import java.util.List;

/**
 * Created by sameer on 1/3/2017.
 */

public interface ProductService {

    List<Product> getProductList();

    Product getProductById(int id);

    void addProduct(Product product);

    void updateProduct(Product product);

    void deleteProduct(Product product);
}
