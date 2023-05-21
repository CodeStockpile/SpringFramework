package com.surjeet.java.multithreading.basics;

public class ThreadEx {

	public static void main(String[] args) {
		
		MyThread t = new MyThread();
		t.start();
		
		MyRunnableThread rt = new MyRunnableThread();
		Thread t2 = new Thread(rt);
		t2.start();
	

	}

}

class MyThread extends Thread {
	public void run() {
		System.out.println("I am thread 1 ....");
	}
}

class MyRunnableThread implements Runnable {

	@Override
	public void run() {

		System.out.println("I am thread 2 ... ");

	}

}