
public class RightAngleTriangle {
	private double adjacent;
	private double opposite;
	
	public RightAngleTriangle() { //default constructor
	}
	
	public RightAngleTriangle(double adjacent, double opposite) { //constructor with parameters
		this.adjacent = adjacent;
		this.opposite = opposite;
	}
	
	public double getAdjacent() { // getter for adjacent
		return adjacent;
	}
	public void setAdjacent(double adjacent) { // setter for adjacent
		this.adjacent = adjacent;
	}
	public double getOpposite() {// getter for opposite
		return opposite;
	}
	public void setOpposite(double opposite) { // setter for opposite
		this.opposite = opposite;
	}
	
	//calculate method#1 to calculate hypotenuse using Math class
	public double calculateHypotenuse() {
		double m1 = Math.pow(adjacent, 2) + Math.pow(opposite, 2);
		double hypotenuse = Math.sqrt(m1);
		return hypotenuse;

	}
	//calculate method#2 to calculate perimeter using method calculateHypotenuse()
	public double calculatePerimeter() {
		double perimeter = adjacent + opposite + calculateHypotenuse();
		return perimeter;
	}
	//calculate method#3 to calculate area
	public double calculateArea() {
		double area = adjacent * opposite /2;
		return area;
	}
	//report method to report calling method calculateHypotenuse()
	public String createReport() {
	    String report = String.format("adjacent %.4f, opposite %.4f, hypotenuse %.4f", 
	           getAdjacent(), getOpposite(),calculateHypotenuse());
	    return report;
	    
	}
 }