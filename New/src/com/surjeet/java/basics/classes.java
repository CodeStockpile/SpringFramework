package com.surjeet.java.basics;


class Sample_class{
	private int x;   // private variable will not be able to access directly
	public void set(int val) {x= val;}
	public int get() {return x;}
}


public class classes {

	public static void main(String[] args) {
		Sample_class s1 = new Sample_class();
		Sample_class s2 = new Sample_class();
		
		s1.set(12);
		System.out.println(s1.get());
		System.out.println(s2.get());
	//	s1.x = 10;  -> it will give error coz x has been made private(data hiding)
		
		
		
	}

}
