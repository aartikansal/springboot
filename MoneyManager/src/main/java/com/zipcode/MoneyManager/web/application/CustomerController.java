package com.zipcode.MoneyManager.web.application;

import com.zipcode.MoneyManager.business.service.CustomerService;
import com.zipcode.MoneyManager.data.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class CustomerController {

 private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/customers")
    public String getCustomers(Model model){
        List<Customer> customers = this.customerService.getCustomers();
        System.out.println("Size of customer list in CustomerController is -->"+customers.size());
        for(int i = 0; i < customers.size(); i++) {
            System.out.println(customers.get(i).getFirstName());
        }

        model.addAttribute("customers", customers);
        return "customers";
    }
}
