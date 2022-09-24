
	/*Java Scanner*/
import java.util.Scanner;

public class PotatoChip {
	 /*Java main method is the entry point of any java program*/
	public static void main(String[] args) {
		
		int Goodbags = 0;
		int Badbags = 0;
		int Totalbags = 0;
		
		PotatoChipBag bag = new PotatoChipBag();
		// (other variables as needed)
		User user = new User();
		
	while(true)	{
		// ask for bag size (as an integer, use the constants from PotatoChipBag
		bag.setSize(user.inputInteger("Enter bag size: \n" + "1 for regular size \n" + 
			"2 for large size "));
		
		if (bag.getSize() == 1 || bag.getSize() == 2) { 
				
			// output"Enter weight: " using user.inputDouble(String message) method
				bag.setWeight(user.inputDouble("Enter weight: "));

			// determine if the bag is good or bag
			// increment a bag counts for good, total
			if (bag.isBagCorrectWeight() == true ) {
				Goodbags++;
				Totalbags = Goodbags + Badbags;}
		
			// determine if the bag is good or bag
			// increment a bag counts for bad, total
			else {Badbags++;
			Totalbags = Goodbags + Badbags;}
			// print out the good, bad, total bags
			System.out.println("Good bags: " + Goodbags);
			System.out.println("Bad bags: " + Badbags);
			System.out.println("Total bags: " + Totalbags);

		
		  }	else {System.out.println("invalid bag size entered ");}
				
			System.out.println("Program by Juho Lee ");	
			// ask if there is more data (Yes, No) continuing on any Yes (not case
			// sensitive)
			System.out.println("Continue Program? (yes/no)");
			
			Scanner keyboard = new Scanner(System.in);
			String option = keyboard.nextLine(); //Prompt the user for inputs for options
			String yes = option;
			String no = option;
			
			//Go back to start
			if (yes.equalsIgnoreCase("yes")) {
				continue;
			//End of the programme	
			} else {System.out.println("Program has shut down");
				break;}
				
			
			} 	
		}
	}