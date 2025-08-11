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

import com.wipro.restapi.entity.TheatreEntity;
import com.wipro.restapi.repository.TheatreRepository;

@RestController
@RequestMapping("api/theatre")
public class TheatreController {
	   @Autowired
	    private TheatreRepository repo;

	    @GetMapping
	    public List<TheatreEntity> getAll() {
	        return repo.findAll();
	    }

	    @GetMapping("/{id}")
	    public TheatreEntity getById(@PathVariable Long id) {
	        return repo.findById(id).orElse(null);
	    }

	    @PostMapping
	    public TheatreEntity save(@RequestBody TheatreEntity theater) {
	        return repo.save(theater);
	    }

	    @PutMapping("/{id}")
	    public TheatreEntity update(@PathVariable Long id, @RequestBody TheatreEntity theater) {
	       // theater.setId(id);
	        return repo.save(theater);
	    }

	    @DeleteMapping("/{id}")
	    public void delete(@PathVariable Long id) {
	        repo.deleteById(id);
	    }

}
