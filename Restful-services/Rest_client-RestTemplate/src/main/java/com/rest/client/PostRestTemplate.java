package com.rest.client;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class PostRestTemplate {
	private final String REST_ENDPOINT_URL = "http://localhost:9090/book";
	
	public void postApi() {
		
		Book book = new Book();
		book.setAuthor("RDX");
		book.setIsbn(9087);
		book.setName("Poli");
		
		
		System.out.println(book);
		
		HttpHeaders headers = new HttpHeaders(); 
		headers.add("Accept", "application/json");
		headers.add("Content-Type", "application/json");
		
		HttpEntity<Book> reqEntity = new HttpEntity<>(book, headers);
		
		RestTemplate rt = new RestTemplate();
		ResponseEntity<Book> entity = rt.postForEntity("http://localhost:9090/book", reqEntity, Book.class);
		
		if(entity.getStatusCode().value() == 201) {
			Book body = entity.getBody(); // converter is happening from object to json 
			System.out.println(body);
		}
	}
}
