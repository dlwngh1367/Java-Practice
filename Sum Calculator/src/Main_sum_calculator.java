
public class Main_sum_calculator {

	public static void main(String[] args) {
		simple_calculator calculator = new simple_calculator();
		calculator.setFirstNumber(2);
		calculator.setSecondNumber(5);
		System.out.println("add= " + calculator.getAdditionResult());
		System.out.println("subtract= " + calculator.getSubtractionResult());
		calculator.setFirstNumber(5.25);
		calculator.setSecondNumber(0);
		System.out.println("multiply= " + calculator.getMultiplicationResult());
		System.out.println("divide= " + calculator.getDivisionResult());


	}

}
