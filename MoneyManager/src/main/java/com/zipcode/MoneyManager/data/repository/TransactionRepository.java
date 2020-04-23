package com.zipcode.MoneyManager.data.repository;

import com.zipcode.MoneyManager.data.entity.Transaction;
import org.springframework.data.repository.CrudRepository;

public interface TransactionRepository extends CrudRepository<Transaction, Integer> {
}
