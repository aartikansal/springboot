package com.zipcode.moneymanager.WebMVC;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class BankTest {
    @Test
    public void addAccount(){
        Bank bank = new Bank();
        AccountCreator creator = new AccountCreator();
        Account account = creator.basicCreator("Aarti", "abc1@gmail.com", 1000,"basic");
        Account account2 = creator.savingsCreator("Khalil", "abc13@gmail.com", 1000,"savings");
        Account account3 = creator.savingsCreator("Eric", "abc12@gmail.com", 1000,"savings");
        bank.addAccount(account);
        bank.addAccount(account2);
        bank.addAccount(account3);
        Integer actual = bank.getAccounts("basic").size();
        Integer actual2 = bank.getAccounts("savings").size();
        Integer expected = 1;
        Integer expectedSavings = 2;
        Assert.assertEquals(expected,actual);
        Assert.assertEquals(expectedSavings,actual2);
    }

    @Test
    public void findById(){
        Bank bank = new Bank();
        AccountCreator creator = new AccountCreator();
        Account account = creator.basicCreator("Aarti", "abc1@gmail.com", 1000,"basic");
        bank.addAccount(account);
        Account actual = bank.getAccountById(1, "basic");
        Assert.assertEquals(account, actual);
    }

    @Test
    public void depositTest(){
        Bank bank = new Bank();
        AccountCreator creator = new AccountCreator();
        Account account = creator.basicCreator("Khalil", "abc1@gmail.com", 1000,"basic");
        bank.addAccount(account);
        bank.deposit(account, 300);
        double expectedBalance = 1300;
        Assert.assertEquals(expectedBalance, account.getBalance(), 0.0d);
    }

    @Test
    public void withdrawTest(){
        Bank bank = new Bank();
        AccountCreator creator = new AccountCreator();
        Account account = creator.basicCreator("Khalil", "abc1@gmail.com", 1000,"basic");
        bank.addAccount(account);
        bank.withdraw(account, 300);
        double expectedBalance = 700;
        Assert.assertEquals(expectedBalance, account.getBalance(), 0.0d);
    }
}
