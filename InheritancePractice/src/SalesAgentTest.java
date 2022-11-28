
/**
   This program is the first test for the SalesAgent class including the subclass. Check the lab slides to ensure you include every item required.
 * @see
 * @author Juho Lee
 */

public class SalesAgentTest {  
	public static void main(String[] args) {
		/** 
		 * main method 
		 * @param 
		 * args arguments from command line 
		 */
		
		// Create SalesAgent Object
		SalesAgent agent = new SalesAgent("Emily", 28);
		// Call a method toString()
		System.out.println(agent.toString());

		// Create SalesSupervisor Object
		SalesSupervisor supervisor = new SalesSupervisor("Christian",22, "Dombroski");
		// Call a method toString()
		System.out.println(supervisor.toString());
	}
}  