/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.toto.dao;

import com.toto.model.Product;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

/**
 *
 * @author user
 */
@Repository
@Transactional
public class ProductDAO {
    @PersistenceUnit
    EntityManagerFactory emf;
    EntityManager em;
    
    public List<Product> findAllProduct(){
        em = emf.createEntityManager();
        Query query = em.createQuery("Select p from Product p");
        List<Product> products = query.getResultList();
        return products;
    }
    public Product findById(int Id){
        em = emf.createEntityManager();
        Query query = em.createQuery("Select p from Product p where p.id=:id");
        query.setParameter("id", Id);
        Product product = (Product) query.getSingleResult();
        return product;
    }
}
