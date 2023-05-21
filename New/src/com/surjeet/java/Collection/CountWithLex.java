package com.surjeet.java.Collection;
import java.util.Map;
import java.util.TreeMap;

public class CountWithLex {

	public static void main(String[] args) {
		
		String sentence = "this is a this date is with this";
		String[] words = sentence.split(" ");
		
		Map<String, Integer> wordMap = new TreeMap<String, Integer>();
		
		for(String word: words) {
			Integer count = wordMap.get(word);
			if (count == null)
			{
				count = 1;
			}else
			{
				count = count +1;
			}
			wordMap.put(word, count);
		}
		
		System.out.println(wordMap);

	}

}
