package com.RFDSpring.entities;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
public class Account {
    public Account() {
    }

    public Long getAccountID() {
        return accountID;
    }

    public void setAccountID(Long accountID) {
        this.accountID = accountID;
    }

    public Account(ArrayList<Transaction> transactions, String owner, long balance, String type) {
        transactions = transactions;
        this.owner = owner;
        this.balance = balance;
        this.type=type;

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


    @Id
    @Column(name = "accountID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long accountID;
    private ArrayList<Transaction> Transactions;
    private String owner;
    private long balance;
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public Long getId() {
        return accountID;
    }

    public void setId(Long id) {
        this.accountID = id;
    }
}
