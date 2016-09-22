/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mohit.lfamanagementsystem.controller;

import com.mohit.lfamanagementsystem.DAO.CourseDAO;
import com.mohit.lfamanagementsystem.DAO.EmploymentStatusDAO;
import com.mohit.lfamanagementsystem.DAO.EnquiryStatusDAO;
import com.mohit.lfamanagementsystem.DAO.EnrollmentDAO;
import com.mohit.lfamanagementsystem.DAO.FacultyDAO;
import com.mohit.lfamanagementsystem.entity.Enrollment;
import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Mohit
 */
@Controller
@RequestMapping(value = "/enroll")
public class EnrollmentStatusController {

    @Autowired
    CourseDAO courseDao;
    @Autowired
    FacultyDAO facultyDao;
    @Autowired
    EmploymentStatusDAO employmentStatusDao;
    @Autowired
    EnquiryStatusDAO enquiryStatusDao;
    @Autowired
    EnrollmentDAO enrollmentDao;

    @RequestMapping(method = RequestMethod.GET)
    public String doGet(Model model) {
        try {
            model.addAttribute("courses", courseDao.getAll(true));
            model.addAttribute("faculty", facultyDao.getAll());
            model.addAttribute("employmentStatus", employmentStatusDao.getAll());
            model.addAttribute("enquiry", enquiryStatusDao.getAll());
        } catch (SQLException | ClassNotFoundException ex) {

        }
        return "enroll/enroll";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String doPost(Enrollment en) {
        try {
            if (enrollmentDao.insert(en) > 0) {
                return "redirect:/?success";
            }
        } catch (SQLException | ClassNotFoundException ex) {

        }
        return "redirect:/?success";
    }

}
