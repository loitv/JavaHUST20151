package hust.java.week7.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {

	private static Scanner inputData;

	public static void main(String[] args) {
		int x = 0, fx;
		inputData = new Scanner(System.in);
		System.out.print("Enter x: ");
		
		
		while (x == 0) {
			try {
				x = inputData.nextInt();
				fx = 1 / x;
				System.out.println("f(x) = " + fx);
			} catch (ArithmeticException | InputMismatchException inputMisException) {
				System.out.println("You entered not-integer value!\nEnter again: ");
			}
		}
		// catch (ArithmeticException arithException) {
		// System.out.println("Error " + arithException);
		// }
	}
}
