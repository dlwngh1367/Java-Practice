
public class Assignment03JuhoLee {

	public static void main(String[] args) {
		//Variable declaration
		int roll = 0;
		//Create an array with 10 spaces
		int[] diceRolls = new int[10];
		int totalRolls = 0;
		//for statement to shuffle the dice
		for(int count = 0; count < 1000; count++) {
		//Generate random numbers from 1 to 10
		roll = (int)(Math.random() * 10) + 1 ;
		// adjust 1-10 value to 0-9 for index
		diceRolls[roll - 1] = diceRolls[roll - 1] + 1;
		
		}
		// run a report
		for(int index = 0; index < diceRolls.length; index++) { // crashes
		System.out.printf("Count of %d is: %d%n", (index + 1), diceRolls[index]);
		totalRolls = totalRolls + diceRolls[index];
		}
		System.out.println("Total rolls were: " + totalRolls);
		System.out.println("Program by Juho Lee");

	}

}
