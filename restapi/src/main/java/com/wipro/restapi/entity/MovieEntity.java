package com.wipro.restapi.entity;
import jakarta.persistence.JoinColumn;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
@Entity
public class MovieEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String genre;
    
    
    public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}


	public List<TheatreEntity> getTheatrs() {
		return theatrs;
	}


	public void setTheatrs(List<TheatreEntity> theatrs) {
		this.theatrs = theatrs;
	}


	@ManyToMany
    @JoinTable(
      name = "movie_theater", 
      joinColumns = @JoinColumn(name = "movie_id"), 
      inverseJoinColumns = @JoinColumn(name = "theater_id"))
    private List<TheatreEntity> theatrs;

}
