package com.surjeet.java.basics;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * ObjectOutputStream and ObjectInputStream
 * 
 *  - They decorate the InputStream and OutputStream classes to provide the
 *  	additional functionality for reading and writing objects.
 *  - The corresponding class should implement Serializable interface.
 *  
 *  - Serialization: converting object into stream of bytes.
 *  - Deserialization : converting stream of bytes to objects.
 * 
 * 
 */

public class SerialDeserial {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
	
	Rectangle r1 = new Rectangle(23, 99);
	Rectangle r2 = new Rectangle(33, 88);
		
		
		
	FileOutputStream fileOut = new FileOutputStream("d.dat");
	ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
	
	objOut.writeObject(r1);
	objOut.writeObject(r2);
	
	
	FileInputStream fileIn = new FileInputStream("d.dat");
	ObjectInputStream objIn = new ObjectInputStream(fileIn);
	
	Rectangle x, y;
	x =(Rectangle) objIn.readObject();
	y =(Rectangle) objIn.readObject();
	
	x.print();
	y.print();
	
	
	}

}

class Rectangle implements Serializable{
	private double w;
	private double h;
	private transient double area; // transient data is not serialized
	
	public Rectangle(double w, double h) {
		this.w = w;
		this.h = h;
	}
	
	public double getArea() {
		return w *h; 
	}
	public void print() {
	System.out.println("w: "+ w +" h: "+ h);
	}
		
}
