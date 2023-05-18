package com.spring.basic;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import com.spring.jdbc.config.JdbcConfig;
import com.spring.jdbc.dao.EmployeeDao;
import com.spring.jdbc.entity.Employee;

@Configuration
public class JdbcApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
		
		EmployeeDao empDao = context.getBean("employeeDao", EmployeeDao.class);
		
		List<Employee> allEmp = empDao.getAllEmployee();
		
		for(Employee emp: allEmp) {
			System.out.println(emp);
		}

	}

}
