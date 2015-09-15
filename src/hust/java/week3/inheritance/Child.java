package hust.java.week3.inheritance;

public class Child extends Father {

	private int moneyInWallet;
	public Child() {
		moneyInWallet = 20;
	}
	public void getMoney() {
		int increaseMoney = 100 - super.getMoneyInWallet();
		System.out.println("The current money of son: " + (moneyInWallet + increaseMoney));
	}
}
