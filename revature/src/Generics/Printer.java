package Generics;

//public class Printer<T> {
//
//	T value;
//
//	public Printer(T value) {
//		super();
//		this.value = value;
//	}
//	
//	public void print() {
//		// TODO Auto-generated method stub
//		System.out.println(value);
//	}
//	
//	
//	
//}


public class Printer<T extends Animal> {

	T value;

	public Printer(T value) {
		super();
		this.value = value;
	}
	
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(value);
	}
	
	
	
}

