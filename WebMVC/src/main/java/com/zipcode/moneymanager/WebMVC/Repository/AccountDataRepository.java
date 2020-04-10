package com.zipcode.moneymanager.WebMVC.Repository;

import com.zipcode.moneymanager.WebMVC.Model.AccountData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountDataRepository extends CrudRepository<AccountData, Integer> {
    List<AccountData> findByEmail(String email);
    List<AccountData> findByAccountNumber(Integer accountNumber);
}
