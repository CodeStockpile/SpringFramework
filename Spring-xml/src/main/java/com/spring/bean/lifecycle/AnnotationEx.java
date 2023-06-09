package com.spring.bean.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class AnnotationEx {
	private String prop;

	
	public AnnotationEx() {
		super();
		// TODO Auto-generated constructor stub
	}


	public AnnotationEx(String prop) {
		super();
		this.prop = prop;
	}


	public String getProp() {
		return prop;
	}


	public void setProp(String prop) {
		this.prop = prop;
	}

	
	/*
	 * We have to add dependency for this annotation for java 9+
	 * also we have to enable annotations in xml
	 * */
	@PostConstruct
	public void start() {
		System.out.println("Init method called using @PostConstruct ...");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("Destroy method using @PreDestroy");
	}
	
	
	@Override
	public String toString() {
		return "AnnotationEx [prop=" + prop + "]";
	}
	
}
