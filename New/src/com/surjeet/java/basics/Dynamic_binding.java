package com.surjeet.java.basics;
/*
 * Dynamic Binding :-
 *  	can always created for only base class
 *  	- binding/linking to the corresponding method definition based on objects. 
 *   
 * */


class BasicCalculator{
	public int add(int a, int b) { return a+b;}
	public int sub(int a, int b) { return a-b;}
}

class ScientificCalculator extends BasicCalculator{
	private static final double PI = 3.1417;
	public double sin(double deg) {
		deg = deg *PI/180;
		return Math.sin(deg);
	}
	
}

public class Dynamic_binding {

	public static void main(String[] args) {
		
		// accessing the created function
		
		test2(new BasicCalculator());   //passing default object
		System.out.println("-------------");
		test2(new ScientificCalculator());		// passing casted object
		test(new ScientificCalculator());		// passing casted object
		
//		test2(new BasicCalc());
		
	}
	
	// creating function
	static void test(BasicCalculator b)
	{
		System.out.println(b.add(23, 90));
		System.out.println(b.add(290, 90));
		
		// we can`t access the sin function so we caste the passed object
		
		if (b instanceof ScientificCalculator)
		{System.out.println(((ScientificCalculator)b).sin(45));}
		}
	
	
	
	
	
	
	static void test2(BasicCalculator b)
	{
		System.out.println(b.add(23, 90));
		System.out.println(b.add(290, 90));
		
		// we can`t access the sin function so we caste the passed object
		
		if (b instanceof ScientificCalculator)
		{System.out.println("Access denied !");}
		}
	
	
	
	
}
