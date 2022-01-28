package com.RFDSpring.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Account {
    public Account() {
    }

    public Account(ArrayList<Transaction> transactions, String owner, String accountNum) {
        Transactions = transactions;
        this.owner = owner;
        AccountNum = accountNum;
    }

    public ArrayList<Transaction> getTransactions() {
        return Transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        Transactions = transactions;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getAccountNum() {
        return AccountNum;
    }

    public void setAccountNum(String accountNum) {
        AccountNum = accountNum;
    }

    @Id
    @Column(name = "accountID", nullable = false)
    private Long accountID;
    private ArrayList<Transaction> Transactions;
    private String owner;
    private String AccountNum;

    public Long getId() {
        return accountID;
    }

    public void setId(Long id) {
        this.accountID = id;
    }
}
