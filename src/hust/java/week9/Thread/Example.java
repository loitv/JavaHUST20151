package hust.java.week9.Thread;

public class Example {

	public void A() {
		System.out.println("A");
	}
	
	public static void main(String[] args) {
		Example obj = new Example() {
			public void A() {
				System.out.println("B");
			}
		};
		obj.A();
	}
}
