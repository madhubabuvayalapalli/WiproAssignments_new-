package com.mb.ecommerceassignment.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mb.ecommerceassignment.model.Product;



@Repository
public interface ProductServiceRepo extends JpaRepository<Product, Long> {

}
