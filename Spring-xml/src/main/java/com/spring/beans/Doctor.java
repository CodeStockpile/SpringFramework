package com.spring.beans;

public class Doctor {
	
	private String name;
	private String speciality;
	private int age;
	
	
	
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Doctor(String name, String speciality, int age) {
		super();
		this.name = name;
		this.speciality = speciality;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Doctor [name=" + name + ", specility=" + speciality + ", age=" + age + "]";
	}
	
	
	
}
