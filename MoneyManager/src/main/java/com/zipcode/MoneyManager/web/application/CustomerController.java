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
@RequestMapping(value="/customers")
public class CustomerController {

 private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public String getCustomers(Model model){
        List<Customer> customers = this.customerService.getCustomers();
        model.addAttribute("customers", customers);
        return "customers";
    }
}
