package com.spring.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class AutowireDemo {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/autowire/config.xml");
		
		Student st = context.getBean("student", Student.class);
		System.out.println(st);
		System.out.println(st.getCourse());
	}

}
