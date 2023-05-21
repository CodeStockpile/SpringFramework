package com.spring.orm.dao;

import org.hibernate.Session;
import org.springframework.orm.hibernate5.HibernateOperations;
import org.hibernate.SessionFactory;

import com.spring.orm.entities.Student;

import jakarta.transaction.Transactional;

public class StudentDao {
	
	private SessionFactory sessionFactory;

	
//	public int addStudent(Student student) {
//		
//        SessionFactory sessionFactory = ((SessionFactory) hibernateOperations);
//        Session session = sessionFactory.getCurrentSession();
//		//Integer id = (Integer) session.save(student);
//        
//        session.persist(student);
//        int id = student.getId();
//		return id;
//	}

	@Transactional
	public int addStudent(Student student) {
	    Session session = sessionFactory.getCurrentSession();
	    session.persist(student);
	    return student.getId();
	}

	@Transactional
	public Student getStudent(int id) {
		Session session = sessionFactory.getCurrentSession();
		Student student = session.get(Student.class, id);
		return student;
	}
	
	
	public SessionFactory getSessionFactory() {
	    return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
	    this.sessionFactory = sessionFactory;
	}


	
}
