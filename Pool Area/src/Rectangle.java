
public class Rectangle {
	private double width;
	private double length;
	
	public Rectangle(double width, double length) {
		
		if(width <0 || length <0) {
		if (width <0) {this.width = 0;
		} else 	{this.length = 0;}
		} else {this.length = length;
		this.width = width;}

		
	}

	public double getWidth() {
		return width;
	}

	public double getLength() {
		return length;
	}
	public double getArea() {
		double area;
		
		area = width*length;
		return area;
	}


	
	
	
	
}
