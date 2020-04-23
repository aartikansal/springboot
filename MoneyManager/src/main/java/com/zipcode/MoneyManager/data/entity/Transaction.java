package com.zipcode.MoneyManager.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TRANSACTION")
public class Transaction {

    /*TRANSACTION
    TRANSACTION_ID INT PRIMARY KEY AUTO_INCREMENT,
    ACCOUNT_NUMBER INT NOT NULL,
    CUSTOMER_ID INT NOT NULL */

    @Id
    @Column(name="TRANSACTION_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int transactionId;
    @Column(name="ACCOUNT_NUMBER")
    private String accountNumber;
    @Column(name="CUSTOMER_ID")
    private int customerId;

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
}


