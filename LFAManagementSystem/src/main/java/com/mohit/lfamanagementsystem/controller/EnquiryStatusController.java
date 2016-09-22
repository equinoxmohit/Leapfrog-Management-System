/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mohit.lfamanagementsystem.controller;

import com.mohit.lfamanagementsystem.DAO.EnquiryStatusDAO;
import com.mohit.lfamanagementsystem.entity.EnquiryStatus;
import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Mohit
 */
@Controller
@RequestMapping(value = "/status")
public class EnquiryStatusController {
    
    @Autowired
    EnquiryStatusDAO enquiryStatusDao;
    
    @RequestMapping(method = RequestMethod.GET)
    public String doGet()
    {
        return "enquirystatus/enquirystatus";
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public String doPost(EnquiryStatus es)
    {
        try{
        if(enquiryStatusDao.insert(es)>0)
        {
            return "redirect:/displayenquirystatus?success";
        }
        }catch(SQLException|ClassNotFoundException ex)
        {
        
        }
        return "redirect:/display?error";
    }
}
