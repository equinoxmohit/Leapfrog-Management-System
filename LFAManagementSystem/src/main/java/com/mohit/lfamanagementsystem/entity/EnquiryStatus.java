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
public class EnquiryStatus {
    private int enquiryStatusId;
    private String enquiryStatusName;

    public EnquiryStatus() {
    }

    public EnquiryStatus(int enquiryStatusId, String enquiryStatusName) {
        this.enquiryStatusId = enquiryStatusId;
        this.enquiryStatusName = enquiryStatusName;
    }

    public int getEnquiryStatusId() {
        return enquiryStatusId;
    }

    public void setEnquiryStatusId(int enquiryStatusId) {
        this.enquiryStatusId = enquiryStatusId;
    }

    public String getEnquiryStatusName() {
        return enquiryStatusName;
    }

    public void setEnquiryStatusName(String enquiryStatusName) {
        this.enquiryStatusName = enquiryStatusName;
    }
    
    
    
}
