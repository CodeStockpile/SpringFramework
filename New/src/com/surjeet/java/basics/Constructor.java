package com.surjeet.java.basics;


/* Constructor:
 * 	-> A function like block takes the name of the class but with no return type.
 * 	-> Can be overloaded.
 * 	-> Object creation must match one of the constructor which is accessible i.e at least anyone of
 * 		 the constructor must be accessible outside the class
 * 	-> When you don`t define a constructor for a class, compiler provides one which is known
 * 		as 'default constructor'. 
 * */

class PositiveInt{
	
	private int x;
	
	public  PositiveInt(){
		x = 0;
	}
	
	public PositiveInt(int x) {
		this.x = x;
	}
	public int getX() {return this.x; }
}

/* Constructor invocation by another constructor 
 * 
 * Note: this(...) call should be the first statement of the constructor
 * */

class Demo{
	
	Demo(){
		this(100); // CURRENT OBJECT REFERENCE (call to another constructor with args)
		System.out.println("rest of the code ...");
	}
	
	Demo(int a){
		System.out.println("Second consturctor wiht agrs of "+ a);
	}
}


public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PositiveInt p1, p2;
		p1 = new PositiveInt();
		System.out.println(p1.getX());		// prints 0
		
		p2 = new PositiveInt(290);
		System.out.println(p2.getX());		// prints 290
		
		
		Demo d1, d2;
		d1 = new Demo();
		d2 = new Demo(1200);
		
		
	}

}
