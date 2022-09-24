
public class Circle {

	private double radius;

	
	
	public Circle(double radius) {
		if(radius <0) {
			this.radius = 0;
		}
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		double calculatedArea = getRadius() * getRadius() * Math.PI;
		return calculatedArea;
	}
	
	
	
	
	
	
	
	
	
}
