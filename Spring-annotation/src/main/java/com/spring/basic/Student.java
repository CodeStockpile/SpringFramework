package com.spring.basic;

import org.springframework.stereotype.Component;

/*
 * Bean is created using the configuration class
 * So,no need to declare @Component
 */

//@Component("student")

public class Student {
	  
	private String name;
	private int age;
	
	private Course course;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	// Constructor injection
	
	public Student(String name, int age, Course course) {
		super();
		this.name = name;
		this.age = age;
		this.course = course;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", course=" + course + "]";
	}
	
}
