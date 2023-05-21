package com.training;

public class FristDemo {

	public static void main(String[] args) {
		Car bmw = new Car();
		Car jaguar = new Car();
		
		System.out.println(bmw);
		System.out.println(jaguar);
		
		
		System.out.println(bmw.hashCode());
		System.out.println(jaguar.hashCode());
		
		System.out.println(bmw == jaguar);
		
		bmw = jaguar;
		System.out.println(bmw == jaguar);
		System.out.println(bmw.equals(jaguar));
		
		// == compares the physical address
		// equals check values
		System.out.println("-------------------");
		System.out.println("bmw Hex Address: " + Integer.toHexString(bmw.hashCode()).toUpperCase());
		System.out.println("bmw Identity Hash Adress: "+ System.identityHashCode(bmw));
	}

}

class Car{
	
	private String name;
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	private int price;
}