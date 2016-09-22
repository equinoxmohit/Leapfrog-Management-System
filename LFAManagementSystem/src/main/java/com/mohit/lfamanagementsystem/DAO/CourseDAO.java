/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mohit.lfamanagementsystem.DAO;

import com.mohit.lfamanagementsystem.entity.Course;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Mohit
 */
public interface CourseDAO {

    int insert(Course course) throws SQLException, ClassNotFoundException;

    int update(Course course) throws SQLException, ClassNotFoundException;

    int delete(int id) throws SQLException, ClassNotFoundException;

    List<Course> getAll(boolean status) throws SQLException, ClassNotFoundException;

    Course getById(int id) throws SQLException, ClassNotFoundException;
}
