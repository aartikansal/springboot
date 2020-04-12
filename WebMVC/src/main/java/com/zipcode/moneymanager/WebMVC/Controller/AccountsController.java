package com.zipcode.moneymanager.WebMVC.Controller;

import com.zipcode.moneymanager.WebMVC.Exceptions.AccountNotFound;
import com.zipcode.moneymanager.WebMVC.Model.AccountData;
import com.zipcode.moneymanager.WebMVC.Repository.AccountDataRepository;
import com.zipcode.moneymanager.WebMVC.Service.AccountService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

    public class AccountsController {
        private final AccountService repo;
        public AccountsController(AccountService repo) {
            this.repo = repo;
        }

        @RequestMapping("/accounts")
        public List<AccountData> getAllAccounts(){
            return repo.getAllAccounts();
        }


    }
