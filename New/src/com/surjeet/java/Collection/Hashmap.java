package com.surjeet.java.Collection;
import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> dict = new HashMap<>();
		dict.put("Ted", 2000);
		dict.put("Alex", 9000);
		dict.put("Ciaro", 2000);
		
		System.out.println(dict);
		
//		int x = dict.get("Ted");
//		System.out.println(x);
//		
//		dict.replace("Ted", 20); // replaces 2000 with 20
//		
//		for(String key: dict.keySet()) {
//			int value = dict.get(key);
//			System.out.println(key+" : "+ value);
		//}
	}

}
