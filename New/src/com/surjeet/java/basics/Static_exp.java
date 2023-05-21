package com.surjeet.java.basics;

/* Static members -

 *   - shared by all the objects of the class
 *   - No need for objects
 *   - static .....can only access .... other static members directly
 *
 */

/*
 * Sometimes it is good to avoid creation and declare the methods as static
 * so that the members are accessible directly using the class name without the need of object creation / instantiation
 * Ideal for utilities.
 * NOTE: But it is not always the case
 */


class Students{
	
	// static members/class members - related to class-> cannot access the non-static data directly
	/* No need to initialize the object */
	private static String board;
	public static void writeToBoard(String s) 
	 {
		board = s;
	}
	
	// non static - related to objects(Students)
	private String notes;
	public void writeNote(String s)
	{
		notes = s;
	}
	
	public void print() {
		
		System.out.println("Content on Board - " + board);
		System.out.println(notes);
	}
}

public class Static_exp {

	public static void main(String[] args) {
		
		Students.writeToBoard("Witten on the Board !!");  // no need to initialize the object
		
		Students s1 = new Students();
		Students s2 = new Students();
		
		s1.writeNote("My Crush is Fucking ass!");
		s2.writeNote("She is my !!");
		s1.print();
		s2.print();
		System.out.println();
		System.out.println();
		
		
		s1.writeToBoard("Witten by Alex !");
		s1.print();
		s2.print();
		
		System.out.println();
		
		s2.writeToBoard("Written by BOB !!");
		s2.print();
		s1.print();
	}

}
