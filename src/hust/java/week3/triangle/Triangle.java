package hust.java.week3.triangle;

public class Triangle {

	Point pointA, pointB, pointC;

	public Triangle(Point pointA, Point pointB, Point pointC) {
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;
	}

	public void displayTriangle() {
		pointA.displayPoint();
		pointB.displayPoint();
		pointC.displayPoint();
	}

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public static boolean isRightTriangle(Triangle abc) {

		double d1 = Point.calculateDistanceTwoPoint(abc.getPointA(), abc.getPointB());
		double d2 = Point.calculateDistanceTwoPoint(abc.getPointB(), abc.getPointC());
		double d3 = Point.calculateDistanceTwoPoint(abc.getPointA(), abc.getPointC());

		if (Math.abs(d1 * d1 - d2 * d2 - d3 * d3) < 0x1p-32 || Math.abs(d2 * d2 - d1 * d1 - d3 * d3) < 0x1p-32
				|| Math.abs(d3 * d3 - d1 * d1 - d2 * d2) < 0x1p-32) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Point point1 = new Point(1, 1);
		Point point2 = new Point(1, -1);
		Point point3 = new Point(-2, -1);
		Triangle xyz = new Triangle(point1, point2, point3);

		if (isRightTriangle(xyz)) {
			System.out.println("La tam giac vuong");
		} else {
			System.out.println("Ko la tam giac vuong");
		}
	}
}
