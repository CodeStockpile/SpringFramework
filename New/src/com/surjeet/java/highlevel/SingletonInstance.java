package com.surjeet.java.highlevel;

import java.lang.reflect.Constructor;

/**
 * Singleton Pattern -
 * 		- Only one object /instance per container
 * 		- Used when instance creation is costly
 * Example:
 * 		- Runtime.getRuntime()
 * 		-System.getSecurityManager()
 * 
 * */

class Sample2{
	
		// static field - allow only single instance
	
		// eager loading
	//private static Sample2 instance = new Sample2();
	
	
		// lazy loading -> to prevent unnecessary initialization
	private static Sample2 instance = null;
	
		// it allows for single instance creation
		// factory method
	public static Sample2 getInstance() {
		if(instance == null) {
			// lazy loading
			instance = new Sample2();
		}
		
		return instance;
	}
	
	
		// disallow for object creation
	private Sample2(){
		// to prevent object creation through reflection
		if(instance == null) {
			instance = this;
		}else {
			throw new IllegalStateException("Object is already created!");
		}
	}
	
	// static method 
	static void sayHello(String name) {
		System.out.println("hello !! "+name);
	}
}

public class SingletonInstance {

	public static void main(String[] args) throws Exception {
		
		
		Sample2 s1 = Sample2.getInstance();
		Sample2 s2 = Sample2.getInstance();
		
		System.out.println(s1==s1);
		
		s1.sayHello("BINOd");
		s2.sayHello("opo");
		
		
		// this will create a new object using reflection
		Class clazz = Sample2.class;
		Constructor<Sample2> constructor= clazz.getDeclaredConstructor(); 
		constructor.trySetAccessible();
		Sample2 obj = constructor.newInstance();
		
		System.out.println(s1==obj);
	}

}
