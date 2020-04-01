package com.zipcode.moneymanager.WebMVC;


import org.junit.Test;

public class AccountTest {

    @Test
    public void getAccountData() {
        //AccountData expected = new AccountData(1000, "Basic", "basic@gmail.com", 500, "basic");
       // Account acc = new BasicAccount(expected);
        //Assert.assertEquals(expected, acc.getAccountData());

    }

    @Test
    public void deposit() {
    }

    @Test
    public void withdraw() {
    }

    @Test
    public void canWithdraw() {
    }

    @Test
    public void getBalance() {
        AccountData test = new AccountData(1000, "Basic", "basic@gmail.com", 500, "basic");
        float expected = 500.00f;
        //Account acc = new BasicAccount(test);
        //Assert.assertEquals(expected,acc.getBalance(), 0.0);
    }
}