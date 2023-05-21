package com.surjeet.java.basics;


class Point2d {
	
	protected int x, y;			// protected is used to share the attributed to the child class
	public Point2d() {}
	public Point2d(int x, int y ) {
		this.x = x;
		this.y = y;
	}
	
	public void print() {
		System.out.printf("%d, %d", x, y);
	}
}

class Point3d extends Point2d {
	private int z;
	
	public Point3d() {}
	
	public Point3d(int x, int y, int z) {
		super(x, y); 		// access the variables of the super class
		this.z = z;
	}
	
	@Override
	public void print() {
		System.out.printf("%d, %d, %d",x, y, z);
	}
}

public class Contruct_Inherit {

	public static void main(String[] args) {
		
		Point2d p2 = new Point2d();
		p2.x =21;
		p2.print();
		

	}

}
