package com.zipcode.moneymanager.WebMVC.Repository;


import com.zipcode.moneymanager.WebMVC.Model.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface AccountRepo extends CrudRepository<Account,Long> {

}