package com.surjeet.java.multithreading.sharedResources;

public class MainExecutor {

	public static void main(String[] args) {

		SharedObject sharedObject = new SharedObject();
		Waiter waiter = new Waiter(sharedObject);
		Notifier notifier = new Notifier(sharedObject);

		waiter.start();
		notifier.start();

		try {
			waiter.join();
			notifier.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
