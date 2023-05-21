package com.hib.pojo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class FetchData {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		Empployee emp = session.get(Empployee.class, 1);
		System.out.println(emp);		// print whole object
		
		Empployee emp1 = session.load(Empployee.class, 2);
		System.out.println(emp.getAge());		// print only age

	}

}
