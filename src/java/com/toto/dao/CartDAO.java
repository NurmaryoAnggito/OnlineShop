/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.toto.dao;

import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.transaction.Transactional;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

/**
 *
 * @author user
 */
@Repository
@Controller
public class CartDAO {
    
    static final Logger logger = Logger.getLogger(UserServices.class.getName());
    
    @PersistenceUnit
    EntityManagerFactory emf;
    private EntityManager em;
    
    @Transactional
    public void saveCart(){
        
    }
}
