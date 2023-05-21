package com.surjeet.java.basics;

/*	Abstract Classes:
 * 		-:can not be instantiated
 * 		-: They are declared abstract and may or may not include abstract methods
 * 		-: They can not have subclass.
 * 		-: Abstract classes and abstract methods can not be final.
 * 		-: A subclass extending an abstract class must override all the abstract methods of the 
 * 			base class otherwise it too becomes abstract.
 * 		-: A class may or may not have abstract method but can still be declared abstract in order
 * 			to avoid instantiation. 
 * Concrete Classes:
 * 		-: Classes which can be instantiated
 * 
 * */


// ABSTRACT CLASS

abstract class Base{
	public void f() {
		System.out.println(" First Base class function");
	}
	public abstract void g();
}


// CONCRETE CLASS
abstract class Derived extends Base{

	//@Override
//	public void g() {
//		System.out.println("Second function in derived class ");
//		
//	}
	
}

class Con extends Derived{

	@Override
	public void g() {
		// TODO Auto-generated method stub
		
	}
	
	
}

public class abstrct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Derived d;
		d = new Derived();
		d.f();
		d.g();
		
		
	//	Base b;
//		b = new Base; // can`t be instantiated
	}

}
