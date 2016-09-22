/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mohit.lfamanagementsystem.DAO.impl;

import com.mohit.lfamanagementsystem.DAO.CourseDAO;
import com.mohit.lfamanagementsystem.entity.Course;
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
@Repository(value = "courseDao")
public class CourseDAOImpl implements CourseDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public int insert(Course course) throws SQLException, ClassNotFoundException {
        String sql = "INSERT INTO tbl_courses(course_name,course_description,fees,duration,duration_type,status)" + "VALUES(?,?,?,?,?,?)";
        return jdbcTemplate.update(sql, new Object[]{
            course.getCourseName(),
            course.getCourseDescription(),
            course.getFees(),
            course.getDuration(),
            course.getDurationType(),
            course.isStatus()
        });
    }

    @Override
    public int update(Course course) throws SQLException, ClassNotFoundException {
        String sql = "UPDATE tbl_courses SET course_name=?,course_description=?,fees=?,duration=?,duration_type=?,status=? WHERE course_id=?";
        return jdbcTemplate.update(sql, new Object[]{
            course.getCourseName(),
            course.getCourseDescription(),
            course.getFees(),
            course.getDuration(),
            course.getDurationType(),
            course.isStatus(),
            course.getId()
        });
    }

    @Override
    public int delete(int id) throws SQLException, ClassNotFoundException {
        String sql = "DELETE FROM tbl_courses WHERE course_id=?";
        return jdbcTemplate.update(sql, new Object[]{id});
    }

    @Override
    public List<Course> getAll(boolean status) throws SQLException, ClassNotFoundException {

        String sql = "SELECT * FROM tbl_courses WHERE 1=1";
        if (status) {
            sql += " AND status=1";
        }

        return jdbcTemplate.query(sql, new RowMapper<Course>() {

            @Override
            public Course mapRow(ResultSet rs, int i) throws SQLException {
                Course c = new Course();
                c.setId(rs.getInt("course_id"));
                c.setCourseName(rs.getString("course_name"));
                c.setCourseDescription(rs.getString("course_description"));
                c.setFees(rs.getInt("fees"));
                c.setDuration(rs.getInt("duration"));
                c.setDurationType(rs.getString("duration_type"));
                c.setAddedDate(rs.getDate("added_date"));
                c.setModifiedDate(rs.getDate("modified_date"));
                c.setStatus(rs.getBoolean("status"));
                return c;
            }
        });

    }

    @Override
    public Course getById(int id) throws SQLException, ClassNotFoundException {
        String sql = "SELECT * FROM tbl_courses WHERE course_id=?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, new RowMapper<Course>() {

            @Override
            public Course mapRow(ResultSet rs, int i) throws SQLException {
                Course c = new Course();
                c.setId(rs.getInt("course_id"));
                c.setCourseName(rs.getString("course_name"));
                c.setCourseDescription(rs.getString("course_description"));
                c.setFees(rs.getInt("fees"));
                c.setDuration(rs.getInt("duration"));
                c.setDurationType(rs.getString("duration_type"));
                c.setAddedDate(rs.getDate("added_date"));
                c.setModifiedDate(rs.getDate("modified_date"));
                c.setStatus(rs.getBoolean("status"));
                return c;
            }
        });
    }

}
