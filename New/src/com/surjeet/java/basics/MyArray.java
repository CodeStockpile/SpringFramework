package com.surjeet.java.basics;

import java.util.Iterator;

class Array implements Iterable<Integer>{
	private Integer arr[];
	private int size;
	private int curPos;
	
	public Array(int size) {
		this.size = size;
		arr = new Integer[size];
		curPos = -1;
		}
	public void add(Integer value) {
		if(curPos < size-1) {
			arr[++curPos] = value;
		}else {
			throw new ArrayIndexOutOfBoundsException("Out of range"+ curPos);
		}
	}
	
	public void print() {
		for(int i=0; i<=curPos; i++) {
			System.out.println(arr[i]);
		}
	}
	
	@Override
	public Iterator<Integer> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
	// inner class
	class ArrayIterator implements Iterator<Integer>{
		
		private int pos = 0;
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return pos <= curPos;
		}
		@Override
		public Integer next() {
			// TODO Auto-generated method stub
			return arr[pos++];
		}
		
	}

}



public class MyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array arr = new Array(3);
		arr.add(22);
		arr.add(90);
		arr.print();
		
		for(Integer val: arr) {
			System.out.println(val);
		}
		
		
		// Supports only when Iterator in Implemented in the class
		
		Iterator<Integer> itr = arr.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}

}
