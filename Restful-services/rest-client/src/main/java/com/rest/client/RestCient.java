package com.rest.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rest.client.model.Book;

public class RestCient {

	public static void makePostrequest() {

		 try {
			URL url = new URL("http://localhost:9090/book");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("POST");
			
			// setting the headers
			conn.setRequestProperty("Content-Type", "application/json"); // for sending the request
			conn.setRequestProperty("Accept", "application/xml"); // for taking response
			
			System.out.println("----- Connection Set ----");
			
			// set data to request body
			Book book = new Book();
			book.setAuthor("Surjeet");
			book.setIsbn(12321);
			book.setName("Magic of mind");
			
			
			System.out.println("--------- Converting to json .... -------------");
			
			// converting java object to json
			
			ObjectMapper mapper = new ObjectMapper();
			String jsonData = mapper.writeValueAsString(book);
			
			System.out.println(jsonData);
			
			conn.setDoOutput(true);
			OutputStream os = conn.getOutputStream();
			os.write(jsonData.getBytes());
			
			// get response status code
			
			int responseCode = conn.getResponseCode();
			
			System.out.println("Response code : " + responseCode);
			if(responseCode == 201) {
				System.out.println("Inside if ...");
				
				InputStream inputStream = conn.getInputStream();
				InputStreamReader isr = new InputStreamReader(inputStream);
				BufferedReader bufferedReader = new BufferedReader(isr); 
				
				String line = bufferedReader.readLine();
				
				while(line != null) {
					System.out.println(line);
					line = bufferedReader.readLine();
				}
				conn.disconnect();
				
			}
					
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	/*
	 * for creating a basic rest client:
	 * we need : 
	 * 		Rest Endpoint : http://localhost
	 * 		Resource url : "/home"
	 * 		resource method : get, post, etc ..
	 * 
	 * */
	
	
	public static void makeGetRequest() {
		try {
			// setting url
			URL url = new URL("http://localhost:9090/book");
			
			// opening connection
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			
			//getting the status code
			int httpStatusCode = conn.getResponseCode();
			System.out.println(httpStatusCode);
			if(httpStatusCode ==200) {
				InputStream is = conn.getInputStream();
				InputStreamReader isr = new InputStreamReader(is);
				
				BufferedReader buffer = new BufferedReader(isr);
				
				String line = buffer.readLine();
				
				while(line != null) {
					System.out.println(line);
					line = buffer.readLine();
				}
				conn.disconnect();
			}
				
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
