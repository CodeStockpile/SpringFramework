package com.spring.bean.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/* Note :
 * All Beans are created first and then destroyed one by one. 
 * 
 * */

public class LifecycleDemo {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/spring/bean/lifecycle/spring.xml");

		Car car = (Car)context.getBean("car");
		System.out.println(car);
		System.out.println(car.getName());
		System.out.println(car.getPrice());
		
		// for destroy method
		context.registerShutdownHook();
		
		// interface 
		UsingInterface ui =(UsingInterface)context.getBean("ui");
		System.out.println(ui);
		
		// using annotaions
		AnnotationEx an = (AnnotationEx) context.getBean("an");
		System.out.println(an);
		
		AnnotationEx an2 = context.getBean("an",AnnotationEx.class);
		System.out.println(an);
	}

}
