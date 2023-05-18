package com.spring.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class AutowireDemo {
	
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/spring/autowire/annotation/config.xml");
		
		context.registerShutdownHook();
		
		Student st = context.getBean("student", Student.class);
		System.out.println(st);
		System.out.println(st.getCourse());
	}

}
