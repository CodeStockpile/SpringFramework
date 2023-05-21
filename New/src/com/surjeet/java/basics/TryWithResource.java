package com.surjeet.java.basics;

/* 
 * FileInputStream - for reading the content from file
 * 		int read()  - reads 1 byte and returns it , -1 if it id EOF
 * 		int read(byte[] buffer) - reads into buffer and returns number
 * 									of bytes read.
 * FileOutputStream - for writing the content to the file.
 * 		write(int) - writes 1 byte i.e. the last byte of the given value
 * 		write(byte[] buffer) - writes the entire buffer
 * 		write(byte[] buffer, int start, int n) - writes n bytes form
 * 												the given start index
 * 
 * */
import java.io.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;


class IOutils{
	public static void copy(OutputStream fileOut, InputStream fileIn) throws IOException {
		byte[] buffer = new byte[1024];
		int n;
		
		while((n= fileIn.read(buffer))> 0) {
			fileOut.write(buffer, 0, n);
		}
	}
	
}

public class TryWithResource {

	public static void main(String[] args) throws IOException {
		File basePath = new File("C:\\Users\\Surjeet\\Desktop");
		File srcFile = new File(basePath, "src.txt");
		File destFile = new File(basePath, "dest.txt");
		
		
		/* -------- Method 1 ----- [Normal] */

//		try {
//			IOutils.copy(fileOut, fileIn);
//			System.out.print("Copied ...");
//		}
//		finally {
//			
//			fileIn.close();
//			fileOut.close();
//		}
		
		/* --- Method 2 ----- [try with resources] */
		
		try(FileInputStream fileIn = new FileInputStream(srcFile);
			FileOutputStream fileOut = new FileOutputStream(destFile);) 
		{
			
			IOutils.copy(fileOut, fileIn);
			System.out.print("Copied ...");
		}

		
	}

}
