package com.surjeet.java.basics;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.DataInputStream;
import java.io.IOException;

public class DataIO {

	public static void main(String[] args) throws IOException{
		FileOutputStream fileOut = new FileOutputStream("s.dat");
		DataOutputStream dout = new DataOutputStream(fileOut);
		
		int a = 9000;
		float b = 90.8f;
		
		dout.writeInt(a);
		dout.writeFloat(b);
		
		FileInputStream fileIn = new FileInputStream("s.dat");
		DataInputStream din = new DataInputStream(fileIn);
		
		int x = din.readInt();
		float y = din.readFloat();
		
		System.out.println(x);
		System.out.println(y);
		
		fileOut.close();
		fileIn.close();
		
	}

}
