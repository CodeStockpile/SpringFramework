package com.spring.orm;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
         ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
         
         StudentDao std = context.getBean("studentDao", StudentDao.class);
         
         // Insert operation
         Student st = new Student("Samrat", 33);
         std.addStudent(st);
         
         
         // Update operation
         
       Student st2 = new Student(33,"Samrat Singh", 100);
       std.updateStudent(st2);
         
         
       // Delete Operation
       std.deleteStduent(14);
       
         // Read operation 
         
         Student student = std.getStudent(11);
         System.out.println(student);
         
         List<Student> all = std.getAllStudent();
         //System.out.println(all);
         for(Student s:all) {
        	 System.out.println(s);
         }
         
         
    }
}
