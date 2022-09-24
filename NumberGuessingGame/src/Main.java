
/*
 * This class only contains method main, to drive the application.
 */
public class Main {

	 /*Java main method is the entry point of any java program*/
	public static void main(String[] args) {

		User user = new User();
		HighLowGame game = new HighLowGame();
		String CONTINUE_GAME = "Y";
		String EXIT_GAME = "N";
		String shouldContinue = EXIT_GAME;
		//do while statement to repeat the system.
		do{game.reset(); //reset fuelAvailable
			if(shouldContinue.equalsIgnoreCase(CONTINUE_GAME)) {
				
			}	game.run();
			// ask if you want to play again(Yes, No) continuing on any Yes (not case
			// sensitive)
			shouldContinue = user.inputString("Would you like to play again?(Y/N) ");
			//constraint: shouldContine = CONTINUE_GAME
		} while(shouldContinue.equalsIgnoreCase(CONTINUE_GAME));
		//End of the programme
		System.out.println("Program by Student Juho Lee");

		
	}
}
