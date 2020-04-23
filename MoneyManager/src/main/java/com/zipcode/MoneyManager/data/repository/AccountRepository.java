package com.zipcode.MoneyManager.data.repository;

import com.zipcode.MoneyManager.data.entity.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CrudRepository<Account, Integer>{
}

