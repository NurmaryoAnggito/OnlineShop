/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.toto.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author user
 */
@Entity
public class Cart implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;@OneToOne
    private Users user;
    @OneToMany(mappedBy = "cart")
    private Map<Integer,CartDetail> cartitems = new HashMap<>();
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date orderdate;
    private double totalprice;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cart)) {
            return false;
        }
        Cart other = (Cart) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.toto.model.Cart[ id=" + id + " ]";
    }

    /**
     * @return the user
     */
    public Users getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(Users user) {
        this.user = user;
    }

    /**
     * @return the cartitems
     */
    public Map<Integer,CartDetail> getCartitems() {
        return cartitems;
    }

    /**
     * @param cartitems the cartitems to set
     */
    public void setCartitems(Map<Integer,CartDetail> cartitems) {
        this.cartitems = cartitems;
    }

    /**
     * @return the orderdate
     */
    public Date getOrderdate() {
        return orderdate;
    }

    /**
     * @param orderdate the orderdate to set
     */
    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }

    /**
     * @return the totalprice
     */
    public double getTotalprice() {
        return totalprice;
    }

    /**
     * @param totalprice the totalprice to set
     */
    public void setTotalprice(double totalprice) {
        this.totalprice = totalprice;
    }
    
}
