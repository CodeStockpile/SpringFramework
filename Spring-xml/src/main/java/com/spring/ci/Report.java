package com.spring.ci;

public class Report {
	
	private int id;
	private String testName;
	private Person person;
	public Report() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Report(int id, String testName, Person person) {
		super();
		this.id = id;
		this.testName = testName;
		this.person = person;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	@Override
	public String toString() {
		return "Report [id=" + id + ", testName=" + testName + ", person=" + person + "]";
	}
	
	
	

}
