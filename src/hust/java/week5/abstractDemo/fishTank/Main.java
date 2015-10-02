package hust.java.week5.abstractDemo.fishTank;

import java.util.Scanner;

public class Main {

	private static Scanner sc;

	public static void main(String[] args) {
		FishTank[] tankArray = new FishTank[25];
		final int MAX_TANK = 25;
		int currentTank = 0;
		
		Fish fish = new Fish();
		boolean quit = false;
		sc = new Scanner(System.in);

		while (!quit) {
			System.out.println("FISH TANK MANAGEMENT");
			System.out.println("1. Add a new fish tank");
			System.out.println("2. Create fish");
			System.out.println("3. Add a new fish into a tank");
			System.out.println("4. Remove a fish from a tank");
			System.out.println("5. Move a fish from a tank to other tank");
			System.out.println("6. Display all the fish in tanks");
			int choose = Integer.parseInt(sc.nextLine());
			
			if (choose == 1) { // Add a new fish tank
				System.out.println("--ADD A NEW FISH TANK--");
				int type, tankSize = 0;
				String typeOfTank = null, name = null, temperature = null;
				double pH = 0, salinity = 0;
				for (int i = 0; i < MAX_TANK; i++) {
					System.out.print("Type of tank (1 = Community tank, 2 = Species tank, 3 = Single tank): ");
					type = Integer.parseInt(sc.nextLine());
					if (type == 1) {
						typeOfTank = "Community tank";
						System.out.print("Size of community tank (1 = Small, 2 = medium, 3 = big): ");
						int size = Integer.parseInt(sc.nextLine());
						if (size == 1) {
							tankSize = 10;
						} else if (size == 2) {
							tankSize = 20;
						} else if (size == 3) {
							tankSize = 40;
						}
					} else if (type == 2) {
						typeOfTank = "Species tank";
						tankSize = 20;
					} else if (type == 3) {
						typeOfTank = "Single tank";
						tankSize = 1;
					}
					System.out.print("Tank name: ");
					name = sc.nextLine();
					System.out.print("Salinity (%): ");
					salinity = Double.parseDouble(sc.nextLine());
					System.out.print("Temperature (P = Pacific or T = Tropic): ");
					String tem = sc.nextLine();
					if (tem.equalsIgnoreCase("P")) {
						temperature = "Pacific";
					} else if (tem.equalsIgnoreCase("T")) {
						temperature = "Tropic";
					}
					System.out.print("pH concentration(0 - 14): ");
					pH = Double.parseDouble(sc.nextLine());

					// Assigning value for tankArray[]
					if (type == 1) {
						tankArray[i] = new CommunityTank(typeOfTank, name, tankSize, salinity, temperature, pH);
					} else if (type == 2) {
						tankArray[i] = new SpeciesTank(typeOfTank, name, tankSize, salinity, temperature, pH);
					} else if (type == 3) {
						tankArray[i] = new SingleTank(typeOfTank, name, tankSize, salinity, temperature, pH);
					}
					currentTank++;

					System.out.println("Do you want to continues?");
					String str = sc.nextLine();
					if (str.equalsIgnoreCase("n")) {
						break;
					}
				}
				// Display all the tank that has created
				for (int i = 0; i < currentTank; i++) {
					System.out.println(tankArray[i]);
				}

			} else if (choose == 2) {
				System.out.println("--CREATE FISH--");
				System.out.println("1. Manually");
				System.out.println("2. Automatically");
				int choose2 = Integer.parseInt(sc.nextLine());
				if (choose2 == 1) {
					fish.createFishManually();
				} else if (choose == 2) {
					fish.createFishAutomaticaly();
				}
				
				int currentFish = fish.getCurrentFishNumber();
				
				for (int i = 0; i < currentFish; i++) {
					System.out.println(fish.getFishArray()[i]);
				}
			} else if (choose == 3) {

			} else if (choose == 4) {

			} else if (choose == 5) {

			} else {
				quit = true;
			}
		}
	}
}
