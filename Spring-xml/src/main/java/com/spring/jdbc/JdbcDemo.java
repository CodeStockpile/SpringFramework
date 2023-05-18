package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcDemo {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/jdbc.xml");
		
		JdbcTemplate temp = context.getBean("jdbcTemplate",JdbcTemplate.class);
		
		// insert query
		String query = "insert into employee(name, age, course) values(?,?,?)";
		
		// executing the query
		int result = temp.update(query,"Jitu",90, "BCA");
		System.out.println("rows affected :"+ result);
	}

}

