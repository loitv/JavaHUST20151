package hust.java.week7.exception.exercise;

import java.util.Scanner;

public class MainProcess2 {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		Hazchem hazchem = null;
		String continues = "y", change;
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

			// Ask user for changing code
			System.out.print("Do you want to change this code? (Y/N): ");
			change = sc.nextLine();
			if (change.equalsIgnoreCase("y")) {
				int i = 0, a = 0;
				do {
					i = 0;
					System.out.print("Enter current code: ");
					String currentCode = sc.nextLine();
					if (!currentCode.equals(hazchemCode)) {
						System.out.println("Error! the code you enter not matchs to current code!");
						i++;
					}
				} while (i != 0);
				do {
					System.out.print("Enter new code: ");
					String newCode = sc.nextLine();
					try {
						hazchem.changeCode(newCode, true);
						hazchem.changeCode(newCode);
						System.out.println();
						System.out.println(hazchem);
						hazchem.getAdvise(newCode);
						a++;
					} catch (InvalidHazchemCodeException ihc) {
						ihc.printStackTrace();
						System.out.println();
					}
				} while (a == 0);

			} else {
				continues = "n";
				break;
			}
			// Ask user for continuing
			System.out.print("Do you want to continues? (Y/N): ");
			continues = sc.nextLine();
			System.out.println();
		} while (continues.equalsIgnoreCase("y"));
	}
}
