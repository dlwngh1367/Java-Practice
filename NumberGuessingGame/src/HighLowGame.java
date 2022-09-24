
import java.util.Random;


 /*HighLowGame class for fuelAvailable, numberToGuess, MIN and MAX */

public class HighLowGame {
	private User user = new User(); // internal only, no get/set
	private Random random = new Random(); // internal only, no get/set
	private int fuelAvailable;
	private int numberToGuess;
	private static final int MIN = 1; // internal only, no get/set
	private static final int MAX = 10; // internal only, no get/set

	/*
	 * No argument constructor, calls method reset to initialize the game
	 */
	public HighLowGame() {
		reset();
	}

	/*getter for fuelAvailable*/
	public int getFuelAvailable() {
		return fuelAvailable;
	}

	/*setter for fuelAvailable*/
	public void setFuelAvailable(int fuelAvailable) {
		this.fuelAvailable = fuelAvailable;
	}

	/*getter for numberToGuess*/
	public int getNumberToGuess() {
		return numberToGuess;
	}

	/*setter for numberToGuess*/
	public void setNumberToGuess(int numberToGuess) {
		this.numberToGuess = numberToGuess;
	}

	/*
	 * Supervisor wants comments overviewing the method
	 */
	public void reset() {
		// ToDo: See Pseudocode and / or flowchart

		numberToGuess  = random.nextInt(MAX)+1;
		int sum = 0;
		int value=1;
		//Repeat 10 times
		while(value>=MIN && value<=MAX) {
			sum+=value;
			value++;
		}
		//55/2
		fuelAvailable = sum/2;
	}

	/*run program*/
	public void run() {
		// ToDo: See Pseudocode and / or flowchart

		CheckGuessResult checkGuessResult = null;
		String message;
		boolean isWon = false;
		int guessCount = 0;
		int userNumber;
		// output value of fuelAvailable, guess-fuel remaining.
		System.out.println("Guess the number from " + MIN + " to " + MAX);
		System.out.println("You have " + fuelAvailable + " guess-fuel remaining.");
		//constraint of while statement.
		while(fuelAvailable>0 && isWon==false) {
			guessCount = guessCount+1;
			userNumber = user.inputInteger("guess: ");
			
				if((userNumber<=0) || (userNumber>=10)) {
				//output "Input 1~10. Try Again."
				System.out.println("Input 1~10. Try Again.");
			}

			else {
				fuelAvailable = fuelAvailable - userNumber;
				if(fuelAvailable<0) {
					fuelAvailable = 0;
				}
				checkGuessResult = checkGuess(userNumber);	
				isWon = checkGuessResult.isWin() ;
				message = checkGuessResult.getMessage();
				System.out.println(message);
			}

		}//while
		message = reportGameResult(isWon, guessCount);
		System.out.println(message);


	}


	//examines the guess to see if it matches the numberToGuess value. 
	private CheckGuessResult checkGuess(int guess) {
		boolean isWin = false;
		String message;
		//if output matches 
		if (guess == numberToGuess) {
			message = "You guessed the number";
			isWin = true;
		}//if output doesn't match
		else {
			if(guess < numberToGuess) {
		//if output is lower than numberToGuess
				message = "too low, ";
			}
			else {
			//if output is higher than numberToGuess
				message = "too high, ";
			}
			message = message + String.format(
					"%d guess-fuel remaining", fuelAvailable);
		}
		CheckGuessResult checkGuessResult = new CheckGuessResult(message, isWin);
		return checkGuessResult;
	}

	/*
	 * This method writes out a final result of the game (win or lose) as well
	 * as the number of guesses used by the player (i.e. the user).
	 */
	private String reportGameResult(boolean isWon, int guessCount) {
		String message;
		//if output matches "You win! It took you "
		if(isWon) {
			message = "You win! It took you ";
		}
		//if output doesn't match and fuelAvailable is not available anymore
		else {
			message = "You did not win, you used ";
		}
		message = String.format(message + "%d guesses", guessCount);
		return message;
	}
}
