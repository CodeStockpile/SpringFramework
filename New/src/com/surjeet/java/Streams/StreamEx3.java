package com.surjeet.java.Streams;

import java.util.Arrays;
import java.util.stream.Stream;


/**
 * Map()
 * 		- 1 to 1 mapping
 * 
 * flatMap()
 * 		- 1 to N mapping
 * */

public class StreamEx3 {

	public static void main(String[] args) {
		
		String arr[] = {"Alexa", "Google sucks", "Amzon sucks google hugs"};
		
		System.out.println("--- Using Map ---------- ");
		Stream.of(arr).map(x -> x.split(" "))
						.forEach(x -> System.out.println(Arrays.toString(x)));
		
		
		System.out.println("--- Using flatMap ---------- ");
		Stream.of(arr).flatMap(x ->Stream.of( x.split(" ")))
						.forEach(System.out::println); //(x -> System.out.println(x))
		
		
		Stream.of(arr).map(x -> x.split(" "))
		.forEach(x -> System.out.println(Arrays.toString(x)));
		
		
	}
}