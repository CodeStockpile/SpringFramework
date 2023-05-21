package com.hib.pojo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbeddableEx {

	public static void main(String[] args) {
		
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Empployee e1 = new Empployee();
		e1.setName("Farah");
		e1.setAge(80);
		//e1.setDob("2002/09/10");
		
		Job j1 = new Job();
		j1.setDesignation("Manager");
		j1.setSalary(20000);
		
		
		// create a session
		
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		// save the object
		session.save(e1);
		
		tx.commit();
		session.close();
		sf.close();

	}

}
