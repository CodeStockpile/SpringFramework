package com.surjeet.java.Lambda;


// Functional Interface - interface with single function

@FunctionalInterface    // doesn`t allow for more than one method  
interface Greet{
	void sayHello(String name);
}

public class LambdaExp {

	public static void main(String[] args) {
		
		// Anonymous function
		
		Greet g1 = new Greet() {
			public void sayHello(String name) {
			System.out.println("Hello " + name);
			}
		};
		
		g1.sayHello("Alexe");
		
		
		// Lambda expression
		Greet g2 = (name) -> System.out.println("Hello " + name);
		g2.sayHello("Alex");
		
		
		// Lambda-method reference (::)
		Greet g3 = System.out::println;
		g3.sayHello("Method-reference");
		

	}

}
