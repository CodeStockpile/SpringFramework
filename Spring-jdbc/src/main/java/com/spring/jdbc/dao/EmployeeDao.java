package com.spring.jdbc.dao;

import java.util.List;

import com.spring.jdbc.entity.Employee;

public interface EmployeeDao {

	public int insert(Employee emp);
	public int updateEmployee(Employee emp);
	public int updateEmployeeName(int id, String name);
	public Employee getEmployees(int empId);
	public List<Employee> getAllEmployee();
	public int deleteEmployee(int empId);
	
}
