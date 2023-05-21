package com.surjeet.java.basics;

/*Initializers:
 * 
 * static initializers - runs once per the class (one time activity)- at the time of class declaration
 * 		-> starts with only static keyword followed by curly bracket
 * 		-> mostly used
 * 
 * non-static initializers - runs every time a class is created
 *		-> starts directly with curly brackets without any class
 *		-> rarely used
 * */

// Example

class Example{
	
	// static initializer
	static {
		System.out.println("Static initializer");
	}
	// non-static initializer
	{
		System.out.println("Non- static initilizers");
	}
}


public class Initializers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Example e1, e2, e3;		// static initializer executes 
		e1 = new Example();		// non-static initializer executes
		e2 = new Example();		// non-static initializer executes
		e3 = new Example();		// non-static initializer executes

	}

}
