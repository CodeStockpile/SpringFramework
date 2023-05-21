package com.surjeet.java.NestedClasses;

interface Greet {
	void greet(String name);
}

public class AnonymousClassEx {

	public static void main(String[] args) {
		
		
		// class without name
		
		Greet obj = new Greet(){
			public void greet(String name) {
				System.out.println("Hello ! " + name);
			}
		};
		
		obj.greet("Sam");

	}

}
