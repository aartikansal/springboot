package com.zipcode.moneymanager.WebMVC;

public class AccountCreator {

    public Account basicCreator(int id,String name, String email, int accountNumber, String accountType){
        AccountData accountData = new AccountData(id,name, email, accountNumber, accountType);
        return new BasicAccount(accountData);
    }

    public Account savingsCreator(int id,String name, String email, int accountNumber, String accountType){
        AccountData accountData = new AccountData(id,name, email, accountNumber, accountType);
        return new SavingsAccount(accountData);
    }

}
