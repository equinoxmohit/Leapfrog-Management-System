/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mohit.lfamanagementsystem.DAO.impl;

import com.mohit.lfamanagementsystem.DAO.UserDAO;
import com.mohit.lfamanagementsystem.entity.User;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Mohit
 */
@Repository(value = "userDao")
public class UserDAOImpl implements UserDAO {

    private List<User> userList = new ArrayList<>();

    @Override
    public List<User> getAll() {
        userList.add(new User("admin", "admin"));
        return userList;
    }

    @Override
    public User login(String username, String password) {
        for (User u : getAll()) {
            if (((u.getUsername().equals(username)) && (u.getPassword().equals(password)))) {
                return u;
            }
        }
        return null;
    }

}
