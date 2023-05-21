package com.surjeet.java.basics;


/*	this - refers to the current object;
 * 
 * a reference variable that points to the current object on which the operation is being performed.
 * Usages :-
 * 1) Resolving local and instance variable references
 * 2) Constructor invocation from another constructor of the same class.
 * 3) Referencing/returning current object from with in the methods. 
 * */
class Sample2{
	
	private int x;
	
	public void SetX(int x) {
		this.x = x;
		
	}
	
	public int getX() {
		return this.x; // same as- return x;
	}
	public Sample2 getRef() {
		return this;
	}
	
}

public class This_reference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample2 s1, s2;
		s1 = new Sample2();
		s2 = new Sample2();
		
		s1.SetX(29);
		System.out.print(s1.getX());
		
		s2 = s1.getRef();
		System.out.print(s2.getX());
	}

}
