public class TableTop {
	private double diameter; // in inches
	
	/*
	 * no-argument constructor, sets diameter to zero
	 */
	public TableTop() {
		this(0);
	}
	
	/*
	 * overloaded constructor, accepts diameter, provided to
	 * make the class more convenient for re-use.
	 */
	public TableTop(double diameter) {
		this.diameter = diameter;
	}

	/*
	 * accessor for diameter, in inches
	 */
	public double getDiameter() {
		return diameter;
	}

	/* 
	 * mutator for diameter, in inches
	 */
	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}
	
	/*
	 * worker method that calculates surface area based on diameter
	 */
	public double calculateArea() {
		double area = 0;
		double radius = 0;
		radius = diameter / 2;
		area = Math.PI * Math.pow(radius, 2);
		return area;
	}
}
