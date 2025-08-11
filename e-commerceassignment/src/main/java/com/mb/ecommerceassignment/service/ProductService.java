package com.mb.ecommerceassignment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mb.ecommerceassignment.model.Product;
import com.mb.ecommerceassignment.repository.ProductServiceRepo;

@Service
public class ProductService {
	@Autowired
	private ProductServiceRepo productservicerepo;
	
	public  void save(Product product)
	{
		productservicerepo.save(product);
	}
	
	public List getAllProducts()
	{
		return productservicerepo.findAll();
	}
	
	public Product getCustomerById(Long id)
	{
		return productservicerepo.getReferenceById(id);	
	}
	
	public void deleteProduct(Long id)
	{
		productservicerepo.deleteById(id);
	}

}
