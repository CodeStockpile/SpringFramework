package com.spring.basic;

/*
 * Bean is created using the configuration class
 * So,no need to declare @Component
 * 
 * */

public class Course {

	private String courseName;

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(String courseName) {
		super();
		this.courseName = courseName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	@Override
	public String toString() {
		return "Course [courseName=" + courseName + "]";
	}
	
	
}
