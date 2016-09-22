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
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Mohit
 */
@Controller
@RequestMapping(value = "/edit")
public class CourseEditController {

    @Autowired
    CourseDAO courseDao;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String doGet(@PathVariable("id") int id, Model model) {
        try {
            Course c = courseDao.getById(id);
            if (c == null) {
                return "redirect:/?error";
            }
            model.addAttribute("course", c);
        } catch (SQLException | ClassNotFoundException ex) {

        }
        return "course/edit";
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.POST)
    public String doPost(Course course) {
       try{
        if(courseDao.update(course)>0)
        {
           return "redirect:/display?success";     
        }
       }catch(SQLException|ClassNotFoundException ex)
       {
       
       }
        return "redirect:/?error";
    }

}
