package com.spring.jdbc.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdbc.dao.EmployeeDao;
import com.spring.jdbc.dao.impl.EmployeeDaoImpl;

@Configuration
public class JdbcConfig {

	@Bean("dataSource")
	public DataSource getDataSource() {
		
		DriverManagerDataSource driverManager = new DriverManagerDataSource();
		driverManager.setDriverClassName("com.mysql.cj.jdbc.Driver");
		driverManager.setUrl("jdbc:mysql://localhost:3306/citius");
		driverManager.setUsername("root");
		driverManager.setPassword("QAZwsx1234");
		return driverManager;
	}
	
	@Bean("template")
	public JdbcTemplate getJdbcTemplate() {
		
		JdbcTemplate template = new JdbcTemplate();
		template.setDataSource(getDataSource());		
		return template;
	}
	
	// ------- Instead of this we can write @Autowired in EmployeeDaoImpl class on
	// at JdbcTemplate member variable
	
	@Bean("employeeDao")
	public EmployeeDao getEmployeeDao() {
		EmployeeDaoImpl emp = new EmployeeDaoImpl();
		emp.setTemplate(getJdbcTemplate());
		return emp;
	}
}
