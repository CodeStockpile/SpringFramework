package com.surjeet.java.Generics;

import java.util.LinkedList;

class Stack <T> {
	private LinkedList<T> list= new LinkedList<T>();
	
	public void push(T ele) {
		list.addFirst(ele);
	}
	
	public T pop() {
		return list.removeFirst();
	}


} 


public class RevisedStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<String> s = new Stack<>();
		s.push("12");
		s.push("ioki");
		s.push("loi");
		
		
		System.out.println(s.pop());
		System.out.println(s.pop());

	}

}
