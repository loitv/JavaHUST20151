package hust.java.week7.exception.exercise;

import java.util.Scanner;

public class MainProcess {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		Hazchem hazchem = null;
		String continues = "y";
		do {
			int count = 0;
			do {
				System.out.print("Enter a HAZCHEM code (example: 1XE, 1Z): ");
				String code = sc.nextLine();
				try {
					hazchem = new Hazchem(code, true);
					count++;
				} catch (InvalidHazchemCodeException ihc) {
					ihc.printStackTrace();
					System.out.println();
				}
			} while (count == 0);
			String hazchemCode = hazchem.getCode();
			// Ask for reverse
			char[] reverseArray = { 'S', 'T', 'Y', 'Z' };
			int k = 0;
			for (int i = 0; i < reverseArray.length; i++) {
				if (hazchemCode.charAt(1) == reverseArray[i]) {
					k++;
				}
			}
			if (k == 1) {
				System.out.print("Is the " + Character.toString(hazchemCode.charAt(1)) + " reverse coloured? (Y/N): ");
				String str = sc.nextLine();
				if (str.equalsIgnoreCase("y")) {
					hazchem.setReverse(true);
				} else {
					hazchem.setReverse(false);
				}
			} else {
				hazchem.setReverse(false);
			}

			// Display advise for user
			System.out.println();
			System.out.println(hazchem);
			hazchem.getAdvise(hazchemCode);
			
			// Ask user for continuing
			System.out.print("Do you want to continues? (Y/N): ");
			continues = sc.nextLine();
			System.out.println();
		} while (continues.equalsIgnoreCase("y"));
	}
}
