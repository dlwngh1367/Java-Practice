
public class Garbage {
	private double weight;
	private double costPerTonne;
		
	public Garbage() {
	
	}
	public double getWeight()	{
		return weight;
	}
		
	public double getCostPerTonne()	{
		return costPerTonne;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public void setCostPerTonne(double costPerTonne) {
		this.costPerTonne = costPerTonne;
	}	
	
	public double costTotal() {		
		double cost = 0;
			
		cost = weight * costPerTonne;
		return cost;
}
}