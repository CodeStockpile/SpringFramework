package com.surjeet.java.Collection;

import java.util.List;
import java.util.ArrayList;


public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> al = new ArrayList<Integer>();
		
		// ---- Adding value
		al.add(1212);
		al.add(909);
		al.add(99);
		al.add(000);
		al.add(Integer.parseInt("10"));
		
		// retrieve the value
		int val = al.get(2);;
		
		// Update the value
		al.set(1, 89);
		
		// traverse all values
		for (Integer integer : al) {System.out.println(integer);}
		
		
		// deleting the value
		al.remove(0);
		
		// clear all values
		
		al.clear();
		
//		int x = al.get(1);
		
//		al.remove();j
		
		System.out.println(al);
		System.out.println("Some Value: "+ val);
//		System.out.println(x);
		System.out.println("--- End of the line ---");
	}

}
