package com.spring.collections.standalone;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean , DisposableBean{
	
	private String name;
	private List<String> contact;
	private Set<String> tech;
	private Map<String, Integer> experience;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, List<String> contact, Set<String> tech, Map<String, Integer> experience) {
		super();
		this.name = name;
		this.contact = contact;
		this.tech = tech;
		this.experience = experience;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getContact() {
		return contact;
	}
	public void setContact(List<String> contact) {
		this.contact = contact;
	}
	public Set<String> getTech() {
		return tech;
	}
	public void setTech(Set<String> tech) {
		this.tech = tech;
	}
	public Map<String, Integer> getExperience() {
		return experience;
	}
	public void setExperience(Map<String, Integer> experience) {
		this.experience = experience;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", contact=" + contact + ", tech=" + tech + ", experience=" + experience
				+ "]";
	}

	
	public void afterPropertiesSet() throws Exception {
		// acts as the init method
		// no need to define this method in xml
		System.out.println("Inerface init method ....");
	}
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Interface destroy method ...");
		
	}
}
