package com.surjeet.java.basics;

/* Interface -
 * 	-100% abstract as per old Java versions
 * 	-Java recent editions support adding default and static methods
 *	-All methods are public abstract by default
 *	-All fields are public static and final by default
 *	-Used for 
 *		- Separating interface from implementations
 *		- As a specifications for required methods
 *		- For constants
 *		- As marker interface
 *	- Any class that implements must override all the abstract methods
 *		of the interface otherwise it becomes abstract.
 *
 * */



// example 1
interface Calc {
	double PI = 3.14159; //public static final
	
	int add(int x, int y);	// public abstract
	int sub(int x, int y);
	int mul(int x, int y);
	int div(int x, int y);
}

class Calculator implements Calc
{
	@Override
	public int add(int x, int y) {return x+y;}
	
	public int sub(int x, int y) {return x-y;}
	public int mul(int x, int y) {return x*y;}
	public int div(int x, int y) {return x/y;}
}


// EXAMPLE 2

interface Sample{
	
	void f();
	void g();
	}

abstract class example implements Sample
{
	public void f() {System.out.println("F() in Base");}
	abstract void h();
}

class combined extends example
{
	public void h() {System.out.println("h() in combined class");}
	public void g() {System.out.println("g() in combined class");}
	public void i() {System.out.println("i() in combined class");}
}

// ----------------------------------------------------------------------------
public class Interface {

	public static void main(String[] args) {
		
		Calc c; //reference object
		c = new Calculator();
		int x = c.add(12, 59);
		System.out.println(x); 
		
		
		
		combined c1;
		c1 = new combined();
		
		c1.f(); 
		
		
		example c3;
		c3 = new combined();
	//	c3.i();          // not possible because c3 is refering example which do not contain i() method 
	}

}
