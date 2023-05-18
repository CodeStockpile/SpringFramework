package com.spring.autowire.annotation;

public class Course {
	
	private String name;

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Course [name=" + name + "]";
	}
	
	public void init() {
		System.out.println("Bean initialized...");
	}
	
	public void destroy() {
		System.out.println("Bean destroyed ...! ");
	}
}
