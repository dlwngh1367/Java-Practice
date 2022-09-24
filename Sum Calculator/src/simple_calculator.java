
public class simple_calculator {
	
	public	double firstNumber;
	public	double secondNumber;
	
	
	public double getFirstNumber() {
		return firstNumber;
	}
	public void setFirstNumber(double firstNumber) {
		this.firstNumber = firstNumber;
	}
	public double getSecondNumber() {
		return secondNumber;
	}
	public void setSecondNumber(double secondNumber) {
		this.secondNumber = secondNumber;
	}
	
	public double getAdditionResult() {
		return this.firstNumber + this.secondNumber;
	}
	
	public double getSubtractionResult() {
		return this.firstNumber - this.secondNumber;
	}
	
	public double getMultiplicationResult() {
		return this.secondNumber * this.firstNumber;
	}
	
	public double getDivisionResult() {
		return this.secondNumber / this.firstNumber;
}
}
