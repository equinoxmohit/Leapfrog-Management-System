/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mohit.lfamanagementsystem.DAO.impl;

import com.mohit.lfamanagementsystem.DAO.EnquiryStatusDAO;
import com.mohit.lfamanagementsystem.entity.EnquiryStatus;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Mohit
 */
@Repository(value = "enquiryStatusDao")
public class EnquiryStatusDAOImpl implements EnquiryStatusDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public int insert(EnquiryStatus es) throws SQLException, ClassNotFoundException {
        String sql = "INSERT INTO  tbl_enquiry_status(enquiry_status_name)" + "VALUES(?)";
        return jdbcTemplate.update(sql, new Object[]{
            es.getEnquiryStatusName()
        });
    }

    @Override
    public List<EnquiryStatus> getAll() throws SQLException, ClassNotFoundException {
        String sql = "SELECT * FROM tbl_enquiry_status";
        return jdbcTemplate.query(sql, new RowMapper<EnquiryStatus>() {

            @Override
            public EnquiryStatus mapRow(ResultSet rs, int i) throws SQLException {
                EnquiryStatus es = new EnquiryStatus();
                es.setEnquiryStatusId(rs.getInt("enquiry_status_id"));
                es.setEnquiryStatusName(rs.getString("enquiry_status_name"));
                return es;
            }
        });
    }

}
