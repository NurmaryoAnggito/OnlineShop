/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.toto.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author user
 */
@Entity
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String username;
    private String userpassword;
    private String userfullname;
    private String useraddress;
    private String useremail;
    
    
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
        if (!(object instanceof Users)) {
            return false;
        }
        Users other = (Users) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.toto.model.Users[ id=" + id + " ]";
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the userpassword
     */
    public String getUserpassword() {
        return userpassword;
    }

    /**
     * @param userpassword the userpassword to set
     */
    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    /**
     * @return the userfullname
     */
    public String getUserfullname() {
        return userfullname;
    }

    /**
     * @param userfullname the userfullname to set
     */
    public void setUserfullname(String userfullname) {
        this.userfullname = userfullname;
    }

    /**
     * @return the useraddress
     */
    public String getUseraddress() {
        return useraddress;
    }

    /**
     * @param useraddress the useraddress to set
     */
    public void setUseraddress(String useraddress) {
        this.useraddress = useraddress;
    }

    /**
     * @return the useremail
     */
    public String getUseremail() {
        return useremail;
    }

    /**
     * @param useremail the useremail to set
     */
    public void setUseremail(String useremail) {
        this.useremail = useremail;
    }

    /**
     * @return the userbirthdate
     */
  
    
}
