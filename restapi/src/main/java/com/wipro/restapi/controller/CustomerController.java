package com.wipro.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.restapi.entity.CustomerEntity;
import com.wipro.restapi.repository.CustomerRepository;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {
	
	
	    @Autowired
	    private CustomerRepository repo;

	    @GetMapping
	    public List<CustomerEntity> getAll() {
	        return repo.findAll();
	    }

	    @GetMapping("/{id}")
	    public CustomerEntity getById(@PathVariable Long id) {
	        return repo.findById(id).orElse(null);
	    }

	    @PostMapping
	    public CustomerEntity save(@RequestBody CustomerEntity customer) {
	        return repo.save(customer);
	    }

	    @PutMapping("/{id}")
	    public CustomerEntity update(@PathVariable Long id, @RequestBody CustomerEntity customer) {
	      //  customer.setId(id);
	        return repo.save(customer);
	    }

	    @DeleteMapping("/{id}")
	    public void delete(@PathVariable Long id) {
	        repo.deleteById(id);
	    }
	}



