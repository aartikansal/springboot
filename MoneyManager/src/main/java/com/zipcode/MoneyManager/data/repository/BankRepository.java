package com.zipcode.MoneyManager.data.repository;

import com.zipcode.MoneyManager.data.entity.Bank;
import org.springframework.data.repository.CrudRepository;

public interface BankRepository extends CrudRepository<Bank, Integer> {
}

