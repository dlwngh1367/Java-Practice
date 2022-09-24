
public class ComplexNumber {

	private double imaginary;
	private double real;
	
	
	
	public ComplexNumber(double real, double imaginary) {
		 this.imaginary = imaginary;
		 this.real = real;
	}



	public double getImaginary() {
		return imaginary;
	}



	public void add(double imaginary, double real) {
		this.real = real + this.real;
		this.imaginary = imaginary + this.imaginary;
		
	}
	
	public double add(ComplexNumber a) {
		
		return real+imaginary;
	}



	public double getReal() {
		return real;
	}



	public void subtract(double real, double imaginary) {
		this.imaginary = this.imaginary-imaginary;
		this.real = this.real - real;
	}
	
	public void subtract(ComplexNumber b) {
		this.imaginary = this.imaginary-b.imaginary;
		this.real = this.real - b.real;
		
	}
	
	
	
	
}
