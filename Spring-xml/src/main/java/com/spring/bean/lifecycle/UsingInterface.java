package com.spring.bean.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class UsingInterface implements InitializingBean, DisposableBean{

	private String prop1;
	private String prop2;
	

	public UsingInterface() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UsingInterface(String prop1, String prop2) {
		super();
		this.prop1 = prop1;
		this.prop2 = prop2;
	}
	public String getProp1() {
		return prop1;
	}
	public void setProp1(String prop1) {
		this.prop1 = prop1;
	}
	public String getProp2() {
		return prop2;
	}
	public void setProp2(String prop2) {
		this.prop2 = prop2;
	}
	@Override
	public String toString() {
		return "UsingInterface [prop1=" + prop1 + ", prop2=" + prop2 + "]";
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
