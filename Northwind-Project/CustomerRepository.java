package com.sparta.northwind.repository;

import com.sparta.northwind.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(exported = false) // disables auto endpoint generation for our repository.
public interface CustomerRepository  extends JpaRepository<Customer, String> {
}
