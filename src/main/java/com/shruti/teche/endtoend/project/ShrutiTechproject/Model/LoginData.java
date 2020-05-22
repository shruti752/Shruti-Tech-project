package com.shruti.teche.endtoend.project.ShrutiTechproject.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LoginData {
    @Id
    @Column(name = "username")
    private String userName;
    @Column(name = "password")
    private String password;
    public LoginData(){

    }
    public LoginData(String userName,String password){
        this.password = password;
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
