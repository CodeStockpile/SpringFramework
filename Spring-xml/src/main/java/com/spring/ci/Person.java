package com.spring.ci;

public class Person {
	
	private String name;
	private int personId;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, int personId) {
		super();
		this.name = name;
		this.personId = personId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", personId=" + personId + "]";
	}
	
	

}
