package hust.java.week5.abstractDemo.fishTank;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Fish {

	private String species;
	private double minPH;
	private double maxPH;
	private String appropriateSalinity;
	private String temperature;
	private boolean ferocius;

	private Fish[] fishArray = new Fish[200];
	private int currentFishNumber;

	private Scanner sc;

	public Fish(String species, double minPH, double maxPH, String salinity, String temperature, boolean ferocius) {
		this.species = species;
		this.minPH = minPH;
		this.maxPH = maxPH;
		this.appropriateSalinity = salinity;
		this.temperature = temperature;
		this.ferocius = ferocius;
	}

	public Fish() {
		this.species = null;
		this.minPH = 0;
		this.maxPH = 0;
		this.appropriateSalinity = null;
		this.temperature = null;
		this.ferocius = true;
	}

	public void createFishManually() {
		sc = new Scanner(System.in);

		for (int i = 0; i < 100; i++) {
			System.out.print("Species Name: ");
			this.species = sc.nextLine();
			System.out.print("Minimum pH (0 - 14.0): ");
			this.minPH = Double.parseDouble(sc.nextLine());
			System.out.print("Maximum pH (0 - 14.0): ");
			this.maxPH = Double.parseDouble(sc.nextLine());
			System.out.print("Appropriate Salinity (F, B, S): ");
			this.appropriateSalinity = sc.nextLine();
			System.out.print("Type of temperature (T = Tropic or P = Pacific): ");
			String str = sc.nextLine();
			if (str.equalsIgnoreCase("t")) {
				this.temperature = "Tropic";
			} else if (str.equalsIgnoreCase("p")) {
				this.temperature = "Pacific";
			}
			System.out.print("Is Ferocius? (Y/N): ");
			String str1 = sc.nextLine();
			if (str1.equalsIgnoreCase("y")) {
				this.ferocius = true;
			} else if (str1.equalsIgnoreCase("n")) {
				this.ferocius = false;
			}

			Fish fish = new Fish(getSpecies(), getMinPH(), getMaxPH(), getAppropriateSalinity(), getTemperature(),
					isFerocius());
			fishArray[i] = fish;

			currentFishNumber++;

			System.out.println("Do you want to continues? (Y/N): ");
			String str2 = sc.nextLine();
			if (str2.equalsIgnoreCase("n")) {
				break;
			}
		}

	}

	public void createFishAutomaticaly() {
		DecimalFormat df = new DecimalFormat("0.00");

		for (int i = 0; i < 100; i++) {
			setSpecies("Species_".concat(Integer.toString(i + 1)));
			double minPH = new Random().nextInt(5) + new Random().nextDouble();
			double maxPH = new Random().nextInt(5) + new Random().nextDouble() + 8;
			setMinPH(Double.parseDouble(df.format(minPH)));
			setMaxPH(Double.parseDouble(df.format(maxPH)));
			String[] salinity = { "F", "B", "S" };
			setAppropriateSalinity(salinity[new Random().nextInt(3)]);
			String[] temperature = { "Pacific", "Tropic" };
			setTemperature(temperature[new Random().nextInt(2)]);
			int num = new Random().nextInt(2);
			if (num == 0) {
				setFerocius(true);
			} else {
				setFerocius(false);
			}
			currentFishNumber++;

			Fish fish = new Fish(getSpecies(), getMinPH(), getMaxPH(), getAppropriateSalinity(), getTemperature(),
					isFerocius());
			fishArray[i] = fish;
		}
	}

	public String toString() {
		return species + " " + Double.toString(minPH) + " " + Double.toString(maxPH) + " " + appropriateSalinity + " "
				+ temperature + " " + Boolean.toString(ferocius);
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public double getMinPH() {
		return minPH;
	}

	public double getMaxH() {
		return maxPH;
	}

	public String getAppropriateSalinity() {
		return appropriateSalinity;
	}

	public String getTemperature() {
		return temperature;
	}

	public boolean isFerocius() {
		return ferocius;
	}

	public double getMaxPH() {
		return maxPH;
	}

	public void setMaxPH(double maxPH) {
		this.maxPH = maxPH;
	}

	public void setMinPH(double minPH) {
		this.minPH = minPH;
	}

	public void setAppropriateSalinity(String appropriateSalinity) {
		this.appropriateSalinity = appropriateSalinity;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	public void setFerocius(boolean ferocius) {
		this.ferocius = ferocius;
	}

	public Fish[] getFishArray() {
		return fishArray;
	}

	public void setFishArray(Fish[] fishArray) {
		this.fishArray = fishArray;
	}

	public int getCurrentFishNumber() {
		return currentFishNumber;
	}

	public void setCurrentFishNumber(int currentFishNumber) {
		this.currentFishNumber = currentFishNumber;
	}

}
