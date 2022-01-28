package com.RFDSpring.entities;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

@Entity
public class AccountHolder extends User {

    private int userID;
    private ArrayList<Account> accounts;

    public AccountHolder() {
    }

    public AccountHolder(int userID, String username, String password, String role, String address, String email, String DOB, String owner) {
        super(userID, username, password, role, address, email, DOB);
        this.userID = userID;
        this.accounts = new ArrayList<Account>();
    }
}
