package com.spring.stereotype.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StereotypeDemo {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/stereotype/annotations/stereotype.xml");

		Animal a = context.getBean("st",Animal.class);
		System.out.println(a);
		
		
	}

}
