package com.surjeet.java.basics;

/*
 * 1) An interface can extends multiple interface
 * 2) A class can implement multiple interface.
 * 
 * Note - A java class can not extend more than one class, 
 	but it can implement multiple interfaces.
 * */


interface A {
	void a();
}

interface B{
	void b();
}

interface C extends A, B {
	void f();
}



interface D {
	void i();
}

/* Multiple interface implementation */

class Example2 implements C, D {

	
	@Override
	public void a() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void b() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void i() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void f() {
		// TODO Auto-generated method stub
		
	}
	
}



public class Interface_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
