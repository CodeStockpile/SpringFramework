package com.surjeet.java.basics;


class ArrayUtil {
	
	public static void sort(int arr[]) {
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; i <arr.length;j++)
			{
				if (arr[i]>arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
	}
}

public class OpenClosed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 8, 3, 5, 2, 4};
		ArrayUtil.sort(arr);
		
		for(int ele: arr) {
			System.out.println(ele);
		}

	}

}
