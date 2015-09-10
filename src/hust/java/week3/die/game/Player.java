package hust.java.week3.die.game;

import java.io.IOException;
import java.util.Scanner;

public class Player {

	private String name;
	private int point;
	private Scanner sc;
	private int wonMatch;

	public Player(String initName) {
		this.name = initName;
		this.point = 0;
		this.wonMatch = 0;
	}

	public void throwDie(Die die) {
		int currentThrow;
		sc = new Scanner(System.in);
		System.out.print("Press enter to throw your die");
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		sc.nextLine();
		currentThrow = die.roll();
		this.point += currentThrow;
		System.out.println(currentThrow + " potins!\n");
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public String getName() {
		return name;
	}

	public int getWonMatch() {
		return wonMatch;
	}

	public void setWonMatch(int wonMatch) {
		this.wonMatch = wonMatch;
	}
	
}
