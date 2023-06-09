package com.spring.jdbc.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.jdbc.dao.EmployeeDao;
import com.spring.jdbc.entity.Employee;

@Component("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private JdbcTemplate template;

	// Setter is necessary as default injection is setter
//	@Autowired
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	// insert new record of employee
	public int insert(Employee emp) {
		String query = "INSERT INTO employee(name, age, course) VALUES(?,?,?)";
		int result = this.template.update(query, emp.getName(), emp.getAge(), emp.getCourse());
		return result;
	}

	// update employee`s all details
	public int updateEmployee(Employee emp) {
		String query = "UPDATE employee set name=?, age =?, course=? where id=?";
		int result = this.template.update(query, emp.getName(), emp.getAge(), emp.getCourse(), emp.getId());

		return result;
	}

	// update only name
	public int updateEmployeeName(int id, String name) {
		String query = "update employee set name=? where id =?";
		int res = this.template.update(query,name, id);
		return res;
	}

	// delete one employee
	public int deleteEmployee(int empId) {
		String query = "DELETE FROM employee WHERE id = ? ";
		int res = this.template.update(query,empId);
		return res;
	}

	// Select only one employee
		public Employee getEmployees(int empId) {
			String query = "select * from employee where id= ?";
			RowMapper<Employee> rm = new RowMapperImpl();
			
			Employee employee = this.template.queryForObject(query, rm, empId);
			return employee;
		}
	
	// Select all employees
	public List<Employee> getAllEmployee() {
		String query = "SELECT * from employee";
		RowMapper<Employee> rowMapper = new RowMapperImpl();
		List<Employee> empolyees = this.template.query(query,rowMapper);
		return empolyees;
	}



}
