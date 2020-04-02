package com.zipcode.moneymanager.WebMVC;

import java.util.HashMap;
import java.util.Map;

public class Bank {
    private Map<Integer, Account> savingsAccounts;
    private Map<Integer, Account> basicAccounts;

    public Bank(){
        basicAccounts = new HashMap<>();
        savingsAccounts = new HashMap<>();
    }

    public Bank(Map<Integer, Account> savingsAccounts, Map<Integer, Account> basicAccounts){
        this.savingsAccounts = savingsAccounts;
        this.basicAccounts = basicAccounts;
    }

    public Account getAccountById(Integer id, String accountType) {
        if (accountType.equals("basic")) {
            return basicAccounts.get(id);
        } else {
            return savingsAccounts.get(id);
        }
    }

    public void deposit(Account account, float amount){
        if(amount > 0) {
            account.deposit(amount);
        }
        else{
            System.out.println("Can not deposit a negative amount");
        }
    }

    public void withdraw(Account account, Integer amount){
        if(account.canWithdraw(amount)){
            account.withdraw(amount);
        }
    }

    public void addAccount(Account account){
        if(account.getAccountData().getTypeAccount().equals("basic")) {
            basicAccounts.put(account.getAccountData().getId(), account);
        }
        else{
            savingsAccounts.put(account.getAccountData().getId(), account);
        }
    }

    public Map<Integer, Account> getAccounts(String accountType) {
        if(accountType.equals("basic")){
            return basicAccounts;
        }
        else{
            return savingsAccounts;
        }
    }




}
