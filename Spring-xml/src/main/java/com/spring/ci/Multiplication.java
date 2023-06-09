/**
 * 
 */
package com.spring.ci;

/**
 * @author Surjeet Kumar
 *
 */
public class Multiplication {
	
	private int x;
	private int y;
	
	public Multiplication(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		
		System.out.println("Integer Constructor");
	}
	
	public Multiplication(double x, double y) {
		super();
		this.x = (int)x;
		this.y = (int)y;
		System.out.println("Double Constructor");
	}
	
	public Multiplication(String x, String y) {
		super();
		this.x = Integer.parseInt(x);
		this.y = Integer.parseInt(y);
		System.out.println("String Constructor");
	}
	
	public int sum() {
		return this.x*this.y;
	}
	
	public int multiply(int a, int b) {
		return a*b;
	}

	@Override
	public String toString() {
		return "Multiplication [x=" + x + ", y=" + y + "]";
	}
}
