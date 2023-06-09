package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.beans.Doctor;
import com.spring.beans.Triangle;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        
        Triangle tr = (Triangle) context.getBean("triangle");
        tr.draw();
        
        
        // setter injection
        
        Doctor dr = (Doctor) context.getBean("doctor");
        System.out.println(dr);
        
        Doctor dr2 = (Doctor) context.getBean("doctor2");
        System.out.println(dr2);
        
        Doctor dr3 = (Doctor) context.getBean("doctor3");
        System.out.println(dr3); 
        
        // OR
        
        Doctor dr4 = context.getBean("doctor3", Doctor.class);
        System.out.println(dr4); 
    }
} 
