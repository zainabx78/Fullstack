package com.sparta.northwind;

import com.sparta.northwind.entities.Customer;
import com.sparta.northwind.repository.CustomerRepository;
import com.sparta.northwind.services.CustomerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class NorthwindApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(NorthwindApplication.class, args);
// Concrete implementation of CustomerRepository using automatically created bean.
//        CustomerRepository customerRepository = context.getBean(CustomerRepository.class);
//
//        List<Customer> customers = customerRepository.findAll();
//
//        for(Customer customer : customers){
//            System.out.println(customer);
//        }


        CustomerService customerService = context.getBean(CustomerService.class);

// -----------------------------------------------------------------------------
// FOR TESTING PURPOSES, I CREATED A NEW CUSTOMER:

//        Customer zf = new Customer();
//        zf.setCustomerID("AAAAA");
//        zf.setCompanyName("Sparta Global");
//        zf.setContactName("Zainab F");
//
//        customerService.updateCustomer(zf);

//        customerService.deleteCustomerById("AAAAA");
//        customerService.saveCustomer(zf);
//
// --------------------------------------------------------------------------
        Customer customerToFind = customerService.getCustomerById("1");
        List<Customer> customers = customerService.getAllCustomers();
        System.out.println("For single customer: " + customerToFind);

        for (Customer x: customers) {
            System.out.println(x);
        }



    }

}
