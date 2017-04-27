package com.emusicstore.dao;//package com.emusicstore.dao;
//
//import com.emusicstore.model.Product;
//
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * Created by sameer on 12/31/2016.
// */
//public class ProductDao {
//
//    private List<Product> productList;
//
//    public List<Product> getProductList(){
//        Product product1=new Product();
//
//        product1.setProductId("p101");
//        product1.setProductName("Guitar");
//        product1.setProductCategory("Instrument");
//        product1.setProductDescription("This is the base guitar");
//        product1.setProductPrice(1200);
//        product1.setProductCondition("New");
//        product1.setProductStatus("Active");
//        product1.setUnitInStock(11);
//        product1.setProductManufacturer("Fender");
//
//        Product product2=new Product();
//        product2.setProductId("p102");
//
//        product2.setProductName("Record");
//        product2.setProductCategory("Recorder");
//        product2.setProductDescription("This is the awesome mix of 20th century");
//        product2.setProductPrice(25);
//        product2.setProductCondition("New");
//        product2.setProductStatus("Active");
//        product2.setUnitInStock(51);
//        product2.setProductManufacturer("Tata");
//
//        Product product3=new Product();
//        product3.setProductId("p103");
//
//        product3.setProductName("Speaker");
//        product3.setProductCategory("Accessory");
//        product3.setProductDescription("This is a Polk Shelf Speaker");
//        product3.setProductPrice(35);
//        product3.setProductCondition("New");
//        product3.setProductStatus("Active");
//        product3.setUnitInStock(12);
//        product3.setProductManufacturer("Polk");
//
//
//        productList=new ArrayList<Product>();
//        productList.add(product1);
//        productList.add(product2);
//        productList.add(product3);
//        return productList;
//    }
//
//    public Product getProductById(String productId) throws IOException{
//        for(Product product:getProductList()){
//            if(product.getProductId().equals(productId)){
//                return product;
//            }
//        }
//        throw new IOException("No product found.");
//    }
//}
