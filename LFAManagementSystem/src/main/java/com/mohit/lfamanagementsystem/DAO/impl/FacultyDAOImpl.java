/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mohit.lfamanagementsystem.DAO.impl;

import com.mohit.lfamanagementsystem.DAO.FacultyDAO;
import com.mohit.lfamanagementsystem.entity.Faculty;
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
@Repository(value = "facultyDao")
public class FacultyDAOImpl implements FacultyDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public int insert(Faculty f) throws SQLException, ClassNotFoundException {
        String sql = "INSERT INTO tbl_faculties(faculty_name)" + "VALUES(?)";
        return jdbcTemplate.update(sql, new Object[]{
            f.getFacultyName()
        });
    }

    @Override
    public List<Faculty> getAll() throws SQLException, ClassNotFoundException {
        String sql = "SELECT * FROM tbl_faculties";
        return jdbcTemplate.query(sql, new RowMapper<Faculty>() {
            @Override
            public Faculty mapRow(ResultSet rs, int i) throws SQLException {
                Faculty faculty = new Faculty();
                faculty.setFacultyId(rs.getInt("faculty_id"));
                faculty.setFacultyName(rs.getString("faculty_name"));
                return faculty;
            }
        });
    }

}
