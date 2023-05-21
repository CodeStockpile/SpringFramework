package com.surjeet.java.Generics;

import java.util.Optional;
import java.util.function.Supplier;

public class Stack_Advanced {

	public static void main(String[] args) throws StackException {
		
//		GenStack s1 = new GenStack();
//		s1.push(12);
		GenStack s1 = new GenStack(() -> new Integer[10]);
		s1.push(11);
		s1.push(90);
		s1.push(0);
//		s1.push(-9);
		s1.push(7);
		s1.pop();
		Optional<Integer> x =s1.peek();
		System.out.println(x);

	}

}

// exception class
class StackException extends Exception{
	
	public StackException(String reason) {
		super(reason);
	}
}

// logic for stack

class GenStack <T>{
	
	private T arr[];
	private int top;
	private int limit;
	
	private static final int DEFAULT_LIMIT = 5;
	
//	public GenStack() {
//		initialize(DEFAULT_LIMIT);
//	}
	
	public GenStack(Supplier<T []> supplier) {
		initialize(supplier);
	}
	
	private void initialize(Supplier<T []> supplier) {
		arr = supplier.get();
		top = -1;
//		limit = size;
		limit = arr.length;
	}
	
	
	public  void push(T element) throws StackException {
		
		if(top < limit -1) {
			arr[++top] = element;
		}
		else {
			throw new StackException("Overflow");
		}
	}
	
	public T pop() throws StackException {
		if(top == -1) {
			throw new StackException("Underflow");
		}
		return arr[top--];
	}
	
	public Optional<T> peek() {
		if(isEmpty()) {
			return Optional.empty();
		}
		return Optional.of(arr[top]);
	}
	
	//  utility class
	
	public boolean isEmpty() {
		return top == -1;
	}
}