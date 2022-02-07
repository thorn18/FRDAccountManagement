package com.RFDSpring.entities;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

@Entity
public class AccountHolder extends User {

    private ArrayList<Account> accounts;

    public AccountHolder() {
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    public AccountHolder(int userID, String username, String password, String role, String address, String email, String DOB) {
        super(userID, username, password, role, address, email, DOB);
        this.accounts = new ArrayList<>();
    }
}
