package com.surjeet.java.Streams;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/**
 * Stream Sources -
 * 	-Collection :
 * 		stream() - sequential stream of elements in a collection
 * 	-Arrays:
 * 		stream() - sequential stream of elements of any array
 * 	- Files class:
 * 		lines() - a stream of lines from the given file
 * 
 * Static methods of the Stream class -
 * 
 * 	concat(Stream, Stream) - for concatenated streams
 * 	of(T ... values) - values to stream.
 * 	generate(Supplier) - Infinite stream.
 * 	range(int, int) or rangeClosed(int, int) - range of values (only for IntStream)
 * 
 * 
 * */



public class StreamsEx {

	public static void main(String[] args) throws Exception {
		// Collection stream
		
		List<String> lst = new ArrayList<>();
		lst.add("olo");
		lst.add("polo");
		lst.add("pilo");
		
		lst.stream().forEach(System.out::println); // lambda with reference method 
		
		// File stream
		System.out.println("----------- Conetents of the file are ------------");
		Files.lines(Path.of("C:\\Users\\Surjeet\\Desktop\\src.txt"))
			.forEach(System.out::println);;

	}

}
