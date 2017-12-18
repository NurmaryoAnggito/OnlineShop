/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.toto.controller;


import com.toto.dao.UserServices;
import com.toto.model.Users;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 *
 * @author user
 */
@Controller
@RequestMapping("/register")
public class RegisterController {
    @Autowired
    UserServices us;
    
    @RequestMapping("/form")
    public String registerForm(Model model) {
        RegisterFormBean registerBean = new RegisterFormBean();
        model.addAttribute("registerBean", registerBean);
        return "registration";
    }
    
    @RequestMapping("/save")
    public String saveRegistration(@ModelAttribute("registerBean") RegisterFormBean registerBean, 
            Model model){
        Users user = new Users();
        String encryptedPassword = PasswordDigest.createEncryptedPassword(registerBean.getPassword());
        user.setUserfullname(registerBean.getFullname());
        user.setUsername(registerBean.getUsername());
        user.setUserpassword(registerBean.getPassword());
        user.setUseremail(registerBean.getEmail());
        user.setUseraddress(encryptedPassword);
        
        
        us.saveUser(user);
        
        model.addAttribute("data", registerBean);
        return "success";
    }
    @RequestMapping()
    public String goRegistration(){
        return "Home";
    }
    @RequestMapping("/login")
    public String goLogin(Model model){
        LoginFormBean loginbean = new LoginFormBean();
        model.addAttribute("loginbean",loginbean);
        return "Login";
    }
    @RequestMapping("/productview")
    public String viewProduct(){
        return "Product";
    }
    
    
    @RequestMapping("/checklogin")
    public String cekLogin(HttpSession session,@ModelAttribute("loginbeans") LoginFormBean loginbean, Model model){
        Users user = us.findbyUsername(loginbean.getUsername());
        String encryptedPassword = PasswordDigest.createEncryptedPassword(loginbean.getPassword());
        if (user.getUsername()==null && encryptedPassword==null) {
            model.addAttribute("message", "username dan password salah");
            return "Login";
        }
        session.setAttribute("user", user);
        return "Product";
    }
    
    
}

