package com.surjeet.java.basics;

/* 
 * FileInputStream - for reading the content from file
 * 		int read()  - reads 1 byte and returns it , -1 if it id EOF
 * 		int read(byte[] buffer) - reads into buffer and returns number
 * 									of bytes read.
 * FileOutputStream - for writing the content to the file.
 * 		write(int) - writes 1 byte i.e. the last byte of the given value
 * 		write(byte[] buffer) - writes the entire buffer
 * 		write(byte[] buffer, int start, int n) - writes n bytess form
 * 												the given start index
 * 
 * */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class FIleCopy {

	public static void main(String[] args) throws IOException {
		File basePath = new File("C:\\Users\\Surjeet\\Desktop");
		File srcFile = new File(basePath, "src.txt");
		File destFile = new File(basePath, "dest.txt");
		
		
		FileInputStream fileIn = new FileInputStream(srcFile);
		FileOutputStream fileOut = new FileOutputStream(destFile);
		
		/* ------ READING I BYTE AT A TIME ---- */
//		int value;
//		while((value = fileIn.read()) != -1) {
//			fileOut.write(value);
//		}
		
		byte[] buffer = new byte[1024];
		int n;
		
		while((n= fileIn.read(buffer))> 0) {
			fileOut.write(buffer, 0, n);
		}
		System.out.print("Copied ...");
		
		fileIn.close();
		fileOut.close();
	}

}
