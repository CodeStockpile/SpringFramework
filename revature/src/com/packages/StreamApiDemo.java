package com.packages;

import java.util.Arrays;
import java.util.List;

public class StreamApiDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	List<String>  list = Arrays.asList("Joo", "zoo", "loop", "pool");
	
	list.stream().forEach(System.out::print);
	System.out.println();
	list.parallelStream().forEach(System.out::print);
	}

}
