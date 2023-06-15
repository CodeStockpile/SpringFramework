
package com.hateos.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hateos.entity.Book;

import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController

public class SwaggerControllerDemo {

	@ApiResponses(value= {
			@ApiResponse(responseCode = "201", description="Method invoked"),
			@ApiResponse(responseCode = "200", description="Method invoked")
	})
	@GetMapping(value="/getBook", produces={"application/json", "application/xml"})
	public Book getBook() {
		Book book = new Book(101, "Merchant of Venice", "Shakespear");
		Link link = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder
											.methodOn(BookController.class)
											.getAllBooks()).withRel("all-books");
		book.add(link);
		
		return book;
	}
	
	@GetMapping(value="/getBooks", produces={"application/json", "application/xml"})
	public List<Book> getAllBooks() {
		Book book1 = new Book(101, "Merchant of Venice", "Shakespear");
		Book book2 = new Book(102, "Merchant of Venice", "Shakespear");
		Book book3 = new Book(103, "Merchant of Venice", "Shakespear");
		Book book4 = new Book(104, "Merchant of Venice", "Shakespear");
		
		List<Book> list =new ArrayList<Book>();
		list.add(book1);
		list.add(book2);
		list.add(book3);
		list.add(book4);
		
		return list;
	}
	
}
