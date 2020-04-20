package com.zipcode.MoneyManager.business.service;

import com.zipcode.MoneyManager.data.entity.Customer;
import com.zipcode.MoneyManager.data.repository.CustomerRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }



   public List<Customer> getCustomers(){
        Iterable<Customer> customers = this.customerRepository.findAll();
        List<Customer> customerList = new ArrayList<>();
       customers.forEach(customer->{customerList.add(customer);});
        customerList.sort(new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                if (o1.getLastName() == o2.getLastName()){
                    return o1.getFirstName().compareTo(o2.getFirstName());
                }
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });
        return customerList;
    }
}
