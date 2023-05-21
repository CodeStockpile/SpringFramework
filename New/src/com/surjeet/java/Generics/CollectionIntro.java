package com.surjeet.java.Generics;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

/* COLLECTIONS - pre-built Data Structures implementations
 * 
 * I - interface
 * C - class
 * 
 * Collection - (I)
 * 	List - (I)
 * 		ArrayList - (C)
 * 		LinkedList - (C)
 * 
 * 	Set - (I)
 * 		HashSet - (C)
 * 		LinkedListSet - (C)
 * 		SortedSet - (I)
 * 			TreeSet - (C)
 * 
 * 	Map - (I)
 * 		HashMap - (C)
 * 		LinkedHashMap - (C)
 * 		SortedMap -(I)
 * 			TreeMap - (C)
 * 
 * Shortcuts-
 * 	
 * List - Allows duplicates
 * Set - No duplicates
 * Hash - Uses hashing (insertion order not preserved)
 * Linked - Insertion order preserved
 * Tree - Sorted
 * 
 * 
 * */

public class CollectionIntro {

	public static void main(String[] args) {
		
		
		// EXAMPLE -1
		LinkedList<Integer> list1 = new LinkedList<>(); // creating object
		list1.add(1000);
		list1.add(232);
		list1.add(9000);
		
		System.out.println(list1);
		
		
		// Example -2 
		
		HashSet<Integer> set = new HashSet<>();
		
		set.add(21);
		set.add(90);
		set.add(21);
		set.add(21);
		
		
		System.out.println(set);
		
	}

}
