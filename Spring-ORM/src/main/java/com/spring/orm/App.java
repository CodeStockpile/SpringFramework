package com.spring.orm;

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
//         Student st = new Student(11,"Demo909n", 93);
//         std.addStudent(st);
         
          // Read operation 
         
         Student student = std.getStudent(11);
         System.out.println(student);
    }
}
