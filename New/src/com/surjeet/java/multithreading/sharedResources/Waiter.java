package com.surjeet.java.multithreading.sharedResources;

public class Waiter extends Thread {

	SharedObject sharedObject =  new SharedObject();

	public Waiter(SharedObject sharedObject) {
		
		this.sharedObject = sharedObject;
	}

	public void run() {
		synchronized(sharedObject){
			try {
				sharedObject.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Waiter thread is notified !!! ");
	}
}
