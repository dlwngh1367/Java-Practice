
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		System.out.println("Meter stick checker program.");
		Scanner keyboard = new Scanner(System.in); //create a scanner object
		MeterStick a1 = new MeterStick(); //Instantiate a1 object
		
		
		System.out.println("Enter measured length in meters:"); //Prompt the user for inputs
		double scanner = keyboard.nextDouble(); //1.0001 
		keyboard.nextLine();
		a1.setLength(scanner); // Setting Length using set method
		
		
		System.out.println("Please select from one of the following:");       // options
		System.out.println("1 to validate meter stick");                      // options
		System.out.println("2 to show meter stick length in centimeters");    // options
		System.out.println("3 to show meter stick length in millimeters");    // options
		System.out.println("4 to show meter stick report");                   // options
		 
		double option = keyboard.nextDouble(); //Prompt the user for inputs for options
		keyboard.nextLine();
		
		if (option == 1) { System.out.println(a1.verify()); // if statement for option 1
		
			
			}	else if (option == 2) { // if statement for option 2
			System.out.print(String.format("Centimeters : %.5f\n", a1.toCentimeters()));
			
		}		else if (option == 3) { // if statement for option 3
			System.out.print(String.format("Millimeters : %.5f\n", a1.toMillimeters()));
			
		}		else if(option == 4) {  // if statement for option 4
			System.out.println(a1.toString(scanner));
			
		}		else if(option >= 5 || option <= 0) {  // if statement for out of boundary
			System.out.println("Invalid menu option selected");
		}
		
		
			System.out.println("Program by Juho Lee");
		 
	}

}
