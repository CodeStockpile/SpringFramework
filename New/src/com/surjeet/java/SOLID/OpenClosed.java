package com.surjeet.java.SOLID;


// Objects or entities are open for extension and closed for modifications

interface ValueComparator{
	 int compare(int a, int b); 
}

class AscComparator implements ValueComparator{

	@Override
	public int compare(int a, int b) {

		return a - b;
	}
	
}


class DescComparator implements ValueComparator{

	@Override
	public int compare(int a, int b) {
		return b - a;
	}
	
}

class ArrayUtils{
	
	
	// declare final so that it cannot be modified
	
	public static final void sort(int arr[], ValueComparator comparator) {
		for(int i=0; i< arr.length; i++) {
			for(int j=i+1 ;j<arr.length; j++) {
					if(comparator.compare(arr[i], arr[j]) > 0) {
						int temp = arr[i];
						arr[i] =arr[j];
						arr[j] = temp;
					}
			}
		}
	}
	
	
}


public class OpenClosed {
	
	public static void main(String[] args) {
		
		int arr[] = {12, 34, 2, 90};
		ArrayUtils.sort(arr,new  DescComparator());
		
		for(int ele : arr) {
			System.out.println(ele);
		}
	}
}
