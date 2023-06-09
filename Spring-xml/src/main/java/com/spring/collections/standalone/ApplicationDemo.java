package com.spring.collections.standalone;

//import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationDemo {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/collections/standalone/beanConfig.xml");

		// for callin the destroy method ..
		context.registerShutdownHook();

		Employee emp = (Employee) context.getBean("employee");

		System.out.println(emp);
//		System.out.println(emp.getContact());
//		System.out.println(emp.getTech());
//		System.out.println(emp.getExperience());

		System.out.println("------------------------------------------");
		// get the reference type of "experience"
		System.out.println(emp.getExperience().getClass().getName());

		System.out.println("----- Second bean --------- ");
		DatabaseConfig db = context.getBean("database", DatabaseConfig.class);
		System.out.println(db);
		System.out.println(db.getProp());
	}

}
