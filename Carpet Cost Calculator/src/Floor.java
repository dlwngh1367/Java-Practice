
public class Floor {

	private double width =0;
	private double length = 0;
	
	
	public Floor(double width, double length) {
		this.length = length;
		this.width = width;
		if(width < 0) {
			
		width = 0;
		}
		else if(length <0) {
		length = 0;
		}
		
		
		
		
		
	}


	public double getArea() {
		
		return width * length;
	}

	
	
	
	
	
	
	
	
	
}
