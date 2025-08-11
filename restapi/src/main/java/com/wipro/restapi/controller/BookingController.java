package com.wipro.restapi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.restapi.entity.BookingEntity;
import com.wipro.restapi.repository.BookingRepository;
import com.wipro.restapi.service.BookingService;

@RestController
@RequestMapping("/api")

public class BookingController {
	private BookingService bookingService;
	private BookingRepository bookingRepo; 
	
	@GetMapping
	 public List<BookingEntity> getAll() {
	        return bookingRepo.findAll();
	    }

	    @GetMapping("/{id}")
	    public BookingEntity getById(@PathVariable Long id) {
	        return bookingRepo.findById(id).orElse(null);
	    }

	    @PostMapping
	    public BookingEntity createBooking(@RequestBody BookingEntity booking) {
	        return bookingRepo.save(booking);
	    }

	    @PutMapping("/{id}")
	    public BookingEntity update(@PathVariable Long id, @RequestBody BookingEntity booking) {
	    
	        return bookingRepo.save(booking);
	    }

	    @DeleteMapping("/{id}")
	    public void delete(@PathVariable Long id) {
	        bookingRepo.deleteById(id);
	    }

}
