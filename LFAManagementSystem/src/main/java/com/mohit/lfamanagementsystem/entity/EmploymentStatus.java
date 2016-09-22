/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mohit.lfamanagementsystem.entity;

/**
 *
 * @author Mohit
 */
public class EmploymentStatus {

    private int employmentStatusid;
    private String employmentStatusName;

    public EmploymentStatus() {
    }

    public EmploymentStatus(int employmentStatusid, String employmentStatusName) {
        this.employmentStatusid = employmentStatusid;
        this.employmentStatusName = employmentStatusName;
    }

    public int getEmploymentStatusid() {
        return employmentStatusid;
    }

    public void setEmploymentStatusid(int employmentStatusid) {
        this.employmentStatusid = employmentStatusid;
    }

    public String getEmploymentStatusName() {
        return employmentStatusName;
    }

    public void setEmploymentStatusName(String employmentStatusName) {
        this.employmentStatusName = employmentStatusName;
    }

}
