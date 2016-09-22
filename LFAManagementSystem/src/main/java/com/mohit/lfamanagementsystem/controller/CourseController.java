/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mohit.lfamanagementsystem.controller;

import com.mohit.lfamanagementsystem.DAO.CourseDAO;
import com.mohit.lfamanagementsystem.entity.Course;
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
@RequestMapping(value = "/course")
public class CourseController {

    @Autowired
    CourseDAO courseDao;

    @RequestMapping(method = RequestMethod.GET)
    public String doGet() {
        return "course/course";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String doPost(Course course) {
        try{
        if(courseDao.insert(course)>0)
        {
            return "redirect:/display?success";
        }
        }catch(SQLException|ClassNotFoundException ex)
        {
            
        }
         return "redirect:/?error";
    }

}
