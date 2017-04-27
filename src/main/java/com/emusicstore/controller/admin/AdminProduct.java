package com.emusicstore.controller.admin;

import com.emusicstore.model.Product;
import com.emusicstore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by sameer on 1/3/2017.
 */
@Controller
@RequestMapping("/admin")
public class AdminProduct {

    private Path path;

    @Autowired
    private ProductService productService;

    @RequestMapping("/product/addProduct")
    public String addProduct(Model model){

        Product product=new Product();
        //setting some default values for radio buttons

        product.setProductCategory("instrument");
        product.setProductCondition("new");
        product.setProductStatus("active");
        model.addAttribute("product",product);

        return "addProduct";
    }

    //adding product functionality
    //@Valid annotation to check on the required field,simplily for validation
    //@ModelAttribute is to grap the model instance defined in jsp and passed it to product variable
    //BindingResult is used to check the errors.
    //HttpServletRequest is used to get the path to store the image.
    @RequestMapping(value = "/product/addProduct",method = RequestMethod.POST)
    public String addProductPost(@Valid @ModelAttribute("product")Product product, BindingResult result, HttpServletRequest request){

        //checking validation
        if(result.hasErrors()){
            return "addProduct";
        }
        productService.addProduct(product);

        //for uploading the images
        //multipartFile is used to deal with product image
        MultipartFile productImage=product.getProductImage();
        String rootDirectory=request.getSession().getServletContext().getRealPath("/");
        path= Paths.get(rootDirectory+"\\WEB-INF\\resources\\images\\"+product.getProductId()+".png");

        if(productImage!=null && !productImage.isEmpty()){
            try {
                productImage.transferTo(new File(path.toString()));
            }
            catch (Exception ex){
                ex.printStackTrace();
                throw new RuntimeException("Product image saving failed.");

            }
        }

        return  "redirect:/admin/productInventory";
    }

    //update part 1
    @RequestMapping("/product/updateProduct/{productId}")
    public String updateProduct(@PathVariable("productId") int productId, Model model){

        Product product=productService.getProductById(productId);
        //setting some default values for radio buttons


        model.addAttribute("product",product);

        return "updateProduct";
    }


    //update part2
    @RequestMapping(value = "/product/updateProduct",method = RequestMethod.POST)
    public String updateProductPost(@Valid @ModelAttribute("product")Product product, BindingResult result, HttpServletRequest request){

        //checking validation
        if(result.hasErrors()){
            return "updateProduct";
        }

        //for uploading the images
        //multipartFile is used to deal with product image
        MultipartFile productImage=product.getProductImage();
        String rootDirectory=request.getSession().getServletContext().getRealPath("/");
        path= Paths.get(rootDirectory+"\\WEB-INF\\resources\\images\\"+product.getProductId()+".png");

        if(productImage!=null && !productImage.isEmpty()){
            try {
                productImage.transferTo(new File(path.toString()));
            }
            catch (Exception ex){
                ex.printStackTrace();
                throw new RuntimeException("Product image saving failed.");

            }
        }
        productService.updateProduct(product);

        return  "redirect:/admin/productInventory";
    }

    //delete
    @RequestMapping("/product/deleteProduct/{productId}")
    public String deleteProduct(@PathVariable("productId") int productId,Model model,HttpServletRequest request){

        String rootDirectory=request.getSession().getServletContext().getRealPath("/");
        path= Paths.get(rootDirectory+"\\WEB-INF\\resources\\images\\"+productId+".png");

        if(Files.exists(path)){
            try {
                Files.delete(path);
            }
            catch (Exception ex){
                ex.printStackTrace();

            }
        }
        Product product=productService.getProductById(productId);
        productService.deleteProduct(product);
        return  "redirect:/admin/productInventory";
    }

}
