package com.surjeet.java.Lambda;
import java.util.Arrays;
import java.util.Comparator;


public class LambdaExp3 {

	public static void main(String[] args) {
		String arr[] = {"wed", "kil", "olo", "jik", "yu"};
		
		
		
		//Arrays.sort(arr);
		
		Arrays.sort(arr, new SortDesc()); // sorts in descending order of alphabets
		
		//System.out.println(arr); // retruns the array object
	
		/*---------Anonymous function ----------------*/
		
		Arrays.sort(arr, new Comparator<String>(){
			@Override
			public int compare(String o1, String o2) {

				return -1*o1.compareTo(o2);
			}
			
			
		});
		
		System.out.println(Arrays.toString(arr)); //sorts alphabetically
		
		/*----- Lambda function ---------*/
		Arrays.sort(arr, (o1, o2)-> -1*o1.compareTo(o2));
		
		System.out.println(Arrays.toString(arr)); //sorts alphabetically in reverse
		
		/*--- Lambda with reference method -----------*/
		// - not good for computational logic
		Arrays.sort(arr, String::compareTo);
		System.out.println(Arrays.toString(arr)); //sorts alphabetically
		

	}

}

class SortDesc implements Comparator <String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return -1*o1.compareTo(o2);
	}
	
	
	
}
