package Generics;

// Using Printer class of same package

public class Main {

	public static void main(String[] args) {
		
//		Printer <Integer> p = new Printer<Integer>(1212);
//		p.print();
//		
//		
//		// NOT PREFERRD WAY
//		Printer p1 = new Printer ("Nine");
//		p1.print();
//		
//		Printer <Double> p2 = new Printer<Double>(7899.00);
//		p2.print();
//		
//		System.out.println(100 == (int) 100.923);
		
		Printer <Dog> p = new Printer<Dog>(new Dog());
		p.print();
	}

}
