package com.zipcode.moneymanager.WebMVC;

public class AccountData {
    private final int id;
    private String name;
    private String email;
    private float balance;
    private String accountType;


    public AccountData(){};

    public AccountData(int id, String name, String email, float balance, String accountType){
        this.id = id;
        this.name = name;
        this.email = email;
        this.balance = balance;
        this.accountType = accountType;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getBalance() {
        return balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }
}
