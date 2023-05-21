package com.surjeet.java.basics;
import java.util.Scanner;

public class lect4_Arrays {

	public static void main(String[] args) {
		int arr[] = new int[5];
		Scanner scan = new Scanner(System.in);
		
		int i;
		
		for(i=0; i< arr.length; i++) {
			System.out.printf("Enter %dth element: ",i);
			arr[i] = scan.nextInt();
		}
		
	// ---------- First approach ---------------------------------
		System.out.println("The elements of the array using approach1 are: ");
		
		for(i=0; i< arr.length; i++) {
			System.out.printf("%dth element: %d\n",i,arr[i]);
		}
	// ------------ Second Approach ------------------------------
		System.out.println("The elements of the array using 2nd Approach are: ");
		
		for(int ele:arr) {
			System.out.printf(" %d \n",ele);
		}
		
		for(int x:arr) {
			System.out.println(x);
		}
		int n = arr.length;
		System.out.println(arr[n-1]);
	}

}
