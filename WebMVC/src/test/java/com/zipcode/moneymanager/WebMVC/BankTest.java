package com.zipcode.moneymanager.WebMVC;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class BankTest {
    @Test
    public void addAccount(){
        Bank bank = new Bank();
        bank.addAccount("Aarti", "abc1@gmail.com", 1000,"basic");
        bank.addAccount("Khalil", "abc1@gmail.com", 1000,"basic");
        Integer actual = bank.getAccounts().size();
        Integer expected = 2;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void findById(){
        Bank bank = new Bank();
        bank.addAccount("Khalil", "abc1@gmail.com", 1000,"basic");
        bank.addAccount("Aarti", "abc12@gmail.com", 1000,"basic");
        bank.addAccount("Lisa", "abc3@gmail.com", 1000,"basic");
        String expectedEmail = "abc12@gmail.com";
        String actualEmail = bank.getAccountById(2).getAccountData().getEmail();
        String differentEmail = bank.getAccountById(3).getAccountData().getEmail();
        Assert.assertEquals(expectedEmail,actualEmail);
        Assert.assertNotEquals(differentEmail, expectedEmail);
    }
}
