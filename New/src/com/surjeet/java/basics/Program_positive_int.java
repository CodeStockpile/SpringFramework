package com.surjeet.java.basics;


class PositiveInteger {
	private int x;
	void set(int val) {
		if(val>0) 
		{
			x = val;
		}
	}
	int get() {
		return x;
	}
}

class Account{
	private int balance = 0;
	
	void deposite(int x) {
		if(x>0)
			balance += x;
	}
	
	void withdraw(int x) {
		if((balance - x)>0)
			balance -= x;
	}
	int getBalance() {
		return balance;
	}
}

public class Program_positive_int {

	public static void main(String[] args) {
		
		PositiveInteger p1;
		p1 = new PositiveInteger();
		p1.set(12);
		System.out.println(p1.get());
		
		Account acc1 = new Account();
		acc1.deposite(100);
		acc1.withdraw(20);
		System.out.println(acc1.getBalance());
	}

}
