package com.zipcode.moneymanager.WebMVC.Service;



import com.zipcode.moneymanager.WebMVC.Model.AccountData;
import com.zipcode.moneymanager.WebMVC.Repository.AccountDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountService {
    @Autowired
    private AccountDataRepository accountDataRepository;

    public AccountData getAccountById(Integer id) {
        return accountDataRepository.findById(id).get();
    }

    public void updateAccount(AccountData accountData) {
        accountDataRepository.save(accountData);
    }

    public void deleteAccount(Integer accountID) {
        accountDataRepository.deleteById(accountID);
    }

    public void deposit(float amount, Integer id) {
        Optional<AccountData> accountData = accountDataRepository.findById(id);
        float balance = accountData.get().getBalance() + amount;
        accountData.get().setBalance(balance);
        accountDataRepository.save(accountData);

    }

    public boolean withdraw(int amount) {
        if (canWithdraw(amount)) {
            updateBalance(getBalance() - amount);
            return true;
        } else {
            return false;
        }
    }

    protected boolean canWithdraw(int amount) {
        return getBalance() >= amount;
    }

    public float getBalance() {
        return accountData.getBalance();
    }
}
