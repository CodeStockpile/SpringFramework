package com.surjeet.java.basics;

interface ITest {
	void f();

	default void g() {
		System.out.println("No need of overriding");
	};

}

class Demo1 implements ITest {
	@Override
	public void f() {
		System.out.print("Demo 1");
	}
}

class Demo2 implements ITest {
	@Override
	public void f() {
		System.out.print("Demo 2");
	}
}

public class Default_Interface {

	void test(ITest t) {
		t.f();
	}

	public void main(String[] args) {
		test(new Demo1());
		System.out.println();
		test(new Demo2());

	}

}
