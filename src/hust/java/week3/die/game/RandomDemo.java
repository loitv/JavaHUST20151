package hust.java.week3.die.game;

import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			int a = new Random().nextInt(6);
			System.out.print(a + " ");
		}
	}
}
