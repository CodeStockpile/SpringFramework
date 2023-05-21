package com.surjeet.java.SOLID;

class Vehicle {
	public static void start() {
		System.out.println("Vehicle started ....");
	}
	
	public static void stop() {
		System.out.println("Vehicle stopped ...");
	}
}
//subclasses
class Car extends Vehicle{
	 public static void start() {
			System.out.println("Car started ....");
		}
		
		public static void stop() {
			System.out.println("Car stopped ...");
		}
	 
}


class Bike extends Vehicle{
	 public static void start() {
			System.out.println("Bike started ....");
		}
		
		public static void stop() {
			System.out.println("Bike stopped ...");
		}
	 
}

public class LiskovSubstitution {
	
	public static void main(String[] args) {
		testDrive(new Bike());
		testDrive(new Car());
		testDrive(new Vehicle());
	} 
	
	static void testDrive(Vehicle vehicle) {
		vehicle.start();
		vehicle.stop();
	}
	
}





 
 // 