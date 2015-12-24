package hust.java.week9.Thread;

public class PingPongRunable implements Runnable {

	private String word;
	private int delay;

	PingPongRunable(String s, int d) {
		this.word = s;
		this.delay = d;
	}

	public void run() {
		try {
			for (int i = 1; i <= 10; i++) {
				System.out.print(word + "" + i);
				Thread.sleep(delay);
			}
		} catch (InterruptedException e) {
			System.out.println("Thread" + word + "interrupted.");
		}
	}
}
