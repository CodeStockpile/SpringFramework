/**
 * 
 */
package spring.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.mvc.dao.UserDao;
import spring.mvc.entity.User;

/**
 * @author Surjeet Kumar
 *
 */

@Service
public class UserService {
	
	@Autowired 
	private UserDao userDao;
	
	public int saveUser(User user) {
		return this.userDao.createUser(user);
	}
}
