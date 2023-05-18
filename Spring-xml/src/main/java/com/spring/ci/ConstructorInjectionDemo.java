package com.spring.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorInjectionDemo {

	public static void main(String[] args) {
		
		ApplicationContext context =new ClassPathXmlApplicationContext("com/spring/ci/spring.xml");
		
		Report rp = (Report) context.getBean("report");
		System.out.println(rp);
		System.out.println(rp.getPerson());
		
		// Multiplication mul =(Multiplication) context.getBean("mul");
		
		// OR
		Multiplication mul = context.getBean("mul",Multiplication.class);

		System.out.println(mul);
		System.out.println(mul.sum());
		
		System.out.println(mul.multiply(12, 12));

	}

}
