
public class Fence {
	private double meters; // length of fence
	private double costPerMeter; // cost per meter of fence
	
	/*
	 * no-argument constructor, sets fields to zero
	 */
	public Fence() {
		meters = 0.0;
		costPerMeter = 0.0;
	}

	/*
	 * accessor for meters
	 */
	public double getMeterss() {
		return meters;
	}

	/*
	 * mutator for meters
	 */
	public void setMeters(double meters) {
		this.meters = meters;
	}

	/*
	 * accessor for costPerMeter, in dollars
	 */
	public double getCostPerMeter() {
		return costPerMeter;
	}

	/*
	 * mutator for for costPerMeter, in dollars
	 */
	public void setCostPerMeter(double costPerMeter) {
		this.costPerMeter = costPerMeter;
	}
	
	/*
	 * Worker method to calculate the cost of a Fence
	 * based on the length of the fence in meters, and the costPerMeter
	 * of the fence.
	 */
	public double calculateCost() {
		double cost;
		cost = meters * costPerMeter;
		return cost;
	}
	// printReport() method that should be displayed formatted to two decimal places
	   public String printReport() {
		      double price = this.calculateCost();
		      return String.format("%.2f", price);
		   }

}

