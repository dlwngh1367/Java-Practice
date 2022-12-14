
public class MeterStick {
	public static final double EXPECTED_LENGTH = 1.0;
	public static final double EPSILON = 0.0001;
	private double length;

	
	/*
	 * default constructor
	 */
	public MeterStick() { 
		this(EXPECTED_LENGTH);
	}
	
	/*
	 * //constructor with parameters
	 */
	public MeterStick(double length) {
		this.length = length;
	}
	
	/*
	 * getter for Length
	 */
	public double getLength() {
		return length;
	}
	
	/*
	 * setter for Length
	 */
	public void setLength(double length) {
		this.length = length;
	}
	
	/*
	 * convert meter value into centimeter value (length x 100)
	 */
	public double toCentimeters() {
		double centimeters;
		centimeters = length * 100;
		return centimeters;
	}
	
	/*
	 * convert meter value into Millimeters value (length x 1000)
	 */
	public double toMillimeters() {
		double millimeters;
		millimeters = length * 1000;
		toString(millimeters);
		return millimeters;
	}
	
	/*
	 * All of the outputs have to be formatted to 5 decimal places(using String.format)
	 */
	public String toString(double option) {
		String report;
		
		report = String.format("MeterStick length : %.5f", option);
		return report ;
	}
		
	/*
	 * verify if the Meter stick is within tolerance
	 */
	public String verify() {
		String report; 
		
		if (getLength() - EXPECTED_LENGTH <= EPSILON
				&& EXPECTED_LENGTH - getLength() <= EPSILON ) {
		report =  "Meter stick is within tolerance of " + toString(EPSILON);
			}
		
		else {report = "Meter stick is not within tolerance of " + toString(EPSILON);}
		 
		return report;

	
	}	
	}

