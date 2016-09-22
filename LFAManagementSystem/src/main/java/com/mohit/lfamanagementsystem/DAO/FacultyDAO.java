/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mohit.lfamanagementsystem.DAO;

import com.mohit.lfamanagementsystem.entity.Faculty;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Mohit
 */
public interface FacultyDAO {
    
    int insert(Faculty f) throws SQLException,ClassNotFoundException;
    
    List<Faculty> getAll() throws SQLException,ClassNotFoundException;
    
    
}
