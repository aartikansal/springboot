package com.zipcode.moneymanager.WebMVC;

public class AccountData {
    // ID, CustomerName, Email, AccountNumber, AccountType
    private static int count = 0;
    private final int id;
    private final String name;
    private  String email;
    private float balance;
    private int accountNumber;
    private final String typeAccount;

    AccountData(int id,String name, String email, int accountNumber, String typeAccount) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.accountNumber = accountNumber;
        this.typeAccount = typeAccount;
    }
    AccountData(Integer id,String name, String email, float balance, String typeAccount) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.balance = balance;
        this.typeAccount = typeAccount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
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
