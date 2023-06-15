package com.rest.resource;

import java.util.Arrays;
import java.util.List;

import org.apache.catalina.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.models.Rating;
import com.rest.models.UserRating;

@RestController
@RequestMapping("/rating")
public class RatingResource {

	@RequestMapping("/{movieId}")
	public Rating getRating(@PathVariable("movieId") String movieId) {
		return new Rating(movieId, 9);
	}
	
	@RequestMapping("users/{userId}")
	public UserRating getUserRatings(@PathVariable("userId") String userId){
		List<Rating> ratings = Arrays.asList(
				new Rating("Sh101", 9),
				new Rating("DRSTR", 7),
				new Rating("A19", 8));
		
		UserRating userRating = new UserRating();
		userRating.setUserRating(ratings);
		
		return userRating;
	}
	
	
}
