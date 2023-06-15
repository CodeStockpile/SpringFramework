package com.rest.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.rest.client.service.ClientService;

import ch.qos.logback.core.net.server.Client;

@SpringBootApplication
public class RestClientRestTemplateApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext cntxt = SpringApplication.run(RestClientRestTemplateApplication.class, args);
		PostRestTemplate service = cntxt.getBean(PostRestTemplate.class);
		service.postApi();
		  
	}

}
