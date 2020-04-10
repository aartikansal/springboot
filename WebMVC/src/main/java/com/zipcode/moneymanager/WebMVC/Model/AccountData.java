package com.zipcode.moneymanager.WebMVC.Model;

import javax.persistence.*;

@Entity
@Table(name = "cdata")

public class AccountData {
    /// ID, CustomerName, Email, AccountNumber, AccountType
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "customername")
    private String name;
    @Column(name = "email")
    private  String email;
    @Column(name = "accountbalance")
    private float balance;
    @Column(name = "accountid")
    private int accountNumber;
    @Column(name = "accounttype")
    private String typeAccount;

    public AccountData(int id, String name, String email, int accountNumber, String typeAccount) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.accountNumber = accountNumber;
        this.typeAccount = typeAccount;
    }
    public AccountData(Integer id, String name, String email, float balance, String typeAccount) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.balance = balance;
        this.typeAccount = typeAccount;
    }

    public AccountData(){

    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public String getEmail() {
        return email;
    }

    public float getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getTypeAccount(){
        return typeAccount;
    }



}