package hust.java.week5.abstractDemo.fishTank;

public abstract class FishTank {

	private String tankType;
	private String tankName;
	private int tankSize;
	private double salinity;
	private String temperature;
	private double pH;

	public FishTank() {
		this.tankType = null;
		this.tankName = null;
		this.tankSize = 0;
		this.salinity = 0;
		this.temperature = null;
		this.pH = 0;
	}

	public FishTank(String tankType, String tankName, int tankSize, double salinity, String temperature, double pH) {
		this.tankType = tankType;
		this.tankName = tankName;
		this.tankSize = tankSize;
		this.salinity = salinity;
		this.temperature = temperature;
		this.pH = pH;
	}

	public String getTankType() {
		return tankType;
	}

	public void setTankType(String tankType) {
		this.tankType = tankType;
	}

	public String getTankName() {
		return tankName;
	}

	public void setTankName(String tankName) {
		this.tankName = tankName;
	}

	public double getSalinity() {
		return salinity;
	}

	public void setSalinity(double salinity) {
		this.salinity = salinity;
	}

	public String getTemperature() {
		return temperature;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	public double getpH() {
		return pH;
	}

	public void setpH(double pH) {
		this.pH = pH;
	}

	public int getTankSize() {
		return tankSize;
	}

	public void setTankSize(int size) {
		this.tankSize = size;
	}

	public String toString() {
		return tankType + " " + tankName + " " + Integer.toString(tankSize) + " " + Double.toString(salinity) + " "
				+ temperature + " " + Double.toString(pH);
	}

	public abstract void display();

	public abstract boolean checkFishSuitability(Fish fish);

	public abstract void addFish(Fish fish);

	public abstract Fish removeFish(String species);

}