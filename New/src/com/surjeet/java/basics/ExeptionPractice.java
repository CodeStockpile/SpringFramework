package com.surjeet.java.basics;

public class ExeptionPractice {

	public static void main(String[] args) {
		
		Stck stk = new Stck();
		try {
			stk.push(90);
			
		} catch (StEx e) {

			e.printStackTrace();
		}
	}

}

class StEx extends Exception {

	public StEx(String exception) {
		super(exception);
	}
}

class Stck <T> {

	private T arr[];
	private int top;
	private int limit;
	private final int DEFAULT_SIZE = 10;

	Stck() {
		initialize(DEFAULT_SIZE);
	}

	Stck(int size) {
		initialize(size);
	}

	void initialize(int size) {
		limit = size;
		top = -1;
		arr = new T[size];
	}

	public void push(T ele) throws StEx {
		if (top <= limit-1) {
			arr[++top] = ele;
		} else {
			throw new StEx("Overflow");
		}

	}
	
	public T pop() throws StEx {
		if(top == limit -1) {
			throw new StEx("UnderFlow");
		}
		return arr[top];
	}
	
	public T peak() {
		return arr[top];
	}

}
