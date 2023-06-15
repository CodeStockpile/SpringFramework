package com.rest.resource.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.resource.models.Movie;


@RestController
@RequestMapping("/movie") 
public class MovieResource {

	@RequestMapping("/{movieId}")
	public Movie getMovie(@PathVariable("movieId") String movieId) {
		
		return new Movie("Business talk", movieId);
	}
}
