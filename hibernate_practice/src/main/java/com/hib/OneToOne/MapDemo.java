package com.hib.OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		
		Question q1 = new Question();
		q1.setQid(0);
		q1.setQuestion("What is hibernate");
		
		Answer ans = new Answer();
		ans.setAnsId(0);
		ans.setAnswer("Nothing");
		
		q1.setAns(ans);

		
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		// object operations
		session.save(q1);
		session.save(ans);
		
		tx.commit();
		// fetching ...
		
		Question fq = session.get(Question.class, 100);
		System.out.println(fq.getQuestion());
		System.out.println(fq.getAns().getAnswer());
		
		
		session.close();
		sf.close();
		

	}

}
