package com.surjeet.java.Collection;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;


public class ArrayDequeDemo {

	public static void main(String[] args) {

		// Instantiation
		ArrayDeque<Double> adq = new ArrayDeque<Double>();
		
		// Insertion
		adq.add(123.90);
		adq.add(Double.parseDouble("999.909"));
		
		// get single value
		
		System.out.println("Firt element: "+adq.getFirst());
		System.out.println("Last elemen: "+adq.getLast());
		
		adq.offerFirst(89.77);
		adq.offerLast(12.90);
		adq.offer((double) 12290);
		
		// traversal 
		System.out.println("Before: "+adq);
		for (Double d : adq) {
			System.out.println(d);
		}
		
		adq.poll(); 
		adq.pollLast();
		adq.pollFirst();
		
		adq.clear();
	
		System.out.println("After: "+adq);
		
		
		System.out.println("------------------------------");
		List<Integer> l = new ArrayList<Integer>();
		
		l.add(12);
		l.add(90);
		l.add(0, 22);
		l.add(90);
		l.add(78);
		
		
		for(int x: l) {
			System.out.println(x);
		}
		
		int a = l.get(0);
		System.out.println(a);
		
		l.set(0, 33);
		System.out.println(l.get(0));
		
		l.remove(l.get(0));
		
		
	}

}
