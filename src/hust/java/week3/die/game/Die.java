package hust.java.week3.die.game;

import java.util.Random;

public class Die {

	private int face;
	
	public int  roll() {
		this.face = new Random().nextInt(6) + 1;
		return face;
	}
	
	public int getFace() {
		return this.face;
	}
}
