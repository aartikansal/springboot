package com.zipcode.moneymanager.WebMVC;

public class SavingsAccount extends Account {

    private double annualInterestRate = .02;

    public SavingsAccount(AccountData accountData) {
        super(accountData);
    }

    //adds the amount to the balance. Calculates total deposit amount
    public float calculateAnnualInterestRate() {
        float interestGained = (float) (getBalance() * annualInterestRate);
        return interestGained;
    }

    public void addInterestGainedToBalance() {

        deposit(calculateAnnualInterestRate());

    }
}
