package com.surjeet.java.basics;

// Default and static methods in Interface

interface DefTest{
	void f();
	default void y(){System.out.println("Default- methos");}
}

class IDemo1 implements DefTest{
	@Override
	public void f() { System.out.println("Class - Demo1");}
}
	
class IDemo2 implements DefTest{
	@Override
	public void f() { System.out.println("Class -Demo2");}
	
}
	

public class InterfaceEx {
	
	static void test(DefTest i) {
		i.f();
	}

	public static void main(String[] args) {
		
		test(new IDemo1());

	}

}
