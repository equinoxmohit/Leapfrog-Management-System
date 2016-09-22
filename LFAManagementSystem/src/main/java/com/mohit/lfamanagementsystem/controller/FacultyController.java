/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mohit.lfamanagementsystem.controller;

import com.mohit.lfamanagementsystem.DAO.FacultyDAO;
import com.mohit.lfamanagementsystem.entity.Faculty;
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
@RequestMapping(value = "/faculty")
public class FacultyController {
    
    @Autowired
    FacultyDAO facultyDao;

    @RequestMapping(method = RequestMethod.GET)
    public String doGet() {
        return "faculty/faculty";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String doPost(Faculty faculty) {
        try{
        if(facultyDao.insert(faculty)>0){
            return "redirect:/displayfaculty?success";
        }
        }catch(SQLException|ClassNotFoundException ex)
        {
        
        }
        return "redirect:/display?error";
    }
}
