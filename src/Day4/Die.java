package Day4;

import java.util.Random;

public class Die {

	private int face;
	
	public Die() {
		this.face = 1;
	}
	
	public int roll() {
		this.face = new Random().nextInt(5) + 1;
		return face;
	}

	public int getFace() {
		return face;
	}
}
