package com.surjeet.java.basics;

public class Test {

//	 static void setZero(int a[]) {
//		for(int i = 0; i<a.length;i++) {
//			a[i] =  0;
//			System.out.println("x");
//		}
//		
//	}
	
	public static void main(String[] args) {
		int arr[] = { 12, 3, 4,45, 90};
		
		setZero(arr);
		
		 for(int ele: arr) {
			 System.out.println(ele);
		 }
 
	}

}
