package com.surjeet.java.SOLID;


// A client should never be forced to implement an interface that it does not use.

interface VegRestaurant{
	void vegMeals();
}

interface NonVegRestaurant{
	void nonVegMeals();
}


class Restaurant1 implements VegRestaurant{

	@Override
	public void vegMeals() {
		System.out.println("Only veg meals...");
	}
	
}

class Restaurant2 implements VegRestaurant, NonVegRestaurant{

	@Override
	public void nonVegMeals() {
		System.out.println("Only veg meals ....");
		
	}

	@Override
	public void vegMeals() {
		System.out.println("Only non-veg meals....");
		
	}
	
}

public class InterfaceSegrgation {

	public static void main(String[] args) {
		Restaurant1 r1 = new Restaurant1();
		r1.vegMeals();
		
		Restaurant2 r2 = new Restaurant2();
		r2.vegMeals();
		r2.nonVegMeals();
		
		
	}
}
