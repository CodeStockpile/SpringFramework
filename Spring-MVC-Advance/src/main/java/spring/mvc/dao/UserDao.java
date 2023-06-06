package spring.mvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import spring.mvc.entity.User;

@Repository
public class UserDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	// required annotation for database operations
	@Transactional
	public int createUser(User user) {
		
		int id = (Integer)this.hibernateTemplate.save(user);
		return id;
	}
}
