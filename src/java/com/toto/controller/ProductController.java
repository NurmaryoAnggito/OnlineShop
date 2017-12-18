/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.toto.controller;

import com.toto.dao.ProductDAO;
import com.toto.model.Product;
import com.toto.model.Users;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author user
 */
@Controller
@RequestMapping("/produk")
public class ProductController {
    @Autowired
    ProductDAO prodDAO;
    int size;
    
    @RequestMapping("/cart")
    public String goCart(){
        return "cart";
    }
    
    @RequestMapping("/all")
    public String findAllProduct(Model model){
        List<Product> products = prodDAO.findAllProduct();
        model.addAttribute("products",products);
        return "Product";
    }
    
    @RequestMapping("/{id}")
    public String getProductById(@PathVariable Integer id, Model model){
        Product product = prodDAO.findById(id);
        model.addAttribute("product", product);
        return "productdetail";
    }
    
    @RequestMapping("/addproduct/{id}")
    public String addProducttoCart(HttpSession session, @PathVariable Integer id, Model model){
        Product prod = prodDAO.findById(id);
        int i=0;
        double totalprice =0;
        DecimalFormat decf = new DecimalFormat("###,###.##");
        CartBean cart = (CartBean) session.getAttribute("cartBean"); 
        if(cart==null){
            cart=new CartBean();
        }
        size++;
        cart.getProductlist().put(size, prod);
        i = cart.getProductlist().size();
        
        Map<Integer, Product> products = cart.getProductlist();
        for (Map.Entry<Integer, Product> entry : products.entrySet()) {
            totalprice += entry.getValue().getProductprice();
        }
        
        String formatedprice = decf.format(totalprice);
        

        session.setAttribute("totalprice", formatedprice);
        session.setAttribute("i", i);
        session.setAttribute("cartBean", cart);
        return "redirect:/produk/all";
    }
    
    @RequestMapping("/delete/{key}")
    public String deleteCsrtItem(HttpSession session, @PathVariable Integer key, Model model){
         DecimalFormat decf = new DecimalFormat("###,###.##");
        double totalprice = 0;
        String formatedprice;
        int i =0;
        
        CartBean cart = (CartBean) session.getAttribute("cartBean");
        cart.getProductlist().remove(key);
        
        Map<Integer, Product> products = cart.getProductlist();
        for (Map.Entry<Integer, Product> entry : products.entrySet()) {
            totalprice+= entry.getValue().getProductprice();
        }
        i = cart.getProductlist().size();
        formatedprice = decf.format(totalprice);
        session.setAttribute("i", i);
        session.setAttribute("totalprice", formatedprice);
        
        return "cart";
    }
    
    @RequestMapping("/checkout")
    public String checkOut(HttpSession session){
        String priced = session.getAttribute("totalprice").toString();
        Users user = (Users) session.getAttribute("user");
        if(user==null){
        session.setAttribute("priced", "Must Login");
        }
        else{
        session.setAttribute("i", 0);
        session.removeAttribute("cart");
        session.setAttribute("priced", priced);}
        return "checkout";
    }
}
