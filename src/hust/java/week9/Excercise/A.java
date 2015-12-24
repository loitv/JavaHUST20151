package hust.java.week9.Excercise;

public class A {

	public static int foo = 10;

	public static void main(String[] args) {
		// if (foo++ == 10) {
		// System.out.print("Y");
		// }
		// if (foo++ == 11) {
		// System.out.print("Y");
		// }
		// if (foo++ == 12) {
		// System.out.print("Y");
		// }
		// if (foo++ == 13) {
		// System.out.print("Y");
		// }
		// if (foo < 15 ? true : false || foo == 10) {
		// System.out.print("Y");
		// }
		// if ((foo++ == 10 ? 100 : (foo == 12 ? 1 : -13)) == 100) {
		// System.out.println("Y");
		// }
		// if ((foo++ == 10 ? 100 : (foo == 12 ? 1 : -13)) == 1) {
		// System.out.println("Y");
		// }
		// if ((foo++ == 10 ? 100 : (foo == 12 ? 1 : -13)) == -13) {
		// System.out.println("Y");
		// }
		float f = (float) Math.sqrt(-4);
		// float f = Float.parseFloat(s);
		if (f != f) {
			System.out.println("Y");
		}

		/*
		 * Khong viet Integer va khong biet gia tri cu the cua MAX_VALUE, hay
		 * dien vao de CT in ra "true" 
		 * int num = ???; 
		 * System.out.println(num == Integer.MAX_VALUE);
		 */
		//	int num = (int) Float.MAX_VALUE; // or
		int num = -1 >>> 1;
		System.out.println(num == Integer.MAX_VALUE);
		
		/*
		 * Cau 4
		 * int foo = 1;
		 * String foo = "#";
		 * assert("#Bar".equals([???]): "assertion#Bar" );
		 * foo = "_";
		 * assert("_Bar".equals([???]): "assertion_Bar" );
		 * foo = "Bar";
		 * assert("BarBar".equals([???]): "assertionBarBar" );
		 * 
		 * Hay dien vao [???] de chuong trinh tren in ra lan luot "assertion#Bar", "assertion_Bar", "assertionBarBar"
		 */
		String foo = "#";
		if("#Bar".equals(foo == "#" ? "#Bar":"_")) System.out.println("assertion#Bar");
		foo = "_";
		if("_Bar".equals(foo + "Bar")) System.out.println("assertion_Bar");
		foo = "Bar";
		if("BarBar".equals(foo + "Bar")) System.out.println("assertionBarBar");
		
	}
}
