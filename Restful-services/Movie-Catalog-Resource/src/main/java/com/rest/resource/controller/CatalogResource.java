package com.rest.resource.controller;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.rest.resource.models.Catalogue;
import com.rest.resource.models.Movie;
import com.rest.resource.models.Rating;
import com.rest.resource.models.UserRating;


@RestController
@RequestMapping("/catalog")
public class CatalogResource {
	


//	@GetMapping("catalog/{userId}")
//	public List<Catalogue> getCatalogue(@PathVariable("userId") String userId){
//		return Collections.singletonList(
//				new Catalogue("Sherlok", "Adventure", 9));
//	}
	
	
//	@RequestMapping("/{userId}")
//	public List<Catalogue> getCatalogue(@PathVariable("userId") String userId){
//		
//		// get all rated movie Ids
//		List<Rating> ratings = Arrays.asList(
//				new Rating("Sh101", 9),
//				new Rating("DRSTR", 7),
//				new Rating("A19", 8));
//		
//		RestTemplate rt = new RestTemplate();
////		 rt.getForObject("http://localhost:9001/movie/78", Movie.class);
//		
	
//	// for each movie call movie info service and get details
//	
//	
//	//put them all together
//		return ratings.stream().map(rating-> {
//	    Movie movie = rt.getForObject("http://localhost:9001/movie/" + rating.getMovieId(), Movie.class);
//				return new Catalogue(movie.getName(), "Adventure", rating.getRating());
//				}).collect(Collectors.toList());
//		

		
	@Autowired
	private WebClient.Builder webClientBuilder;
	
	@Autowired
	private RestTemplate rt;
	
	@RequestMapping("/{userId}")
	public List<Catalogue> getCatalogue(@PathVariable("userId") String userId){
		
		// get all rated movie Ids
		UserRating ratings = rt.getForObject("http://localhost:9000/rating/users/" + userId, UserRating.class);

		// for each movie call movie info service and get details
		//put them all together
		return ratings.getUserRating().stream().map(rating-> {
			Movie movie = webClientBuilder.build()
							.get()
							.uri("http://localhost:9001/movie/" + rating.getMovieId())
							.retrieve()
							.bodyToMono(Movie.class)
							.block();
							
				return new Catalogue(movie.getName(), "Adventure", rating.getRating());
				}).collect(Collectors.toList());

	}

/*	
	@Autowired
	private RestTemplate rt;
	
	@RequestMapping("/{userId}")
	public List<Catalogue> getMovieCatalogue(@PathVariable("userId") String userId){
		
		// get all rated movie Ids
		UserRating ratings = rt.getForObject("http://localhost:9000/rating/users/" + userId, UserRating.class);

		// for each movie call movie info service and get details
		//put them all together
		return ratings.getUserRating().stream().map(rating-> {
			Movie movie = rt.getForObject("http://localhost:9001/movie/" + rating.getMovieId(), Movie.class);
							
				return new Catalogue(movie.getName(), "Adventure", rating.getRating());
				}).collect(Collectors.toList());
	
	}
	
	*/
}

