package com.surjeet.java.basics;



public class VarArgs {
	
	public static int mul(int ...x) {
		int res = 1;
		for(int val: x) {
			res = res *val; 
			}
		
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mul(12, 90, 90, 7, 78));
		

	}

}
