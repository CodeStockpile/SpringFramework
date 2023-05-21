package com.surjeet.java.basics;

public class multi_dim_arr {

	public static void main(String[] args) {
		
		int arr[][] = new int[3][4];
		int b[][] = new int[3][];
		
		b[0] = new int[5];	//first row of length 5
		b[1] = new int[3];	//second row of length 3
		b[2] = new int[2];	//third row of length 2
		
		b[0] = new int[]{12,34,56,78,90};
		System.out.println(b[0][3]);
	}

}
