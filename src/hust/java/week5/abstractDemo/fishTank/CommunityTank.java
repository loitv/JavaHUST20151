package hust.java.week5.abstractDemo.fishTank;

public class CommunityTank extends FishTank {

	public CommunityTank(String tankType, String tankName, int tankSize, double salinity, String temperature,
			double pH) {
		super(tankType, tankName, tankSize, salinity, temperature, pH);
		// TODO Auto-generated constructor stub
	}
	public CommunityTank() {
		super();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean checkFishSuitability(Fish fish) {
		double minPH = fish.getMinPH();
		double maxPH = fish.getMaxH();
		String salinity = fish.getAppropriateSalinity();
		String temp = fish.getTemperature();

		String saliStr;
		if (getSalinity() >= 0 & getSalinity() < 0.5) {
			saliStr = "F";
		} else if (getSalinity() >= 0.5 & getSalinity() < 5) {
			saliStr = "B";
		} else {
			saliStr = "S";
		}

		if (getpH() >= minPH & getpH() <= maxPH & getTemperature().equalsIgnoreCase(temp)
				& saliStr.equalsIgnoreCase(salinity)) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void addFish(Fish fish) {
		// TODO Auto-generated method stub

	}

	@Override
	public Fish removeFish(String species) {
		Fish fish = new Fish();
		return fish;

	}
}
