package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.dao.EmployeeDao;
import com.spring.jdbc.entity.Employee;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/jdbc.xml");
       
        EmployeeDao empDao = context.getBean("employeeDao",EmployeeDao.class);
        
        
//        int rowsAffected = empDao.deleteEmployee(3);
//        System.out.println(rowsAffected);
        
//        Employee emp1 = empDao.getEmployees(1);
//        System.out.println(emp1);
        
        
        
//        int rowsAffected2 = empDao.updateEmployeeName(3, "Akas");
//        System.out.println(rowsAffected2);
        
        
        Employee emp = new Employee();
        emp.setName("Jogindar");
        emp.setAge(29);
        emp.setCourse("Bsc");
        
        int rowsAffected = empDao.insert(emp);
        
        
//        Employee emp2 = new Employee();
//        emp2.setName("Dhirendarr");
//        emp2.setAge(29);
//        emp2.setCourse("B.Com");
//        emp2.setId(3);
//        int rowsAffected = empDao.updateEmployee(emp2);
//        System.out.println(rowsAffected);
        
        
        // ---- get all employees ---------
        List<Employee> ems = empDao.getAllEmployee();
        for(Employee em: ems) {
        	System.out.println(em);
        }
        
    }
}
