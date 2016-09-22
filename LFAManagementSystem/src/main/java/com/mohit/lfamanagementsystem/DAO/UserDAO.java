/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mohit.lfamanagementsystem.DAO;

import com.mohit.lfamanagementsystem.entity.User;
import java.util.List;

/**
 *
 * @author Mohit
 */

public interface UserDAO {
    
    List<User> getAll();

    User login(String username, String password);
}
