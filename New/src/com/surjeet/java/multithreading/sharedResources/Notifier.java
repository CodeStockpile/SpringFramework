package com.surjeet.java.multithreading.sharedResources;

public class Notifier extends Thread {

	SharedObject sharedObject =  new SharedObject();

	public Notifier(SharedObject sharedObject) {
		this.sharedObject = sharedObject;
	}
	
	public void run() {
		synchronized(sharedObject) {
			sharedObject.condition = true;
			sharedObject.notify();
		}
	}
	
	
}
