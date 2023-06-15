package com.rest.client.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.rest.client.Book;

@Service
public class ClientService {
	public static String getMsg(String name, String msg) {

		String url = "http://localhost:9090/welcome/{name}/{msg}";

		RestTemplate rt = new RestTemplate();
		ResponseEntity<String> response = rt.getForEntity(url, String.class, name, msg);
		int statusCode = response.getStatusCode().value();
		System.out.println(statusCode);

		if (response != null && statusCode == 200) {

			System.out.println(response.getBody());
			return response.getBody();
		}
		return null;
	}
	
	public static void getBook() {

		RestTemplate template = new RestTemplate();
		String url = "http://localhost:9090/book";

		// retrieving as Object
		ResponseEntity<Book> entity = template.getForEntity(url, Book.class);

		// Object can be printed as String

//		ResponseEntity<String> entity = template.getForEntity(url, String.class);
		int status = entity.getStatusCode().value();

		if (status == 200) {
			System.out.println(entity.getBody());
		}else {
			System.out.println("Status code : "+ status );
		}
	}
}
