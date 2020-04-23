package com.zipcode.MoneyManager.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ACCOUNT")
public class Account {

    /*CUSTOMER ACCOUNT
    ACCOUNT_ID INT PRIMARY KEY AUTO_INCREMENT ,
    ACCOUNT_TYPE VARCHAR (64),
    BALANCE INT */

    @Id
    @Column(name="ACCOUNT_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int accountId;
    @Column(name="ACCOUNT_TYPE")
    private String accountType;
    @Column(name="BALANCE")
    private int balance;

    public String getAccountType() {
        return accountType;
    }
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
}

