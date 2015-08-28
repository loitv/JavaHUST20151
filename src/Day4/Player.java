package Day4;

import java.io.IOException;
import java.util.Scanner;

public class Player {

	private String name;
//	private int point;
	private int roundPoint;
	private int wonMatch;
	private Scanner presskey;
	
	//Ham khoi tao
	public Player(String initName) {
		this.name = initName;
//		this.point = 0;
		this.roundPoint = 0;
		this.wonMatch = 0;
	}
	
	public void throwDie(Die die) {
		int currentThrow;
		presskey = new Scanner(System.in);
		System.out.print("Press Enter to throw your die!");
		try {
			System.in.read();
		} catch(IOException e) {
			e.printStackTrace();
		}
		presskey.nextLine();
		currentThrow = die.roll();
//		this.point += currentThrow;
		this.roundPoint = currentThrow;
		System.out.println("You get " + currentThrow + " points.");
		System.out.println();
	}
//	public void setPoint(int newPoint) {
//		this.point = newPoint;
//	}
//	public int getPoint() {
//		return this.point;
//	}
	public int getRoundPoint() {
		return this.roundPoint;
	}
	public void incWon() {
		this.wonMatch = wonMatch +1;
	}
	public int getWonMatch() {
		return wonMatch;
	}
	public String getName() {
		return this.name;
	}
}
