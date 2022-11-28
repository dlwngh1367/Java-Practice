
public class Sweater {
	private double weightOfSweater;
	private double costOfYarnPerOunce;
	
	
	public Sweater() {
		weightOfSweater = 0;
		costOfYarnPerOunce = 0;
	}
	public double getWeightOfSweater()	{
		return weightOfSweater;
	}
		
	public double getCostOfYarnPerOunce()	{
		return costOfYarnPerOunce;
	}
	
	public void setWeightOfSweater(double weightOfSweater) {
		this.weightOfSweater = weightOfSweater;
	}
	
	public void setCostOfYarnPerOunce(double costOfYarnPerOunce) {
		this.costOfYarnPerOunce = costOfYarnPerOunce;
	}	
	
	public double wholeSaleCost() {
		
		double cost = 0;
			
		cost = weightOfSweater * costOfYarnPerOunce;
		return cost;
	}
}

