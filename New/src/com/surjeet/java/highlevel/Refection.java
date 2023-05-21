package com.surjeet.java.highlevel;

import java.lang.reflect.Field;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Refection {

	public static void main(String[] args) throws Exception{
		
		//Class clazz  = Sample.class;
		Class clazz = Class.forName("com.surjeet.java.highlevel.Sample");
		
		Field[] fields = clazz.getDeclaredFields();
		Constructor[] constructors = clazz.getDeclaredConstructors();
		Method[] methods = clazz.getDeclaredMethods();
		
		System.out.println("Fields are ---");
		for(Field f : fields) {
			System.out.println(f);
		}
		
		System.out.println("Constructors are ---");
		for(Constructor c : constructors) {
			System.out.println(c);
		}
		
		System.out.println("Methods are ---");
		for(Method m : methods) {
			System.out.println(m);
		}
	}

}


class Sample{
	int x;
	
	public Sample() {}
	public Sample(int x) {
		this.x = x;
	}
	
	public int getA() {
		return x;
	}
	public void setA(int x) {
		this.x = x;
	}
}