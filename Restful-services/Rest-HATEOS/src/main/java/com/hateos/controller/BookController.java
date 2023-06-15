package com.hateos.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hateos.entity.Book;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class BookController {

	
	@GetMapping(value="/book", produces={"application/json", "application/xml"}) // setting the data accept method to xml format
	public Book getBook() {
		Book book = new Book(101, "Merchant of Venice", "Shakespear");
		Link link = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder
											.methodOn(BookController.class)
											.getAllBooks()).withRel("all-books");
		book.add(link);
		
		return book;
	}
	
	@GetMapping(value="/books", produces={"application/json", "application/xml"})
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
	
	@PostMapping(value="/book", 
			produces={"application/json", "application/xml"},
			consumes = {"application/json", "application/xml"})
	public ResponseEntity <Book> setBook(@RequestBody Book book) {
		System.out.println(book);
		
		Book book2 = new Book();
		book2.setAuthor(book.getAuthor());
		book2.setIsbn(book.getIsbn());
		book2.setName(book.getName());
		
		System.out.println(book2);
		return new ResponseEntity<>(book, HttpStatus.CREATED);
	}
	
	@GetMapping(value="/welcome/{name}/{msg}", 
			produces="application/json",
			consumes = "application/json")
	public ResponseEntity <String> welcome(@PathVariable("name") String name, @PathVariable("msg") String msg) {
		 String text = "Hello !" + name +"\n" + msg;
		return new ResponseEntity<>(text, HttpStatus.CREATED);
	}
	
	
}
