/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.toto.dao;

import com.toto.model.Users;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author user
 */
@Repository
@Transactional
public class UserServices {

    /**
     * @return the em
     */
    
    
    static final Logger logger = Logger.getLogger(UserServices.class.getName());
    
    @PersistenceUnit
    EntityManagerFactory emf;
    private EntityManager em;
    
    @Transactional
    public void saveUser(Users user){
        em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();
        em.close();
    }
    
    /**
     *
     * @param username
     * @return
     */
    public Users findbyUsername(String username){
        Users user = new Users();
        try {
            em = emf.createEntityManager();
            Query query = em.createQuery("Select u from Users u where u.username = :username");
            query.setParameter("username", username);
            user = (Users) query.getSingleResult();
        } catch (NoResultException nre) {
            logger.severe("Username tidak ada");
        }
        return user;
    }
    
    public EntityManager getEm() {
        return em;
    }

    /**
     * @param em the em to set
     */
    public void setEm(EntityManager em) {
        this.em = em;
    }
}
