package com.surjeet.java.Streams;


import java.util.stream.Stream;

public class StreamSortEx {

	public static void main(String[] args) {
		
		String arr[] = {"this", "is", "the", "sample", "string", "for", "joining"};

		
/* ----------- SORTED() WITHOUT COMAPARATOR ------------------------*/		
		

		// Arrays.stream(arr)  <=> 
		
//		Arrays.stream(arr)
//				.sorted()
//				.forEach(System.out::println);
	
		System.out.println("sorted() without comaprator method (natural sorting)");
//		Stream.of(arr)
//				.sorted()
//				.forEach(System.out::println);
		
		
		
		Stream.of(arr)
			.skip(2)
			.sorted()
			.forEach(System.out::println);
		
		/* --------- SORTED() WITH COMPARATOR ------------------------*/
		System.out.println();
		System.out.println("------ sorted with comaparator method-------");
		
		Stream.of(arr)
			.sorted((x, y) -> x.compareTo(y))
			.forEach(System.out::println);
		
		/* --------- SORTED() WITH COMPARATOR in descending order ----------*/
		System.out.println();
		System.out.println("------ sorted with comaparator method-------");
		
		Stream.of(arr)
			.sorted((x, y) -> -1 *x.compareTo(y))
			.forEach(System.out::println);
		
		
		
	}

}
