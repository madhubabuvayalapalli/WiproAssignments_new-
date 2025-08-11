package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.TicketService;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ct=new ClassPathXmlApplicationContext("beans.xml");
		
	      TicketService ticketService = (TicketService) ct.getBean("ticketService");

	        // Test bookings
	        System.out.println(ticketService.confirmBooking("FL123", "USER456")); // Booking confirmed
	        System.out.println(ticketService.confirmBooking("FL123", "USER789")); // Booking confirmed
	        System.out.println(ticketService.confirmBooking("FL123", "USER000")); // Flight full
	        System.out.println(ticketService.confirmBooking("FL456", "USER111")); // Flight full

	}

}
