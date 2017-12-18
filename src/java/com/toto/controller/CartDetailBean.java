/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.toto.controller;

import com.toto.model.Product;

/**
 *
 * @author user
 */
public class CartDetailBean {
    private Product produk;
    private int quantity;

    /**
     * @return the produk
     */
    public Product getProduk() {
        return produk;
    }

    /**
     * @param produk the produk to set
     */
    public void setProduk(Product produk) {
        this.produk = produk;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
