package com.surjeet.java.Generics;

public class VarArgs {
	
	static <T extends Number> double mul(T ...x) {
		double res = 1;
		for(T val: x) {
			res = res *val.doubleValue(); 
			}
		
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mul(12, 90, 90, 7, 78));
		System.out.println(mul(12, 90, 90, 7, 78));

	}

}
