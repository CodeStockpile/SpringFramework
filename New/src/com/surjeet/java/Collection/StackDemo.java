package com.surjeet.java.Collection;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {

		
		Stack<String> stack = new Stack<String>();
		
		// adding values
		stack.add("One");
		stack.add("Two");
		stack.add("122".toString());
		stack.add(Integer.toString(121));
		stack.add(Double.toString(12.08));
		
		
		// retrieval all values
		for (String val : stack) {
			System.out.println(val);
		}
		
		// retrieve single value
		
		System.out.println(stack.get(1));
		System.out.println(stack.get(0));
		
		
		// update elements
		
		stack.set(0, "45");
		System.out.println("\n "+stack);
		
		System.out.println("-------------------");
		
		// checking top of the stack
		String top = stack.peek();
		System.out.println(top);
		
		// returns and remove the top of the stack
		System.out.println(" -----------------");
		System.out.println(" Pop the element : "+stack.pop());
		System.out.println("Stack after pop: "+ stack.peek());
		
		stack.remove(0);
		System.out.println(stack);
		
		stack.clear();
		System.out.println("After clear: "+ stack);
		
		
		
		
		
		
		
	}
	
	

}
