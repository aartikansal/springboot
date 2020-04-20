package com.zipcode.moneymanager.WebMVC;


import org.junit.Assert;
import org.junit.jupiter.api.Test;


public class AccountTest {

   /* @Test
    public void getAccountData() {
        AccountData expected = new AccountData("Khalil", "abc@gmail.com", 1000,"basic");
        Account acc = new BasicAccount(expected);
        Assert.assertEquals(expected, acc.getAccountData());
    }

    @Test
    public void deposit() {
        AccountData accountData = new AccountData("Khalil", "abc@gmail.com", 1000,"basic");
        Account basicAccount = new BasicAccount(accountData);
        basicAccount.deposit(500);
        float expected = 1500;
        Assert.assertEquals(expected, basicAccount.getBalance(), .01d);
    }

    @Test
    public void accountID(){
        AccountData accountData = new AccountData("Khalil", "abc@gmail.com", 1000,"basic");
        AccountData accountData2 = new AccountData("Aarti", "abc1@gmail.com", 1000,"basic");
        AccountData accountData3 = new AccountData("Sarah", "abc@gmail.com", 1000,"basic");
        Account basicAccount = new BasicAccount(accountData);
        Account basicAccount2 = new BasicAccount(accountData2);
        Account basicAccount3 = new BasicAccount(accountData3);
        int expected = 3;
        int actual = basicAccount3.getAccountData().getId();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void withdraw() {
        AccountData accountData = new AccountData("Khalil", "abc@gmail.com", 1000,"basic");
        Account savingsAccount = new SavingsAccount(accountData);
        savingsAccount.withdraw(350);
        float expected = 650;
        Assert.assertEquals(expected, savingsAccount.getBalance(), .01d);
    }

    @Test
    public void canWithdraw() {
        AccountData accountData = new AccountData("Khalil", "abc@gmail.com", 1000,"basic");
        Account savingsAccount = new SavingsAccount(accountData);
        boolean actual = savingsAccount.canWithdraw(5000);
        boolean actual2 = savingsAccount.canWithdraw(200);
        Assert.assertFalse(actual);
        Assert.assertTrue(actual2);
    }*/

    @Test
    public void getBalance() {
        AccountData test = new AccountData(1000, "Basic", "basic@gmail.com", 500, "basic");
        float expected = 500.00f;
        Account acc = new BasicAccount(test);
        Assert.assertEquals(expected,acc.getBalance(), 0.0);
    }
}