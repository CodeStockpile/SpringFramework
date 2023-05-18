package com.spring.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RefTest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/ref/refConfig.xml");
		
		Laptop lap = (Laptop)context.getBean("laptop");
		System.out.println(lap);
		System.out.println(lap.getModel());
		System.out.println(lap.getBattery());

	}

}
