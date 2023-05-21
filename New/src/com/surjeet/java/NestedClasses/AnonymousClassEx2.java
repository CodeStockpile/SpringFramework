package com.surjeet.java.NestedClasses;


class Base {
	public void f() {
		System.out.println("f() in Base");
		
	}
	public void g() {
		System.out.println("g() in Base");
	}
}

public class AnonymousClassEx2 {

	public static void main(String[] args) {
		
		// normal object creation 
		Base obj = new Base();
		obj.f();
		obj.g();
		
		
		// Anonymous object creation 
		System.out.println("-----------------");
		Base b = new Base() {
			@Override
			public void f() {System.out.println("f() in the Anonymous Function");}
		};
		
		b.f();
		b.g();

	}

}
