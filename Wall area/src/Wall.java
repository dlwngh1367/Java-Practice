
public class Wall {

	double width;
	double height;
	

	
	public Wall() {
	
	}



	public Wall(double width, double height) {
		this.width = width;
		this.height = height;
	}



	public double getWidth() {
		return width;
	}



	public double getHeight() {
		return height;
	}
	
	
	public double setWidth(double width) {
		if (width <=0) {
			width = 0;
		}
		this.width = width;
		return width;
	}



	public double setHeight(double height) {
		if (height <=0) {
			height = 0;
		}
		this.height = height;
		return height;
	}
	
	public double getArea() {
		return height*width;
	}
	
	

}
