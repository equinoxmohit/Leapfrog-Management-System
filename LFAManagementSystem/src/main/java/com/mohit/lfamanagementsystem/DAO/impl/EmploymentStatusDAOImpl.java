/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mohit.lfamanagementsystem.DAO.impl;

import com.mohit.lfamanagementsystem.DAO.EmploymentStatusDAO;
import com.mohit.lfamanagementsystem.entity.EmploymentStatus;
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
@Repository(value = "employmentStatusDao")
public class EmploymentStatusDAOImpl implements EmploymentStatusDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public int insert(EmploymentStatus es) throws SQLException, ClassNotFoundException {
        String sql = "INSERT INTO tbl_employment_status(employment_status_name)" + "VALUES(?)";
        return jdbcTemplate.update(sql, new Object[]{
            es.getEmploymentStatusName()
        });
    }

    @Override
    public List<EmploymentStatus> getAll() throws SQLException, ClassNotFoundException {
        String sql = "SELECT * FROM tbl_employment_status";
        return jdbcTemplate.query(sql, new RowMapper<EmploymentStatus>() {

            @Override
            public EmploymentStatus mapRow(ResultSet rs, int i) throws SQLException {
                EmploymentStatus es = new EmploymentStatus();
                es.setEmploymentStatusid(rs.getInt("employment_status_id"));
                es.setEmploymentStatusName(rs.getString("employment_status_name"));
                return es;
            }
        });
    }

}
