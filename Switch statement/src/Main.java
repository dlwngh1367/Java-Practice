import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//admin:
		
		//assignment 2
		//make-up exams
		//hybrids
	
		//last week we looked at:
		
		//String equality
		
		//if
		boolean condition = false;
		if (condition == true)
			System.out.println("the condition is true");
		
		//if else
		int x = 1;
		if (x > 0) {
			//System.out.println("x is bigger than zero. Let's set it to 0.");
			x = 0;
		}
		//else
			//System.out.println("x is not bigger than zero");
		
		//nested if
		
		//epsilon equality
		//boolean operators OR, AND, NOT
		//logical AND
		//&&
		
		if (true && 2 == 2 && 2 * 3 == 7)
			System.out.println("its all true!");
		
		String size = "large";	//could be large or small
		String colour = "blue";	//could be blue or red
		
		//make an else if block with 4 possibilities
		//for all possible combinations of size and colour
		//and print an object of that size an colour for each combination
		//add a general else for none of the above
		
		
		
		//today we look at:
		
		//switch statement
		
		String month = "feb";
		/*
		switch (month) {
			case "January":
				System.out.println("the first month");
				break;
			case "February":
				System.out.println("the second month");
				break;
			case "March":
				System.out.println("the third month");
				break;
			case "April":
				System.out.println("the fourth month");
				break;
			default:										//works like a final else
				System.out.println("none of the above");
			}*/
		//limitation of switch:
		//	more complex syntax
		//	you can't do >< and other boolean expression - can only do equality
		//	requires break statement to work properly - unintuitive
		
		
		//create your own switch example for the days of the week:
		
		
		
		
		
		
		
		
		
		
		
		//conditional operator
		//structure: (condition) ? value if condition is true : value if condition is false
		
		x = 1;
		int y = (x == 0) ? 1:2;	//if x is zero then y = 1
								//else if x is not zero then y = 2

		//System.out.println("y = "+y);
		
		
		//example without variable initialization:
		//System.out.println((x > 0) ? "x bigger than zero" : "x not bigger than zero");
		
		//create your own conditional operator example such that the variable 'even'
		//is set to true if the variable number is even and false otherwise
		
		
		
		
		
		
		
		
		
		
		//hasNextInt()/hasNextDouble
		
		Scanner input = new Scanner(System.in);
		/*
		System.out.println("please enter an integer");
		
		if (input.hasNextInt()) {	//gets input from user and returns true if it is an int
			System.out.println("the input is "+ input.nextInt()); //returns above input
		}else {
			System.out.println("you have entered an invalid input");
		}
		*/
		//also works with hasNextDouble
		
		//if kahoot
		
		//break
		
		//while loop
		
		int i = 0;						//i is the control variable in this case
										//the value of i controls when the loops ends
		/*
		while (i < 5) {					//there is a condition in the brackets
			System.out.println(i++);	//loop runs until
										//condition NO LONGER met
		}*/
		
		//make a while loop that begins at 9 and prints every 3rd number
		//so 9, 6, 3 and zero
		
		
		
		
		
		
		
		
		//the two loops above are called "definite"
		//because they both run for a specific number of times
		
		//an "indefinite" loop is one that runs for a number of times 
		//that we don't know
		
		//here is an example of an idefinite loop:
		/*
		int num = 1;
		int inpt = 0;
		while (inpt != num) {
			System.out.println("please enter a number: ");
			inpt = input.nextInt();
		}
		*/	

		//definite vs indefinite loops
		
		//input.nextLine();	//clearing the scanner from before
		
		//do while loop - indefinite do while
		String userInput = "";
		/*
		do {				//notice the word DO - MUST execute AT LEAST ONCE
			System.out.println("Please enter a word");
			userInput = input.nextLine(); 
		}while (!userInput.equals("password"));		//notice the semicolon
		*/
		
		//write a do while loop that prints the following numbers: 1,2,4,8,16,32,64
		//using doubling math
		
		
		//loop scope
		
		//indefinite loop challenge:
		//write an indefinite loop that uses hasNextInt()
		//to keep asking for input
		//until an integer is entered
		
	}
	

}
