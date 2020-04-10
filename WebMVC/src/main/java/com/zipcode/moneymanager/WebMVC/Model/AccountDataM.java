package com.zipcode.moneymanager.WebMVC.Model;

import javax.persistence.*;

@Entity
@Table(name = "CustomerData")

public class AccountDataM {
    // ID, CustomerName, Email, AccountNumber, AccountType
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "CustomerName")
    private String name;
    @Column(name = "email")
    private  String email;
    @Column(name = "AccountBalance")
    private float balance;
    @Column(name = "AccountID")
    private int accountNumber;
    @Column(name = "AccountType")
    private String typeAccount;

    public AccountDataM(int id, String name, String email, int accountNumber, String typeAccount) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.accountNumber = accountNumber;
        this.typeAccount = typeAccount;
    }
    public AccountDataM(Integer id, String name, String email, float balance, String typeAccount) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.balance = balance;
        this.typeAccount = typeAccount;
    }

    public AccountDataM(){

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