package com.surjeet.java.Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		// for removing the duplicate values, we use the set 
		
		int arr[] = {10, 90, 89, 90, 7, 67, 77, 90};
		
		/*----- Order is not maintained ---*/
		//HashSet<Integer> set1 = new HashSet<>();   
		
		/* ------ Order is maintained ------*/
		//LinkedHashSet<Integer> set1 = new LinkedHashSet<>();
		
		/* ----  Sorted order ----------*/
		TreeSet<Integer> set1 =  new TreeSet<>();
		for(int ele: arr) {
			if (! set1.add(ele)){
				
				System.out.println("Duplicate found: "+ele);
			};
		}
		
		System.out.println(set1);
	}

}
