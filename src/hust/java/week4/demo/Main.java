package hust.java.week4.demo;

public class Main {
	
	ClassB clB = new ClassB();
	ClassA clA = new ClassA();
	
	public void run() {
		clA.methodA();
		System.out.println(clA.getA());
		clB.methodB();
	}

	public static void main(String[] args) {
//		ClassB clB = new ClassB();
//		ClassA clA = new ClassA();
//		clA.methodA();
//		clB.methodB();
//		System.out.println(clB.getB());
		Main main = new Main();
		main.run();
	}
}
