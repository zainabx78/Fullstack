package com.sparta.northwind.controllers;


import com.sparta.northwind.entities.Customer;
import com.sparta.northwind.services.CustomerService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")

// Point of a controller is only to call a method.

public class CustomerController {

    private final CustomerService service;

    public CustomerController(CustomerService service) {
        this.service = service;
    }

    // First GET request --> get list of all customers.
    @Operation(summary = "Get all customers", description = "Retrieve a list of all customers" )
    @GetMapping(value = "/")
    public ResponseEntity<List<Customer>> getAllCustomers() { // returning the response not just list (headers, status codes etc)
        List<Customer> customers = service.getAllCustomers();
        return ResponseEntity.ok(customers); // returns ok status code

    }
    @Operation(summary = "Get customer by ID", description = "Retrieve a customer from the database")
    @GetMapping("/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable String id) {
        Customer customer = service.getCustomerById(id);
        if (customer != null) {
            return ResponseEntity.ok(customer);
        }
        else  {
            return ResponseEntity.notFound().build();  // returns 404 not found with no body.
        }
    }

    @Operation(summary = "Add a new customer", description = "Create a new customer in the database")
    @PostMapping
    public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer) {
        Customer savedCustomer = service.saveCustomer(customer); // save customer as java object
        return ResponseEntity.status(201).body(savedCustomer); // changing it to a json object, wrapped in response entity, code as 201
    }

    @Operation ( summary = "Delete customer", description = "Delete customer in database ")
    @DeleteMapping("/{id}")
    public ResponseEntity<Customer> deleteCustomer(@PathVariable String id) {
        service.deleteCustomerById(id);
        return ResponseEntity.noContent().build();
    }

    // Update
    @Operation(summary = "Update existing customer", description = "Update customer details in the database")
    @PutMapping("/{id}")
    public ResponseEntity<Customer> updateCustomer(@PathVariable String id, @RequestBody Customer customer) {
        // Make sure the path ID is set on the customer object
        customer.setCustomerID(id);

        Customer updatedCustomer = service.updateCustomer(customer);
        return ResponseEntity.ok(updatedCustomer);
    }








}
