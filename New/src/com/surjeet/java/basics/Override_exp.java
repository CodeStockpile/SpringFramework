package com.surjeet.java.basics;


class Person{
	private String name;
	
	public void setName(String name) { this.name = name;}
	
	public void print() { System.out.println("Name -" + name);}
}

class Contact extends Person {
	
	private String address;
	
	public void SetAddr(String address) { this.address = address;}
	
	@Override
	public void print() {
		super.print();	// call the super class method
		System.out.println("Address - "+address);}
}

public class Override_exp {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.setName("JKL");
		p1.print();
		
		
		
		Contact c2 = new Contact();
		c2.setName("Masacutti");
		c2.SetAddr("X-nagar");
		c2.print();

	}
	

}
