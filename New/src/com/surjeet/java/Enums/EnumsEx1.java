package com.surjeet.java.Enums;

/*
 * Enums :
 *Special data types that enables for a variable to be a set of predefined constants.
 *
 */

enum State {
	STOPPED, 
	STARTRING,
	WAITING;
}

class Machine{
	private State st = State.STOPPED;
	
	public void setState(State state) {
		this.st = state;
	}
	
	public State getState() {
		return this.st;
	}
}

public class EnumsEx1 {

	public static void main(String[] args) {
		
		Machine m1 = new Machine();
		m1.setState(State.STARTRING);
		System.out.println(m1.getState());

	}

}
