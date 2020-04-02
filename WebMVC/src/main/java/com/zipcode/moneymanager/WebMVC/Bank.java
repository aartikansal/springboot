package com.zipcode.moneymanager.WebMVC;

import java.util.HashMap;
import java.util.Map;

public class Bank {
    private Map<Integer, Account> accounts;

    public Bank(){
        accounts = new HashMap<>();
    }

    public Bank(Map<Integer, Account> accounts){
        this.accounts = accounts;
    }

    public Account getAccountById(Integer id){
        return accounts.get(id);
    }

    public void deposit(AccountData accountData, float amount){
        // get account by id, but only deposits if the email also matches
        Account account = getAccountById(accountData.getId());
        if(account.getAccountData().getEmail().equals(accountData.getEmail())){
            account.deposit(amount);
        }
        else{
            System.out.println("Email/id don't match.  Try again!");
        }
    }

    public void withdraw(AccountData accountData, Integer amount){
        // get account by id, but only withdraws if the email matches and balance exceeds withdraw amount
        Account account = getAccountById(accountData.getId());
        if(account.getAccountData().getEmail().equals(accountData.getEmail()) && account.canWithdraw(amount)){
            account.withdraw(amount);
        }
        else{
            // to be refactored
            System.out.println("Email/id don't match or withdraw exceeds balance");
        }
    }

    public void addAccount(String name, String email, Integer deposit, String accountType){
        AccountData accountdata = new AccountData(name, email, deposit, accountType);
        if(accountType.equals("Basic")){
        BasicAccount basicAccount = new BasicAccount(accountdata);
        accounts.put(basicAccount.getAccountData().getId(), basicAccount);
        }
        else{
            SavingsAccount savingsAccount = new SavingsAccount(accountdata);
            accounts.put(savingsAccount.getAccountData().getId(), savingsAccount);
        }


    }




}
