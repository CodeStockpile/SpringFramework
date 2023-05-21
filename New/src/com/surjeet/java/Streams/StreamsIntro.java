package com.surjeet.java.Streams;

import java.util.Arrays;



/** STREAMS 
 * - Enable to define a pipeline to process collection of data.
 * - Consists three main things
 * 		- Source
 * 		- Zero or more intermediate operations
 * 		- Terminal operation
 * - Pipeline is not evaluated till the terminal operation is invoked.
 * 
 * 
 * */

public class StreamsIntro {

	public static void main(String[] args) {
		int arr[] = {12, 3, 45, 2, 4, 6, 9};
		
		// to find the sum of squares of even numbers
		
		int sum = Arrays.stream(arr)
				.filter(x -> x%2==0)
				.map(x-> x*x)
				.sum();
		System.out.println("The result is : "+sum);
	}

}
