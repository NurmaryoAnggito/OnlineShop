/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.toto.controller;

import com.toto.model.Product;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author user
 */
public class CartBean {

    /**
     * @return the totalprice
     */
    private Map<Integer,Product> productlist = new HashMap<>();
    private double totalprice;
    
    public double getTotalprice() {
        return totalprice;
    }

    /**
     * @param totalprice the totalprice to set
     */
    public void setTotalprice(double totalprice) {
        this.totalprice = totalprice;
    }

    /**
     * @return the productlist
     */
    public Map<Integer,Product> getProductlist() {
        return productlist;
    }

    /**
     * @param productlist the productlist to set
     */
    public void setProductlist(Map<Integer,Product> productlist) {
        this.productlist = productlist;
    }
    

    /**
     * @return the produk
     */
    

    /**
     * @return the quantity
     */
    
}
