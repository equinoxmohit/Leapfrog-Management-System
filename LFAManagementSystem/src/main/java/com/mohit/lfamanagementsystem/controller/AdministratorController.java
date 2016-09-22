/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mohit.lfamanagementsystem.controller;

import com.mohit.lfamanagementsystem.DAO.UserDAO;
import com.mohit.lfamanagementsystem.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Mohit
 */
@Controller
@RequestMapping(value = "/admin")
public class AdministratorController {
    
    @Autowired
    UserDAO userDao;
    

    @RequestMapping(method = RequestMethod.GET)
    public String doGet() {
        
        return "admin/login";
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public String doPost(User user) {
       user=userDao.login(user.getUsername(), user.getPassword());
       if(user!=null)
       {
           return "redirect:/display?success";
       }
       
           return "redirect:/?error";
    }

}
