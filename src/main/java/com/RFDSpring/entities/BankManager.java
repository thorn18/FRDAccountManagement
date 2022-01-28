package com.RFDSpring.entities;

import javax.persistence.Entity;

@Entity
public class BankManager extends User {

    public BankManager() {
    }

    public BankManager(int userID, String username, String password, String role, String address, String email, String DOB) {
        super(userID, username, password, role, address, email, DOB);
    }
}
