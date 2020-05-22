package com.shruti.teche.endtoend.project.ShrutiTechproject.Model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import sun.util.calendar.BaseCalendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

//import java.util.Date;
//@lombok.Getter
//@lombok.Setter
//@AllArgsConstructor
//@NoArgsConstructor

@Entity
@Table(name = "create_profile", catalog = "circle")
public class CreateProfile {
    @Id
    @Column(name = "uname")
    private String userName;
    @Column(name = "password")
    private String password;
    @Column(name = "fname")
    private String firstName;
    @Column(name = "lname")
    private String lastName;
    @Column(name = "email")
    private String emailId;
    @Column(name = "dob")
    private Date DOB;
    @Column(name = "mobileno")
    private long mobileNo;
    @Column(name = "gender")
    private String Gender;
    public CreateProfile(){

    }

    public CreateProfile(String uname,String password,String fname,String lname,long mno,String gender,String emailId){
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

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}
