/**
 * 
 */
package com.surjeet.java.basics;
import java.util.Scanner;

/**
 * @author Surjeet
 *
 */
public class Lect1 {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Hello !!");
		double p,r, t, si;
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter the principal amount : ");
		p = inp.nextDouble();
		System.out.print("Enter the Rate: ");
		r = inp.nextDouble();
		System.out.print("Enter the time: ");
		t = inp.nextDouble();
		
		si = (p*r*t)/100;
	//System.out.printf("Simple interest - %lf  ", si);	// use of "printf"
		
		System.out.print("Simple Interest : "+ si);

	}

}
