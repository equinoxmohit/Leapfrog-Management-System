/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mohit.lfamanagementsystem.controller;

import com.mohit.lfamanagementsystem.DAO.EmploymentStatusDAO;
import com.mohit.lfamanagementsystem.entity.EmploymentStatus;
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
@RequestMapping(value = "/employmentstatus")
public class EmploymentStatusController {

    @Autowired
    EmploymentStatusDAO employmentStatusDao;

    @RequestMapping(method = RequestMethod.GET)
    public String doGet() {
        return "employementstatus/employmentstatus";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String doPost(EmploymentStatus es) {
        try {
            if (employmentStatusDao.insert(es) > 0) {
                return "redirect:/displayemploymentstatus?success";
            }
        } catch (SQLException | ClassNotFoundException ex) {

        }
        return "redirect:/display?error";
    }

}
