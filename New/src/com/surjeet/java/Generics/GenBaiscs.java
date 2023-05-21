package com.surjeet.java.Generics;



/* ---- GENERICS ----
 *  	- Classes with Type parameter so that hey provide a way  re-use the same 
 *  		code for different types.
 *  	- Allows a stranger type checking at compile time. 
 * 
 * */


class Sample<Type>{
	
	private Type value;
	
	public void setValue(Type value) {
		this.value = value;
	}
	
	public Type getValue() {
		return value;
	}
	
}


public class GenBaiscs {

	public static void main(String[] args) {
		
		
		Sample s1 = new Sample();
		s1.setValue(100);
		System.out.println(s1.getValue());
		
		
		Sample s2 = new Sample();
		s1.setValue("jiko");
		System.out.println(s1.getValue());


	}

}
