package com.zipcode.MoneyManager.data.repository;

import com.zipcode.MoneyManager.data.entity.Customer;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer>{

}
