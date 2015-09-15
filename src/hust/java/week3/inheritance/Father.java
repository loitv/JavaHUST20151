package hust.java.week3.inheritance;

public class Father {

	private int moneyInWallet;
	public Father() {
		moneyInWallet = 100;
	}
	public void withDraw(int amount) {
		moneyInWallet -= amount;
		System.out.println("The money of father remains: " + moneyInWallet);
	}
	public int getMoneyInWallet() {
		return moneyInWallet;
	}
}
