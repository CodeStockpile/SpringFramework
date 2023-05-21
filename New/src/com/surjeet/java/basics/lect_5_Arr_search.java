

package com.surjeet.java.basics;
import java.util.Scanner;

/* Arrays :- A collection of homogeneous elements.
 * allocate using 'new' operator 
 * 			-> int arr[] = new int[5]
 * - Initialized using two ways:
 *   1) int arr[] = {12,34, 55}
 *   2) int arr[];
 *   		arr = new int[]{12, 34, 89}
 *   -> Accessing arrays beyond its boundaries leads to ArrayIndexOutOfBoundsException
 *   */



public class lect_5_Arr_search {

	static int search(int ar[],int ele) {
		for(int i = 0; i < ar.length;i++) {
			if(ar[i] == ele)
				return i;
		}
		return -1;	
	}
	
	
// ----------------------------------------------------------------	
//	static int search(int ar[],int ele) {
//		
//		boolean found = false;
//		int i;
//		for(i = 0; i < ar.length;i++) {
//			if(ar[i] == ele)
//				found = true;
//				break;
//		}
//		return found? i: -1;
//	}
//	-----------------------------------------------------------------
	
	
	public static void main(String[] args) {
		
		int arr[] = {20,30, 90,88, 10};
		Scanner scan = new Scanner(System.in);
		int s;
		System.out.println("Enter the element to search: ");
		s = scan.nextInt();
		
		
		int index  = search(arr, s);
		
		if (index!= -1)
			System.out.println("Found at "+index);
		else 
			System.out.println("Not present !!");

	}

}
