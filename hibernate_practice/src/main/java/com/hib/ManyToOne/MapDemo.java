package com.hib.ManyToOne;

import java.util.ArrayList;
import java.util.List;

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
		
		Answer ans1 = new Answer();
		ans1.setAnsId(0);
		ans1.setAnswer("Something");
		
		Answer ans2 = new Answer();
		ans2.setAnsId(0);
		ans2.setAnswer("Everything");
		
		List<Answer> answers = new ArrayList();
		answers.add(ans);
		answers.add(ans1);
		answers.add(ans2);
		
		q1.setAns(answers);
		
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		// object operations
		session.save(q1);
		session.save(ans);
		
		
		// fetching ...
		
		Question fq = session.get(Question.class, 100);
		
		for(Answer a :fq.getAns()) {
			System.out.println(a.getAnswer());
		}
		
		tx.commit();
		
		session.close();
		sf.close();
			

	}

}
