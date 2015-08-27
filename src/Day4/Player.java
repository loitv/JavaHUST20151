package Day4;

import java.io.IOException;
import java.util.Scanner;

public class Player {

	private String name;
	private int point;
	private int wonMatch;
	private Scanner presskey;
	
	//Ham khoi tao
	public Player(String initName) {
		this.name = initName;
		this.point = 0;
	}
	
	public void throwDie(Die die) {
		int currentThrow;
		presskey = new Scanner(System.in);
		System.out.println("Press Enter to throw your die!");
		try {
			System.in.read();
		} catch(IOException e) {
			e.printStackTrace();
		}
		presskey.nextLine();
		currentThrow = die.roll();
		this.point += currentThrow;
		System.out.println(currentThrow + " points");
	}
	
	public void setPoint(int point) {
		this.point = point;
	}
	
	public int getPoint() {
		return this.point;
	}
	
	public void setwonMatch(int wonMatch) {
		this.wonMatch = wonMatch;
	}
	
	public int getWonMatch() {
		return wonMatch;
	}
	
	public String getName() {
		return this.name;
	}
}
