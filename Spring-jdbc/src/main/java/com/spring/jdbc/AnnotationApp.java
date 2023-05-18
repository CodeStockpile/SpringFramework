package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.jdbc.config.JdbcConfig;
import com.spring.jdbc.dao.EmployeeDao;
import com.spring.jdbc.entity.Employee;

public class AnnotationApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
		
		EmployeeDao empDao = context.getBean("employeeDao", EmployeeDao.class);
		
		List<Employee> allEmp = empDao.getAllEmployee();
		for(Employee emp: allEmp) {
			System.out.println(emp);
		}

	}

}
