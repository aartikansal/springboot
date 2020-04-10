package com.zipcode.moneymanager.WebMVC.Controller;

import com.zipcode.moneymanager.WebMVC.Exceptions.AccountNotFound;
import com.zipcode.moneymanager.WebMVC.Model.AccountData;
import com.zipcode.moneymanager.WebMVC.Repository.AccountDataRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("accounts")


public class AccountsController {
    private final AccountDataRepository repo;
    public AccountsController(AccountDataRepository repo) {
        this.repo = repo;
    }


    public String getAccount(){
        return repo.findById(1).get().toString();
    }


}
