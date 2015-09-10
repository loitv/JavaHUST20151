package Day4;

import java.util.ArrayList;

public class Match {

	private Die die;
	private Player player1, player2;
	private int round;
	private int match;
	private ArrayList<Integer> pointPlayer1 = new ArrayList<Integer>();
	private ArrayList<Integer> pointPlayer2 = new ArrayList<Integer>();
	private ArrayList<Integer> matchPoint1 = new ArrayList<Integer>();
	private ArrayList<Integer> matchPoint2 = new ArrayList<Integer>();

	public Match(String initPlayer1, String initPlayer2, int initRound, int initMatch) {
		this.player1 = new Player(initPlayer1);
		this.player2 = new Player(initPlayer2);
		this.round = initRound;
		this.match = initMatch;
		this.die = new Die();
	}

	public void runMatch() {
		this.start();
		this.stop();
		this.displayInfo();
	}

	public void start() {
		System.out.println("--------START GAME!--------");
		for (int i = 0; i < this.match; i++) {
			System.out.println("-------- MATCH " + (i + 1) + " --------");
			for (int j = 0; j < this.round; j++) {
				System.out.println("Round " + (j + 1) + "!");
				System.out.println(player1.getName() + " throw!");
				player1.throwDie(die);
				System.out.println(player2.getName() + " throw!");
				player2.throwDie(die);
				matchPoint1.add(player1.getRoundPoint());
				matchPoint2.add(player2.getRoundPoint());
			}
		}
	}

	public void stop() {
		int point1 = 0;
		int point2 = 0;
		for (int i = 0; i < match; i++) {
			for (int j = 0; j < round; j++) {
				point1 = point1 + matchPoint1.get(round * i + j);
				point2 = point2 + matchPoint2.get(round * i + j);
			}
			pointPlayer1.add(point1);
			pointPlayer2.add(point2);
			point1 = 0; //can luu y
			point2 = 0; //can luu y

		}
		System.out.println("------RESULT!------\n");
		System.out.println("The point " + player1.getName() + " gets in each round:\n" + matchPoint1);
		System.out.println("The point " + player2.getName() + " gets in each round:\n" + matchPoint2);
		System.out.println();
		System.out.println("The point " + player1.getName() + " gets in each match:\n" + pointPlayer1);
		System.out.println("The point " + player2.getName() + " gets in each match:\n" + pointPlayer2);
		System.out.println();
		for (int i = 0; i < match; i++) {
			if (pointPlayer1.get(i) > pointPlayer2.get(i)) {
				player1.incWon();
				System.out.println("Match " + i + ": " + player1.getName() + " wins!" + " (" + player1.getName()
						+ " gets " + pointPlayer1.get(i) + " points, " + player2.getName() + " gets "
						+ pointPlayer2.get(i) + " points.)");
			} else if (pointPlayer1.get(i) < pointPlayer2.get(i)) {
				player2.incWon();
				System.out.println("Match " + i + ": " + player2.getName() + " wins!" + " (" + player1.getName()
						+ " gets " + pointPlayer1.get(i) + " points, " + player2.getName() + " gets "
						+ pointPlayer2.get(i) + " points.)");
			} else {
				System.out.println("Match " + i + ": You are draw!");
			}
		}
	}

	// Display the information of the game
	public void displayInfo() {
		System.out.println();
		System.out.println("-----FINAL RESULT!-----");
		System.out.println();
		System.out.println(player1.getName() + " wins " + player1.getWonMatch() + " matchs");
		System.out.println(player2.getName() + " wins " + player2.getWonMatch() + " matchs");
		System.out.println();

		if (player1.getWonMatch() > player2.getWonMatch()) {
			System.out.println("THE FINAL WINNER IS: " + player1.getName());
		} else if (player1.getWonMatch() < player2.getWonMatch()) {
			System.out.println("THE FINAL WINNER IS: " + player2.getName());
		} else {
			System.out.println("YOU ARE DRAW!");
		}

	}
}
