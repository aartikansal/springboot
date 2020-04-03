package com.zipcode.moneymanager.WebMVC;

public class AccountCreator {

    public Account basicCreator(String name, String email, Integer deposit, String accountType){
        AccountData accountData = new AccountData(name, email, deposit, accountType);
        return new BasicAccount(accountData);
    }

    public Account savingsCreator(String name, String email, Integer deposit, String accountType){
        AccountData accountData = new AccountData(name, email, deposit, accountType);
        return new SavingsAccount(accountData);
    }

}
