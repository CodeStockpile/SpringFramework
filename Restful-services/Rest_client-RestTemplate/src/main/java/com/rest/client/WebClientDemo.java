package com.rest.client;


import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class WebClientDemo {

	public void invokeRestApi() {
		
		Book book = new Book();
		
		WebClient webClient = WebClient.create();
		
		Book resp = webClient.post()
				.uri("")
				.body(BodyInserters.fromObject(book))
				.retrieve()
				.bodyToMono(Book.class)
				.block();
		
		
		
		
	}
	
	public void acceptData() {
		
	Book book = new Book();
		
		WebClient webClient = WebClient.create();
		
		Book resp = webClient.post()
				.uri("")
				.header("Content-Type", "application/json")
				.accept(MediaType.APPLICATION_JSON)
				.retrieve()
				.bodyToMono(Book.class)
				.block();
	}
}
