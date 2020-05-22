package com.shruti.teche.endtoend.project.ShrutiTechproject.Model;

import java.util.Date;

public class UserDetails {
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private String emailId;
    private Date DOB;
    private long mobileNo;
    private String Gender;
    public UserDetails(){

    }

    public UserDetails(String uname,String password,String fname,String lname,long mno,String gender,String emailId){
        this.userName = uname;
        this.password = password;
        this.firstName = fname;
        this.lastName = lname;
        this.DOB = new Date();
        this.mobileNo = mno;
        this.Gender = gender;
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public String getGender() {
        return Gender;
    }

    public long getMobileNo() {
        return mobileNo;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }
}
