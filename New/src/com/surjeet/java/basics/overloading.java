package com.surjeet.java.basics;

class SearchUtil
{
	
	static public int search(int arr[], int ele) {
		return search (arr,0,ele);
	}
	
	static public int search(int arr[], int pos ,int ele)
	{
		
		for(int i=pos; i<arr.length;i++)
		{
			if(arr[i] == ele) {
				return i;
						}
		}
		return -1;
	}
}

public class overloading {

	public static void main(String[] args) {
		int arr[] = {10, 20, 30,20, 40,20, 50,20};
		int index;
		index = -1;
		int searchEle = 20;
		
		do {
			index = SearchUtil.search(arr,index+1 ,searchEle);   // no need of initialization due absence attr and presence of static function
			if (index != -1)
			{
				System.out.println("Found at"+ index);
			}
		}while(index != -1);
	}

}
