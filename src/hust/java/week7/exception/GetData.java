package hust.java.week7.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GetData {

	private int getInt() throws IOException {
		int data = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		System.out.println("Enter an integer: ");
		str = br.readLine();
		data = Integer.parseInt(str);
		return data;
	}

	private double getDouble() throws IOException {
		double data = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		System.out.println("Enter a double: ");
		str = br.readLine();
		data = Double.parseDouble(str);
		return data;
	}

	private String getString() throws IOException {
		String data = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		System.out.println("Enter a string: ");
		str = br.readLine();
		data = str;
		return data;
	}

	public void getData() {
		int intData = 0;
		double doubleData = 0;
		String strData = null;
		try {
			intData = getInt();
			doubleData = getDouble();
			strData = getString();
		} catch (IOException e) {
			System.out.println("Could not enter data!");
		}
	}
	
	public static void main(String[] args) {
		GetData gd = new GetData();
		gd.getData();
	}
}
