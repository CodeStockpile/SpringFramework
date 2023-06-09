package com.spring.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {


	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/collections/beanConfig.xml");
		
		Employee emp = (Employee)context.getBean("employee");
		
		System.out.println(emp);
		System.out.println(emp.getContact());
		System.out.println(emp.getTech());
		System.out.println(emp.getExperience());
	}

}
