package Day4;

public class Match {

	private Die die;
	private Player player1, player2;
	private Player winner;
	private int round;
	
	public Match(String initPlayer1, String initPlayer2, int initRound) {
		this.player1 = new Player(initPlayer1);
		this.player2 = new Player(initPlayer2);
		this.round = initRound;
		this.die = new Die();
	}
	
	public void runMatch() {
		this.start();
		this.stop();
		this.displayInfo();
	}
	
	public void start() {
		System.out.println("Start!");
		for (int i = 1; i < this.round; i++) {
			System.out.println("Round " + i + "--------");
			System.out.println(player1.getName() + " throw!");
			player1.throwDie(die);
			System.out.println(player2.getName() + " throw!");
			player2.throwDie(die);
		}
	}
	
	public void stop() {
		int pointPlayer1, pointPlayer2;
		pointPlayer1 = player1.getPoint();
		pointPlayer2 = player2.getPoint();
		
		if (pointPlayer1 > pointPlayer2) {
			this.winner = this.player1;
		}
		else if (pointPlayer1 < pointPlayer2) {
			this.winner = this.player2;
		}
	}
	
	//Display the information of the game
	public void displayInfo() {
		System.out.println("-----RESULT!-----");
		System.out.println(player1.getName() + " has " + player1.getPoint() + " points");
		System.out.println(player2.getName() + " has " + player2.getPoint() + " points");
		if (this.winner != null) {
			System.out.println("The winner is: " + winner.getName());
		}
		else {
			System.out.println("You are draw!");
		}
		
	}
}
