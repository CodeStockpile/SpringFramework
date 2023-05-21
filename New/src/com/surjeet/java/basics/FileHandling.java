package com.surjeet.java.basics;

import java.io.File;
import java.io.FilenameFilter;

class FileUtils{
	public static void display(File[] files){
		for(File file: files) {
			System.out.println(file.getName());}
		}
}


// --------- for filtering "txt" files method overriding ---
class Filefilter implements FilenameFilter{

	@Override
	public boolean accept(File dir, String name) {
		// TODO Auto-generated method stub
		return name.endsWith("txt");
	}

}

public class FileHandling {

	public static void main(String[] args) throws Exception {
		File basePath = new File("C:\\Users\\Surjeet\\Desktop");
//		System.out.println(basePath.isDirectory());
//		
//		File f1 = new File( basePath, "abc.txt");
//		f1.createNewFile();
//		
//		System.out.println(f1.getPath());
		
		File[] files = basePath.listFiles();
//		FileUtils.display(files);
		
		
		
		/* -- FINDING ONLY SPECIFIC FILE  --- */
		
		File[] Sfiles = basePath.listFiles(new Filefilter());
		FileUtils.display(Sfiles);
	}
	
}
