package com.surjeet.java.Streams;

import java.util.Arrays;

public class StreamMethods2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12, 13, 18,23, 34, 32};
		
		System.out.println(" --- Distinct values ---");
		Arrays.stream(arr)
				.distinct()
				.forEach(System.out::println);
		
		System.out.println(" --- Distinct values  < 20---");
		Arrays.stream(arr)
				.distinct()
				.filter(x -> x<20)
				.forEach(System.out::println);
		
		System.out.println(" --- Distinct values < 20 and their cubes ---");
		Arrays.stream(arr)
				.distinct()
				.filter(x -> x<20)
				.map(x -> x*x*x)
				.forEach(System.out::println);
		
		
		
	}

}
