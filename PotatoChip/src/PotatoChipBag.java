
	/*PotatoChipBag class for size, weight, options and tolerance */

	/*declaration of size, weight, regular, regular_weight, large, large_weight, tolerance*/
public class PotatoChipBag {
	private int size; 
	private double weight; 
	public static final int REGULAR = 1;
	private static final double REGULAR_WEIGHT = 9.25; 
	public static final int LARGE = 2;
	private static final double LARGE_WEIGHT = 15.75; 
	private static final double TOLERANCE = 0.01;
	
	/*default constructor*/
	public PotatoChipBag() {
		this(REGULAR, REGULAR_WEIGHT);
	}
	
	/*constructor with parameters*/
	public PotatoChipBag(int size, double weight) {
		this.size = size;
		this.weight = weight;
	}
	
	/*getter for Size*/
	public int getSize() {
		return size;
	}
	
	/*setter for Size*/
	public void setSize(int size) {
		this.size = size;
	}
	
	/*getter for Weight*/
	public double getWeight() {
		return weight;
	}
	
	/*setter for Weight*/
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/*verify if the bag is within tolerance*/
	public boolean isBagCorrectWeight() {
		// default value of boolean method
		boolean result = false;
		// If input is 1
		if (size == 1) {
			//bag size is smaller one
			if (weight - REGULAR_WEIGHT <= TOLERANCE && REGULAR_WEIGHT - weight <= TOLERANCE) 
			{result = true;}
		// If value is out of tolerance
			else {result = false;}
		// If input is 2	
	}	else if (size == 2) {
		// bag size is bigger one
			if (weight - LARGE_WEIGHT <= TOLERANCE && LARGE_WEIGHT - weight <= TOLERANCE) 
			{result = true;}
		// If value is out of tolerance
			else {result = false;}	
	}			
			return result;
	}
	
}
