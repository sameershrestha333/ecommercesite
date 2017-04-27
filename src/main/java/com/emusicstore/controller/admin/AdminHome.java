package com.emusicstore.controller.admin;

import com.emusicstore.model.Customer;
import com.emusicstore.model.Product;
import com.emusicstore.service.CustomerService;
import com.emusicstore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by sameer on 1/3/2017.
 */
@Controller
@RequestMapping("/admin")
public class AdminHome {


    @Autowired
    private ProductService productService;

    @Autowired
    private CustomerService customerService;

    @RequestMapping
    public String adminPage(){
        return "admin";
    }

    @RequestMapping("/productInventory")
    public String productInventory(Model model){
        List<Product> products=productService.getProductList();

        model.addAttribute("products",products);
        return  "productInventory";

    }


    @RequestMapping("/customer")
    private String customerManagement(Model model){

          List<Customer> customerList=customerService.getAllCustomer();
            model.addAttribute("customerList",customerList);
        return "customerManagement";
    }
}
