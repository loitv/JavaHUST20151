package hust.java.week4.demo;

import java.util.Scanner;

public class ClassA {

	public int a;
	
	private Scanner sc;

	public int getA() {
		return a;
	}
	
	public void addA() {
		sc = new Scanner(System.in);
		System.out.print("Enter a = ");
		this.a = Integer.parseInt(sc.nextLine());
	}

	public void methodA() {
		a = 1;
	}
}
