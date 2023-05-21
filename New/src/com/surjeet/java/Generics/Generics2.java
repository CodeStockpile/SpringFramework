package com.surjeet.java.Generics;

public class Generics2 {

	
	// Bounded Type Parameter
	public static <T extends Number> void display(T[] arr) {
		for(T ele: arr) {
			System.out.println(ele);
		}
	}
	
	public static void main(String[] args) {
		
		Integer ar[] = {12, 45, 90, 88};
		display(ar);
		
		Double arr1[] = {12.90, 88.0, 78.89, 6.0};
		display(arr1);
		
//		String arr2[] = {"ws", "io", "op", "gg"}; // don`t work
//		display(arr2);
	}

}
