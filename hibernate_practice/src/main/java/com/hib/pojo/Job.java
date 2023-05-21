package com.hib.pojo;

import javax.persistence.Embeddable;

@Embeddable
public class Job {
	
	private String designation;
	private int salary;
	
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	

}
