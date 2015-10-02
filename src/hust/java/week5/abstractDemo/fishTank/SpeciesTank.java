package hust.java.week5.abstractDemo.fishTank;

public class SpeciesTank extends FishTank {

	public SpeciesTank(String tankType, String tankName, int tankSize, double salinity, String temperature,
			double pH) {
		super(tankType, tankName, tankSize, salinity, temperature, pH);
		// TODO Auto-generated constructor stub
	}
	
	public SpeciesTank() {
		super();
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean checkFishSuitability(Fish fish) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void addFish(Fish fish) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Fish removeFish(String species) {
		// TODO Auto-generated method stub
		return null;
	}

}
