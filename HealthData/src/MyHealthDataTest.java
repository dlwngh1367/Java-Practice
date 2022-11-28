import java.util.*;
/**
 * This is a programme that analyses the patient's data,
 * Draws conclusions, and shows the results to the user. 
 * This system stores vital health information about a patient.
 * 
 * Purpose: This programme analyses and stores the patient's data,
 *          and then shows the results to the user. 
 *          This health system stores health information about a patient virtually.
 * 
 * @author Juho Lee
 * @version 11.0.16
 * @since 1.8.0_342
 */
public class MyHealthDataTest {

	public MyHealthDataTest(){

	}
	/**   
	 * @param args arguments passed from command line
	 */

	public static void main(String[] args) {
		String firstname =null;
		String lastname =null;
		String gender =null;
		int birthYear = 0;
		int currentYear=0;
		double height=0;
		double weight=0;
		
		Scanner scanner = new Scanner(System.in);
		MyHealthData data = new MyHealthData(firstname, lastname, gender, birthYear, currentYear, height, weight);	
		
		
		System.out.println("Enter Your First name:");
		firstname=scanner.nextLine();
		data.setFirstName(firstname);
		
		System.out.println("Enter Your Last name:");
		lastname=scanner.nextLine();
		data.setLastName(lastname);
		
		System.out.println("Enter Your Gender:");
		gender=scanner.nextLine();
		data.setGender(gender);
		
		System.out.println("Enter Your Birth year:");
		birthYear=scanner.nextInt();
		data.setBirthYear(birthYear);
		
		System.out.println("Enter Your Curent year:");
		currentYear=scanner.nextInt();
		data.setCurrentYear(currentYear);
		
		
		
		System.out.println("Enter Your Height:");
		height=scanner.nextDouble();
		data.setHeight(height);
		
		System.out.println("Enter Your Weight:");
		weight=scanner.nextDouble();
		data.setWeight(weight);
		
		
		data.displayMyHealthData();

	}

}