package com.zipcode.moneymanager.WebMVC.Service;

import com.zipcode.moneymanager.WebMVC.Model.Account;
import com.zipcode.moneymanager.WebMVC.Repository.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountService {

    @Autowired
    private AccountRepo accountRepo;

    public List<Account> getAllAccounts() {
        List<Account> allAccounts = new ArrayList<>();
        accountRepo.findAll()
                .forEach(allAccounts::add);
        return allAccounts;
    }

    public Account getAccountByID(Long id){
        return accountRepo.findById(id).get();
    }

    public Account create(Account account){
        return accountRepo.save(account);
    }

    public Account deposit(Long id, Double depositAmount){
        Account account = accountRepo.findById(id).get();
        if(depositAmount > 0) {
            account.setBalance(account.getBalance() + depositAmount);
        }
        return accountRepo.save(account);
    }

    public Account withdrawal(Long id, Double withdrawalAmount){
        Account account = accountRepo.findById(id).get();
        if(withdrawalAmount < account.getBalance()){
            account.setBalance(account.getBalance() - withdrawalAmount);
        }
        return accountRepo.save(account);
    }

    public void deleteAccount(Long id) {
        accountRepo.deleteById(id);
    }

    public Account transfer(Long id, Long transferID, Double transferAmount){
        Account account = accountRepo.findById(id).get();
        Account transferAccount = accountRepo.findById(transferID).get();
        if(account.getBalance() > transferAmount){
            account.setBalance(account.getBalance() - transferAmount);
            transferAccount.setBalance(transferAccount.getBalance() + transferAmount);
        }
        return account;
    }





}

