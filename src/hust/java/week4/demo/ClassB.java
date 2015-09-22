package hust.java.week4.demo;

public class ClassB {

	private int b;
	
//	ClassA clA = new ClassA();
	
	public void methodB() {
		ClassA clA = new ClassA();
		 b = clA.getA();
//		clA.methodA();
		System.out.println(getB());
	}
	
	public int getB() {
		return b;
	}
}
