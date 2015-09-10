package hust.java.week3.die.game;

import java.util.Scanner;

public class Match {

	private Die die;
	private Player player1, player2;
	private Player winner;
	private int rounds;
	private int matchs;
	private static Scanner inputData;

	public Match(String initPlayer1, String initPlayer2, int initRounds, int initMatchs) {
		this.player1 = new Player(initPlayer1);
		this.player2 = new Player(initPlayer2);
		this.rounds = initRounds;
		this.matchs = initMatchs;
		this.die = new Die();
	}

	public void runMatch() {
		this.start();
		this.displayInfo();
	}

	public void start() {
		int wonMatch1 = player1.getWonMatch();
		int wonMatch2 = player2.getWonMatch();

		System.out.println("Start!");
		for (int j = 1; j <= this.matchs; j++) {
			System.out.println("==========================\nMatch " + j + "\n--------------------------");
			for (int i = 1; i <= this.rounds; i++) {
				System.out.println("Round " + i + "\n--------------------------");
				System.out.println(player1.getName() + " throws!");
				player1.throwDie(die);
				System.out.println(player2.getName() + " throws!");
				player2.throwDie(die);
			}
			if (player1.getPoint() > player2.getPoint()) {
				System.out.println("--------------------------\n" + player1.getName() + " wins this match!\n==========================\n");
				wonMatch1 += 1;
				player1.setWonMatch(wonMatch1);
			} else if (player1.getPoint() < player2.getPoint()) {
				System.out.println("--------------------------\n" + player2.getName() + " wins this match!\n==========================\n");
				wonMatch2 += 1;
				player2.setWonMatch(wonMatch2);
			} else {
				System.out.println("--------------------------\n" + "You are draw this macth!\n==========================\n");
			}

			int finalWon = (this.matchs) / 2 + 1;
			if (wonMatch1 == finalWon) {
				this.winner = this.player1;
				break;
			} else if (wonMatch2 == finalWon) {
				this.winner = this.player2;
				break;
			}

			player1.setPoint(0);
			player2.setPoint(0);
		}
		if (wonMatch1 > wonMatch2) {
			this.winner = this.player1;
		} else if (wonMatch1 < wonMatch2) {
			this.winner = this.player2;
		}
	}

	public void displayInfo() {
		System.out.println("==========================\n-------FINAL RESUILT------");
		System.out.println(player1.getName() + " has " + player1.getWonMatch() + " win matchs!");
		System.out.println(player2.getName() + " has " + player2.getWonMatch() + " win matchs!");
		if (this.winner != null) {
			System.out.println("The winner is: " + winner.getName() + "\n--------------------------\n==========================");
		} else {
			System.out.println("You are draw!\n--------------------------\n==========================");
		}
	}

	public static void main(String[] args) {
		Match match;
		String player1, player2;
		int matchs, rounds;
		inputData = new Scanner(System.in);
		System.out.print("Enter the name of player 1: ");
		player1 = inputData.nextLine();
		System.out.print("Enter the name of player 2: ");
		player2 = inputData.nextLine();
		System.out.print("Enter the number of matchs: ");
		matchs = Integer.parseInt(inputData.nextLine());
		System.out.print("Enter the number of rounds: ");
		rounds = Integer.parseInt(inputData.nextLine());

		match = new Match(player1, player2, rounds, matchs);
		match.runMatch();
	}
}
