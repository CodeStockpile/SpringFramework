package com.surjeet.java.Collection;

import java.util.HashSet;


public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Integer> hash = new HashSet<Integer>(); 
		
		hash.add(1212);
		hash.add(Integer.parseInt("9999"));
		
		for (Integer i : hash) {
			System.out.println(i);
		}
		
//		hash.clear();
		
		hash.remove(0);
		System.out.println(hash);

	}

}
