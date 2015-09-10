package hust.java.week3.triangle;

public class Point {

	private int a;
	private int b;

	public Point(int inita, int initb) {
		this.a = inita;
		this.b = initb;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public void displayPoint() {
		System.out.println("(" + this.a + "," + this.b + ")");
	}

	public static double calculateDistanceTwoPoint(Point point1, Point point2) {
		double x = Math.pow(point1.getA() - point2.getA(), 2);
		double y = Math.pow(point1.getB() - point2.getB(), 2);
		double distance = Math.sqrt(x + y);
		return distance;
	}
}
