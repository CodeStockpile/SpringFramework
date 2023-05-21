package com.surjeet.java.Streams;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
 * Terminal Operations -
 * 	Terminates the principles of operations on the stream.
 * 	Generated an explicit result or a side effect.
 * `
 * findFirst() - finds the first element that matched.
 * findany() - finds any element without focusing  on the order of occurence.
 * boolean allMatch(Predicate p)
 * boolean anyMatch(Predicate p)
 * boolean noneMatch(Predicate p)
 * collect(Collector c) - performs a mutable reduction on the stream.
 * toArray() - returns an array
 * forEach(Consumer c) - consume the element of the stream
 * 
 * */

public class StreamMethods {

	public static void main(String[] args) {
		
		String str[] = {"ab", "a", "xyz", "abc"};
		
		// find first 3 characters string
		Optional<String> s = Stream.of(str)
			.filter(x -> x == "ab")
			.findFirst();
		
		if(s.isPresent()) {
			System.out.println(s.get());
		}
		
		// find if all strings are of 3 character length
		
//		boolean res = Stream.of(str).allMatch(x -> x.length()==3);
//		System.out.println(res);
//		
//		Stream.of(str)
//			.collect(Collectors.toList());
//		
	}

}
