package com.spring.basic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import org.springframework.context.annotation.Configuration;
/*
 * As the bean is explicitly declared in this file so no need of @ComponentScan
 * 
 */

// @ComponentScan(basePackages = "com.spring")

@Configuration
public class SpringConfiguration {

	
	@Bean(name={"course"})
	public Course getCourse() {
		return new Course("BCA");
	}
	
	@Bean(name= {"student","scholar"})
	public Student getStudent() {
		return new Student("Rohan", 23, getCourse());
	}
}
