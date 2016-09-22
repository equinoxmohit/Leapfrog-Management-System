/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mohit.lfamanagementsystem.DAO;

import com.mohit.lfamanagementsystem.entity.EnquiryStatus;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Mohit
 */
public interface EnquiryStatusDAO {

    int insert(EnquiryStatus es) throws SQLException, ClassNotFoundException;

    List<EnquiryStatus> getAll() throws SQLException, ClassNotFoundException;

}
