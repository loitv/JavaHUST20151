package Day4;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Match match;
		String player1, player2;
		int rounds;
		Scanner inputData = new Scanner(System.in);
		System.out.print("Enter the name of the 1st player: ");
		player1 = inputData.nextLine();
		System.out.print("Enter the name of the 2nd player: ");
		player2 = inputData.nextLine();
		System.out.print("Enter the number of rounds: ");
		rounds = inputData.nextInt();
		
		match = new Match(player1, player2, rounds);
		match.runMatch();
	}
}
