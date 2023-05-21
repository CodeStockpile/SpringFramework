package com.surjeet.java.basics;


/*
 * S - Single responsibility
 * O - Open for extension and Closed for modification
 * L - Liskov Substitution Principle - Objects of super class shall be replaced with objects of subclass.
 * I - Interface Segregation Principle - A client should never forced to implement an interface that it does not use.
 * D - Dependency inversion Principle - High Level module should not directly depend on low level modules, instead
 * 										they should depend on abstraction.
 * 
 * */

interface ValueComparator
{
	int compare(int a, int b);
	// return +ve if a>b, -ve otherwise
}


class ArrayUtils {
	
	public static void sort(int arr[], ValueComparator comparator)
	{
		for(int i=0; i<arr.length;i++) {
			for(int j=i+1;j < arr.length; j++) {
				if(comparator.compare(arr[i], arr[j])>0) // it remains same but logic changes
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				}
			}
	}
}

class AscComparator implements ValueComparator{
	@Override
	public int compare(int val1, int val2)
	{
		return val1-val2;
	}
}

class DescComparator implements ValueComparator
{
	@Override
	public int compare(int val1, int val2) {
	return val2 - val1;}
}

public class OpenClose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {12, 43, 22, 90};
//		ArrayUtils.sort(arr);
		ArrayUtils.sort(arr, new AscComparator());
		for(int ele: arr)
		{System.out.println(ele);}
		 
		System.out.println("---------------");
		
		ArrayUtils.sort(arr, new DescComparator());
		
		
		for(int ele: arr)
		{System.out.println(ele);}
	}

}
