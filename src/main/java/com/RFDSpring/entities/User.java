package com.RFDSpring.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int userID;
    String username;
    String password;
    String role;
    String address;
    String email;
    String dob;

    public User(int userID, String username, String password, String role, String address, String email, String dob) {
        this.userID = userID;
        this.username = username;
        this.password = password;
        this.role = role;
        this.address = address;
        this.email = email;
        this.dob = dob;
    }

    protected User() {
    }
    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
