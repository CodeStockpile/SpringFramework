package com.surjeet.java.Streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

// joning the array elements


public class StreamEx4 {

	public static void main(String[] args) {
		
		String arr[] = {"this", "is", "the", "sample", "string", "for", "joining"};

		String str = Stream.of(arr)
				.collect(Collectors.joining(" "));
		
		
		// skip(n) - skips the first n elements in the final string
		String str2 = Stream.of(arr)
				.skip(3)
				.collect(Collectors.joining(" "));
		
		// limit(long n) - return the first n elements
		String str3 = Stream.of(arr)
				.limit(4)
				.collect(Collectors.joining(" "));
		
		//
		String str4 = Stream.of(arr)
				.skip(2)
				.limit(4)
				.collect(Collectors.joining(","));
		
		
		System.out.println(str4);
	}

}
