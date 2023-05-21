package com.surjeet.java.basics;

class DSearch{
	
	public static int search(int arr[], int ele) {
		return search(arr, 0,ele);
	}
	
	public static int search(int arr[],int pos, int ele)
	{
		for(int i=pos;i<arr.length; i++) {
			if(arr[i] == ele)
				return i;
		}
		return -1;
	}
}

public class Find_duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10, 20, 30,20, 40, 20,20, 50,20};
		int index = -1;
		int element = 20;
		do {
			index = DSearch.search(arr,index+1, element);
			if(index!= -1)
				System.out.println(index);
			
		}while(index != -1);
		

	}

}
