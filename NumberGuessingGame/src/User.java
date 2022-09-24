
/*Java Scanner class*/
import java.util.Scanner;

/*User class for the methods*/
public class User {
	
	private Scanner keyboard = new Scanner(System.in);
	
	/*inputInteger method for guess */
	public int inputInteger() {
		int value = keyboard.nextInt();
		keyboard.nextLine();
		return value;
	}
	
	/* inputInteger method with parameter for the output*/
	public int inputInteger(String message) {
		System.out.println(message);
		int value = inputInteger();
		return value;
	}
	
	/*inputDouble method for double value*/
	public double inputDouble() {
		double value = keyboard.nextDouble();
		keyboard.nextLine();
		return value;	
	}
	/*inputDouble method with parameter for the String message*/
	public String inputString(String message) {
		System.out.print(message);
		String value = inputString();
		return value;
	}
	/*inputDouble method without parameter for the String message*/
	public String inputString() {
		//String value = keyboard.next();
				String value = keyboard.nextLine();
		return value;
		
	}
	/*inputDouble method with parameter for double value*/
	public double inputDouble(String message) {
		System.out.println(message);
		double value = inputDouble();
		return value;
	}
}