package com.spring.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	
	private String name;
	
	// reference type object
	@Autowired
	@Qualifier("course2")
	private Course course;
	
	public Student() {
		super();
		System.out.println("Inside the no-args contructor !!");
	}
	
	
	public Student(Course course) {
		super();
		this.course = course;
		System.out.println("Inside the course contructor !!");
	}
	
	public Student(String name, Course course) {
		super();
		this.name = name;
		this.course = course;
		System.out.println("Inside the constructor !!!");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Course getCourse() {
		return course;
	}
	
	@Autowired
	@Qualifier("course1")
	public void setCourse(Course course) {
		this.course = course;
		System.out.println("Inside the setter method !");
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + "]";
	}
	
	
}
