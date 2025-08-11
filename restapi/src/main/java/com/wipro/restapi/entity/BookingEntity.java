package com.wipro.restapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class BookingEntity {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String bookingDate;
	    private int seats;

	    @ManyToOne
	    @JoinColumn(name = "movie_id")
	    private MovieEntity movie;

	    @ManyToOne
	    @JoinColumn(name = "theater_id")
	    private TheatreEntity theater;

	    @ManyToOne
	    @JoinColumn(name = "customer_id")
	    private CustomerEntity customer;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getBookingDate() {
			return bookingDate;
		}

		public void setBookingDate(String bookingDate) {
			this.bookingDate = bookingDate;
		}

		public int getSeats() {
			return seats;
		}

		public void setSeats(int seats) {
			this.seats = seats;
		}

		public MovieEntity getMovie() {
			return movie;
		}

		public void setMovie(MovieEntity movie) {
			this.movie = movie;
		}

		public TheatreEntity getTheater() {
			return theater;
		}

		public void setTheater(TheatreEntity theater) {
			this.theater = theater;
		}

		public CustomerEntity getCustomer() {
			return customer;
		}

		public void setCustomer(CustomerEntity customer) {
			this.customer = customer;
		}

	    
}
