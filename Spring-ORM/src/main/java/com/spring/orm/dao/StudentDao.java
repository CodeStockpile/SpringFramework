package com.spring.orm.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.orm.hibernate5.HibernateOperations;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

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
	
	@Transactional
	public List<Student> getAllStudent(){
		Session session = sessionFactory.getCurrentSession();
		Query<Student> query = session.createQuery("FROM Student",Student.class);
		List<Student> all = query.list();
		return all;
	}
	
	@Transactional
	public void updateStudent(Student student) {
        Session session = sessionFactory.getCurrentSession();
        session.merge(student);
    }
	
	@Transactional
	public void deleteStduent(int id) {
		Session session = sessionFactory.getCurrentSession();
		Student student = session.get(Student.class, id);
		System.out.println("\n ========== Stduent with id " + id +": " + student + " ============\n");
		if(student != null) {
			session.remove(student);
		}
	}

	
	public SessionFactory getSessionFactory() {
	    return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
	    this.sessionFactory = sessionFactory;
	}


	
}
