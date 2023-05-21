package com.surjeet.java.basics;
 
public class String_exp {

	public static void main(String[] args) {
		
		
		String s = new String();
		s = "qawsx";
		System.out.println(s);
		s = s+ "-edc";
		System.out.println(s);
		
		String s1 = "pqr";
		String s2 = "pqr";
		
		String x = s1 +s2;
		System.out.println(x);
		
		if(s1 == s2) {System.out.println("Equals");}
		else {System.out.println("Not Equal!");}
		
		StringBuilder sb = new StringBuilder("first");
		sb.append("-second");
		sb.append("-third");
		
		String str = sb.toString();
		System.out.println(str);
		System.out.println(sb);
		
		// string replacement
		System.out.println("----------------------------------------------------");
		String test = new String("ABCD");
		test = test.replace('A', 'a');
		System.out.println(test);
		
		
		System.out.println("-----------------------------------------");
		// string slicing in range
		System.out.println(sb.substring(2, 7));
		
		// string elements
		for(int i=0; i<=sb.length()-1;i++) {System.out.println(sb.substring(i,i+1));}
		
		System.out.println("------------ PATTERN 1 -----------------------------");
		for(int i=0; i<=sb.length();i++) {System.out.println(sb.substring(i));}
		
		System.out.println("------------ PATTERN 2 -----------------------------");
		for(int i=sb.length();i >=0 ;i--) {System.out.println(sb.substring(i));}
		
		
		 // character copy
		String str1 = new String("welcome to the fucking world !");
		char[] str2 = new char[7];
		
		str1.getChars(3, 10, str2, 0);
		System.out.println(str2);
	
	}

}
