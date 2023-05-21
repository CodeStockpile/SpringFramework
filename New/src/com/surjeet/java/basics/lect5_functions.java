package com.surjeet.java.basics;

public class lect5_functions {

	
	// static can call static only, so to call from main it needs to be static
	
	static void print(int ar[]) {
		for (int ele: ar) {
//			ele = 0;			-> it works
			System.out.println(ele);
		}
	}
	
	static void setZero(int b[])
	{
		for(int i=0;i<b.length; i++) {
			b[i] = 0;
		}
	}
	
/* This function will set the array to zero coz , it takes the address of the original array */
	
	public static void main(String[] args) {
		
		int arr[] = {20,90,88};
		print(arr);
		setZero(arr);
		print(arr);

	}

}
