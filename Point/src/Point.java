
public class Point {

	private int x;
	private int y;
	
	
	public Point() {
		super();
	}


	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}
	
	public double distance() {
		double d;
		d=Math.sqrt((getX()-0)*(getX()-0)+(getY()-0)*(getY()-0));
		return d;
	}

	public double distance(Point a) {
		double c;
		c=Math.sqrt((getX()-a.x)*(getX()-a.x)+(getY()-a.y)*(getY()-a.y));
		return c;
	}
	
	public double distance(double a, double b) {
		this.distance()+
		double w;
		w=+Math.sqrt((b.y-a.y)*(b.y-a.y));
		return w;
	}









}