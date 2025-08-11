package com.wipro.restapi.service;

import org.springframework.stereotype.Service;

import com.wipro.restapi.entity.BookingEntity;
import com.wipro.restapi.repository.BookingRepository;

@Service
public class BookingServiceImpl {
    private BookingRepository bookingRepository;
    
    
    public void save(BookingEntity booking)
    {
    	bookingRepository.save(null);
    }
    
    
}
