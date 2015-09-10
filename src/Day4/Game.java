package Day4;

import java.util.Scanner;

public class Game {

	private static Scanner inputData;

	public static void main(String[] args) {
		Match match;
		String player1, player2;
		int rounds;
		int matchs;
		inputData = new Scanner(System.in);
		System.out.print("Enter the name of the 1st player: ");
		player1 = inputData.nextLine();
		System.out.print("Enter the name of the 2nd player: ");
		player2 = inputData.nextLine();
		System.out.print("Enter the number of matchs: ");
		matchs = inputData.nextInt();
		System.out.print("Enter the number of rounds in each match: ");
		rounds = inputData.nextInt();
		
		match = new Match(player1, player2, rounds, matchs);
		match.runMatch();
	}
}
