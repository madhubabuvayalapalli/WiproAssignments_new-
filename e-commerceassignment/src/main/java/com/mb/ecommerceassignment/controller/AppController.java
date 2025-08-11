package com.mb.ecommerceassignment.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.mb.ecommerceassignment.model.Product;
import com.mb.ecommerceassignment.service.ProductService;

public class AppController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/home")
	public String showHomePage(Model model) {
		List<Product> productList = productService.getAllProducts();
		System.out.println(" Product lo "+productList.size());
		model.addAttribute("ProductList", productList);
		return "home";
	}
	@GetMapping("/addproduct")
	public String showAddCustomerPage(Model model) {
		Product c = new Product();
		model.addAttribute("customer", c);
		return "add-customer";
	}
	
	 @PostMapping("/saveproduct")
	    public String saveCustomer(@ModelAttribute("customer") Product product) {
	    	System.out.println(" inside save Product "+product);
	    	productService.save(product);
	    	
	    	return "redirect:/home";
	    }
	 @GetMapping("/edit/{id}")
	 public String showEditCustomer(Model model, @PathVariable Long id) {
		 Product product = productService.getCustomerById(id);
		 model.addAttribute("customer", customer);
		 return "edit-customer";
	 }
	 
	 @PostMapping("/update-customer")
	    public String updateCustomer(@ModelAttribute("customer") Product product) {
	    	System.out.println(" inside save Customer "+product);
	    	Product existingCustomer = productService.getCustomerById(product.getId());
	    	existingCustomer.setName(product.getName());
	    	existingCustomer.setCost(product.getCost());
	    	
	    	productService.saveProduct(existingCustomer);
	    	return "redirect:/home";
	    	
	    }
	 
	 @GetMapping("/delete/{id}")
	 public String showDeleteCustomer( @PathVariable Long id) {
		 Product product = productService.getCustomerById(id);
		 productService.deleteProduct(id);
		// model.addAttribute("customer", customer);
		 return "redirect:/home";

}
}
