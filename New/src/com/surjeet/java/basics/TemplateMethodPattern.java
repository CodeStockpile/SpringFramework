package com.surjeet.java.basics;

/* Template Method Pattern 
 * 	- An abstract super class defines the skeleton of the algorithm leaving certain
 * 		customizable partitions of the algorithms to the subclasses to define.
 * */

abstract class Search {
	public int search(int arr[], int val) {
		for(int i=0; i<arr.length; i++) {
//			//if(arr[i] == val)
			if (match(arr[i], val)) {
				return i;
				}
		}
		
		return -1;
	}
	
	public abstract boolean match(int val, int ele);  // can be modified as per the requirement
 	
}


class EqualitySearch extends Search
{

	@Override
	public boolean match(int val, int ele) {
		return val == ele;
	}

	
}

class InequalitySearch extends Search
{

	@Override
	public boolean match(int val, int ele) {
		return val != ele;
	}

	
}


public class TemplateMethodPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] =  {3, 90, 32, 89, 30};
//		Search s = new Search(); // abstract class can`t be instantiated
		EqualitySearch es = new EqualitySearch();
		int index = es.search(arr, 89);
		
		if(index != -1) System.out.printf("Found at %d", index);
		else System.out.println("NOT found !");
	}

}
