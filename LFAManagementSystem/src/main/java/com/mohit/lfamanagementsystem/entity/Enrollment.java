/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mohit.lfamanagementsystem.entity;

import java.sql.Date;

/**
 *
 * @author Mohit
 */
public class Enrollment {
    private int enrollmentId;
    private String firstName,lastName,email,contactNumber,collegeName;
    private Date enrollmentDate;
    private Course course;
    private Faculty faculty;
    private EmploymentStatus employmentStatus;
    private EnquiryStatus enquiryStatus;
    private boolean enrollmentStatus;
    private int isRead;

    public Enrollment() {
    }

    public Enrollment(int enrollmentId, String firstName, String lastName, String email, String contactNumber, String collegeName, Date enrollmentDate, Course course, Faculty faculty, EmploymentStatus employmentStatus, EnquiryStatus enquiryStatus, boolean enrollmentStatus, int isRead) {
        this.enrollmentId = enrollmentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.contactNumber = contactNumber;
        this.collegeName = collegeName;
        this.enrollmentDate = enrollmentDate;
        this.course = course;
        this.faculty = faculty;
        this.employmentStatus = employmentStatus;
        this.enquiryStatus = enquiryStatus;
        this.enrollmentStatus = enrollmentStatus;
        this.isRead = isRead;
    }

    public int getEnrollmentId() {
        return enrollmentId;
    }

    public void setEnrollmentId(int enrollmentId) {
        this.enrollmentId = enrollmentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public Date getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(Date enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public EmploymentStatus getEmploymentStatus() {
        return employmentStatus;
    }

    public void setEmploymentStatus(EmploymentStatus employmentStatus) {
        this.employmentStatus = employmentStatus;
    }

    public EnquiryStatus getEnquiryStatus() {
        return enquiryStatus;
    }

    public void setEnquiryStatus(EnquiryStatus enquiryStatus) {
        this.enquiryStatus = enquiryStatus;
    }

    public boolean isEnrollmentStatus() {
        return enrollmentStatus;
    }

    public void setEnrollmentStatus(boolean enrollmentStatus) {
        this.enrollmentStatus = enrollmentStatus;
    }

    public int getIsRead() {
        return isRead;
    }

    public void setIsRead(int isRead) {
        this.isRead = isRead;
    }
    
    
    
    
    
}
