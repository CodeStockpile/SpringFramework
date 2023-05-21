package com.hib.ManyToOne;

public class Sample {

	public static void main(String[] args) {

	// ABCABCABCEFA
		String str = "ABCABCABCEFA";
		
		int[] freq = new int[str.length()];
		
		char charArr[] = str.toCharArray();
		
		for(int i =0; i < str.length(); i++) {
			
			freq[i] = 1;
			for(int j = i+1; j < str.length(); j++) {
				
				if(charArr[i] == charArr[j]) {
					freq[i]++;
					charArr[j] = 0;
				}
			}
		}

	}

}
