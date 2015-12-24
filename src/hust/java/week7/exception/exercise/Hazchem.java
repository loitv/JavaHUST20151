package hust.java.week7.exception.exercise;

import java.util.Scanner;

public class Hazchem {
	// member variables
	private String code;
	private boolean reverse;
	private static Scanner sc;

	// Constructor
	public Hazchem(String inputString, boolean reverse) throws InvalidHazchemCodeException {

		// Check if the inputString is valid
		int firstChar = 0;
		char secondChar, thirdChar;
		int check = 0;
		char[] secondCharArray = { 'P', 'R', 'S', 'T', 'W', 'X', 'Y', 'Z' };

		// check input string's length
		if (inputString.length() < 2 || inputString.length() > 3) {
			throw (new InvalidHazchemCodeException("Code must have 2 or 3 characters!"));
		} else {
			// check first character
			try {
				firstChar = Integer.parseInt(inputString.substring(0, 1));
			} catch (NumberFormatException e) {
				throw (new InvalidHazchemCodeException("First character must be Integer and ranges 1-4!"));
			}
			if (firstChar < 1 || firstChar > 4) {
				throw (new InvalidHazchemCodeException("First character must be Integer and ranges 1-4!"));
			} else {
				// check second Character
				secondChar = inputString.charAt(1);
				for (int i = 0; i < secondCharArray.length; i++) {
					if (secondChar != secondCharArray[i]) {
						check++;
					}
					if (check == secondCharArray.length) {
						throw (new InvalidHazchemCodeException("Invalid second character!"));
					}
				}
				// check third character
				if (inputString.length() == 3) {
					thirdChar = inputString.charAt(2);
					if (thirdChar != 'E') {
						throw (new InvalidHazchemCodeException("Third character must be 'E'!"));
					}
				}
			}
		}

		// When inputString is valid
		this.code = inputString;
		this.reverse = reverse;
	}

	public Hazchem(String validCode) {
		this.code = validCode;
	}

	public String getReactive(String validCode) {
		char[] reactiveArray = { 'P', 'S', 'W', 'Y', 'Z' };
		int count = 0;
		for (int i = 0; i < reactiveArray.length; i++) {
			if (validCode.charAt(1) == reactiveArray[i]) {
				count++;
			}
		}
		if (count == 1) {
			return "V";
		} else {
			return "empty";
		}
	}

	public String getProtection(String validCode, boolean reverse) {
		char[] fullProtectionArray = { 'P', 'R', 'W', 'X' };
		int count = 0;
		for (int i = 0; i < fullProtectionArray.length; i++) {
			if (validCode.charAt(1) == fullProtectionArray[i]) {
				count++;
			}
		}
		if (count == 1) {
			return "Full";
		} else {
			if (reverse == false) {
				return "BA";
			} else {
				return "BA for fire only";
			}
		}
	}

	public String getContainment(String validCode) {
		char[] reactiveArray = { 'P', 'R', 'S', 'T' };
		int count = 0;
		for (int i = 0; i < reactiveArray.length; i++) {
			if (validCode.charAt(1) == reactiveArray[i]) {
				count++;
			}
		}
		if (count == 1) {
			return "Dilute";
		} else {
			return "Contain";
		}
	}

	public boolean getEvacution(String validCode) {
		if (validCode.length() == 3) {
			return true;
		} else {
			return false;
		}
	}

	public void changeCode(String inputString, boolean reverse) throws InvalidHazchemCodeException {
		new Hazchem(inputString, reverse);
	}

	public void changeCode(String validCode) {
		sc = new Scanner(System.in);
		char[] reverseArray = { 'S', 'T', 'Y', 'Z' };
		int k = 0;
		for (int i = 0; i < reverseArray.length; i++) {
			if (validCode.charAt(1) == reverseArray[i]) {
				k++;
			}
		}
		if (k == 1) {
			System.out.print("Is the " + Character.toString(validCode.charAt(1)) + " reverse coloured? (Y/N): ");
			String str = sc.nextLine();
			if (str.equalsIgnoreCase("y")) {
				setReverse(true);
			} else {
				setReverse(false);
			}
		} else {
			setReverse(false);
		}
		this.code = validCode;
		System.out.println("Changing code successfully!");
	}

	// Give advise
	public void getAdvise(String hazchemCode) {
		int firstChar = Integer.parseInt(hazchemCode.substring(0, 1));
		boolean reverse = isReverse();
		String reactive = getReactive(hazchemCode);
		String protection = getProtection(hazchemCode, reverse);
		String containment = getContainment(hazchemCode);
		boolean evacution = getEvacution(hazchemCode);

		switch (firstChar) {
		case 1:
			System.out.println("Material:\tJets");
			break;
		case 2:
			System.out.println("Material:\tFog");
			break;
		case 3:
			System.out.println("Material:\tFroam");
			break;
		case 4:
			System.out.println("Material:\tDry agent");
			break;
		}

		// Reactivity
		switch (reactive) {
		case "V":
			System.out.println("Reactivity:\tCan be violently reactive");
			break;
		case "empty":
			System.out.println("Reactivity:\tNot reaction");
			break;
		}

		// Protection Advise
		switch (protection) {
		case "Full":
			System.out.println("Protection:\tFull Protection");
			break;
		case "BA":
			System.out.println("Protection:\tBreathing apparatus, protective gloves");
			break;
		case "BA for fire only":
			System.out.println("Protection:\tBreathing apparatus, protective gloves for fire only");
			break;
		}

		switch (containment) {
		case "Dilute":
			System.out.println("Containment:\tMay be diluted and washed down the drain");
			break;
		case "Conatain":
			System.out.println("Containment:\tMust be contained by any means available");
			break;
		}

		if (evacution) {
			System.out.println("Evacuation:\tConsider evacuation");
		} else {
			System.out.println("Evacuation:\t");
		}
		System.out.println("*****************************");
	}

	public String getCode() {
		return code;
	}

	public boolean isReverse() {
		return reverse;
	}

	public void setReverse(boolean reverse) {
		this.reverse = reverse;
	}

	@Override
	public String toString() {
		return "Hazchem[ code: " + code + ", reversed: " + reverse + " ]\n" + "\n***Emergency action advice***\n";

	}
}
