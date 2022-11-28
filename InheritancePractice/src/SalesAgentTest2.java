/**
   This program is the second test for the SalesAgent class including the subclasses.
 * @see
 * @author Juho Lee
 */
public class SalesAgentTest2 {  
	
	public static void main(String[] args) {
		/** 
		 * main method 
		 * @param 
		 * args arguments from command line 
		 */
		
		// Create SalesAgent Object
		SalesAgent agent2 = new SalesAgent("Sandra", 33);
		// Create SalesSupervisor Object
		SalesSupervisor supervisior2 = new SalesSupervisor("Kamila", 21, "Ottawa");
		// Create SalesChief Object
		SalesChief chief = new SalesChief("Juho", 22, "Algonquin", "IT");

		// Call methods toString()
		System.out.println(agent2.toString());
		System.out.println(supervisior2.toString());
		System.out.println(chief);
	}
}  