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

import com.wipro.restapi.entity.MovieEntity;
import com.wipro.restapi.repository.MovieRepository;

@RestController
@RequestMapping("/api/movie")
public class MovieController {

	 @Autowired
	    private MovieRepository repo;

	    @GetMapping
	    public List<MovieEntity> getAll() {
	        return repo.findAll();
	    }

	    @GetMapping("/{id}")
	    public MovieEntity getById(@PathVariable Long id) {
	        return repo.findById(id).orElse(null);
	    }

	    @PostMapping
	    public MovieEntity save(@RequestBody MovieEntity movie) {
	        return repo.save(movie);
	    }

	    @PutMapping("/{id}")
	    public MovieEntity update(@PathVariable Long id, @RequestBody MovieEntity movie) {
	      //  movie.setId(id);
	        return repo.save(movie);
	    }

	    @DeleteMapping("/{id}")
	    public void delete(@PathVariable Long id) {
	        repo.deleteById(id);
	    }
}
