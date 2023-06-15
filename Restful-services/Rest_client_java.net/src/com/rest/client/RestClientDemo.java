package com.rest.client;


import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


/*
 * for creating a basic rest client:
 * we need : 
 * 		Rest Endpoint : http://localhost
 * 		Resource url : "/home"
 * 		resource method : get, post, etc ..
 * 
 * */

public class RestClientDemo {
	public static void main(String[] args) {
		
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
