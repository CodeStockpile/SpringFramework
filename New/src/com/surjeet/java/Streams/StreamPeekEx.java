package com.surjeet.java.Streams;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * Observing the elements of the stream -
 * 		-peek(Consumer)
 * 			- Return output stream that is identical to the input stream
 * 			- Each method is passed to the accept() method of the consumer
 * 			- Useful in debugging
 * 
 * */

public class StreamPeekEx {

	public static void main(String[] args) {
		
		
		// find the length of max string in the array
		String arr[] = {"this", "is", "the", "sample", "string", "for", "joining"};
		
		Optional<Integer> maxn = Stream.of(arr)	// Stream<String>
			.peek(System.out::println)		// ------ Consumer for map
			.map(x ->x.length())	// Stream<Integer>
			.peek(System.out::println)				// ----- Consumer for max
			.max((x, y) -> x-y);   // (y-x) returns the lowest length
	
		if(maxn.isPresent()) {
			System.out.println("Max length : "+maxn.get());
		}
		

	}

}
