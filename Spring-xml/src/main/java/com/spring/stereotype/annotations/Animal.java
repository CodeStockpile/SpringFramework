package com.spring.stereotype.annotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
@Component("st")  // giving custom name to the bean
public class Animal {
	// giving the default value to the bean
	@Value("Giraff")
	private String name;
	
	@Value("23")
	private int age;
	
	@Value("#{food}")
	private List<String> food;
	
	@Value("#{ T(java.lang.Math).sqrt(16) }") // SpEL(Spring Expression language)
	private int legs;
	
	@Value("#{ T(java.lang.Math).PI }")	// SpEL(Spring Expression language)
	private double graze;
	
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}
	public Animal(String name, int age, List<String> food) {
		super();
		this.name = name;
		this.age = age;
		this.food = food;
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
		return "Animal [name=" + name + ", age=" + age + ", food=" + food + ", legs=" + legs + ", graze=" + graze + "]";
	}

	
	
}
