package com.surjeet.java.Streams;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamClass {

	public static void main(String[] args) {
		// Stream methods
		
//		Stream<String> strm = Stream.of("a", "b", "c");
//		Stream<Integer> strm2 = Stream.of(12, 43, 32, 22);
//		
//		Stream.concat(strm, strm2).forEach(System.out::println);
		
		// Integer range
		
//		IntStream.range(12 ,20).forEach(System.out::println); //20 not included
				
		IntStream.rangeClosed(12, 20).forEach(System.out::println);  //20 included
		
		System.out.println("----------------------");
		
		
		// Infinite random number 
		Stream.generate(() -> MyGenerator()).forEach(System.out::println);
	
	}
	
	static int MyGenerator() {
		return new Random().nextInt();
	}

}
