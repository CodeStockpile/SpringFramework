package com.surjeet.java.basics;

import java.util.Scanner;

/**
 * 
 * Cohesion - defines interaction between objects.
 * 		Low cohesion - BAD
 * 		High cohesion - GOOD
 *
 *Coupling - defines the dependency among objects
 *		Tight coupling - Bad
 *		Loose coupling - Good 
 * 
 * **/

interface VideoPlayer {
	void play(String file);
}

class MP4player implements VideoPlayer{

	@Override
	public void play(String file) {
		System.out.println("MP4Player"+ file);
		
	}
	
}

class MOVplayer implements VideoPlayer{
	@Override
	public void play(String file) {System.out.println("Movie Player : "+ file);}
}


//  ----- This class returns an object

class PlayerFactory {
	// method
	public static VideoPlayer getPlayer(String file) {
		if(file.endsWith("mp4")) { return new MP4player();}
		if(file.endsWith("mov")) {return new MOVplayer();}
		return null;
	}
	
}


public class Couple_Cohesion {

	public static void main(String[] args) {

		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String file = scan.nextLine();
		
		 VideoPlayer player = PlayerFactory.getPlayer(file);
		 
		 if(player == null) { System.out.println("Couldnot play the file");}
		 else { player.play(file);}
	}

}
