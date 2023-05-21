package com.surjeet.java.basics;

class BasicCalc{
	public int add(int a, int b) { return a+b;}
	public int sub(int a, int b) { return a-b;}
}

class ScientificCalc extends BasicCalc{
	private static final double PI = 3.1417;
	public double sin(double deg) {
		deg = deg *PI/180;
		return Math.sin(deg);
	}
	
}

public class Inheritance {

	public static void main(String[] args) {
		
		BasicCalc b1 = new BasicCalc();
		System.out.println(b1.add(90, 20));
		System.out.println(b1.sub(90, 20));
		
		
		ScientificCalc s1 = new ScientificCalc();
		System.out.println(s1.sub(90, 320));
		System.out.println(s1.add(90, 110));
		System.out.println(s1.sin(90));
		
		BasicCalc b2 = new ScientificCalc();	// expecting BasicCalc
		System.out.println(b2.sub(90, 20));
		System.out.println(b2.add(90, 20));
		//System.out.println(b2.sin(20)); 	// not allowed
	}

}
