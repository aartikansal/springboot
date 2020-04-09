package com.zipcode.moneymanager.WebMVC;

import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;


public class Bank extends DAO<AccountData> {
    private Map<Integer, Account> savingsAccounts;
    private Map<Integer, Account> basicAccounts;


    public Bank(){
        super();
        basicAccounts = new HashMap<>();
        savingsAccounts = new HashMap<>();
    }

    /*public Bank(Map<Integer, Account> savingsAccounts, Map<Integer, Account> basicAccounts){
        this.savingsAccounts = savingsAccounts;
        this.basicAccounts = basicAccounts;
    }*/

    public Bank(Connection connection) {
        super(connection);
    }

    public Account getAccountById(Integer id, String accountType) {
        if (accountType.equals("Regular")) {
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
        //overdrafts allowed up to $100 for bank fees
        if(account.getBalance() - amount >= -100){
            account.withdraw(amount);
        }
    }

    public void addAccount(Account account){
        if(account.getAccountData().getTypeAccount().equals("Regular")) {
            basicAccounts.put(account.getAccountData().getId(), account);
        }
        else{
            savingsAccounts.put(account.getAccountData().getId(), account);
        }
    }

    public Map<Integer, Account> getAccounts(String accountType) {
        if(accountType.equals("Regular")){
            return basicAccounts;
        }
        else{
            return savingsAccounts;
        }
    }




}
