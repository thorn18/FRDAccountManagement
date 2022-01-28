package com.RFDSpring.entities;


public class Transaction {

    private String transactionStrings;
    private int TransactionID;
    private String transactionDate;
    private String type;

    public String getType() {
        return type;
    }

    public Transaction(String transactionStrings, int transactionID, String transactionDate, String type) {
        this.transactionStrings = transactionStrings;
        TransactionID = transactionID;
        this.transactionDate = transactionDate;
        this.type = type;
    }

    public String getTransactionStrings() {
        return transactionStrings;
    }

    public void setTransactionStrings(String transactionStrings) {
        this.transactionStrings = transactionStrings;
    }

    public int getTransactionID() {
        return TransactionID;
    }

    public void setTransactionID(int transactionID) {
        TransactionID = transactionID;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

}
