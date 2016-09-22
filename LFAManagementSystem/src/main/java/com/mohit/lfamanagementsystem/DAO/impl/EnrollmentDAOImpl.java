/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mohit.lfamanagementsystem.DAO.impl;

import com.mohit.lfamanagementsystem.DAO.EnrollmentDAO;
import com.mohit.lfamanagementsystem.entity.Enrollment;
import com.mohit.lfamanagementsystem.entity.Faculty;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Mohit
 */
@Repository(value = "enrollmentDao")
public class EnrollmentDAOImpl implements EnrollmentDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;
    
    @Override
    public int insert(Enrollment en) throws SQLException, ClassNotFoundException {
        String sql="INSERT INTO tbl_enrollment(first_name,last_name,email_id,contact_number,college_name,faculty_id,course_id,employment_status_id,enquiry_status_id)"+"VALUES(?,?,?,?,?,?,?,?,?)";
        return jdbcTemplate.update(sql, new Object[]{
            en.getFirstName(),
            en.getLastName(),
            en.getEmail(),
            en.getContactNumber(),
            en.getCollegeName(),
            en.getFaculty().getFacultyId(),
            en.getCourse().getId(),
            en.getEmploymentStatus().getEmploymentStatusid(),
            en.getEnquiryStatus().getEnquiryStatusId()
        
        });
    }

    @Override
    public List<Enrollment> getAll() throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
